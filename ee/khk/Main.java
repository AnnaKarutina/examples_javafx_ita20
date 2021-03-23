package ee.khk;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.scene.control.cell.PropertyValueFactory;

public class Main extends Application{

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        // loome nimekiri
        ObservableList<Person> people = FXCollections.observableArrayList(

                new Person("Tom", 34),
                new Person("Bob", 22),
                new Person("Sam", 28),
                new Person("Alice", 29)
        );
        // määrame tabel ja lisame andmed
        TableView<Person> table = new TableView<Person>(people);
        table.setPrefWidth(250);
        table.setPrefHeight(200);

        // veerg nime kuvamiseks
        TableColumn<Person, String> nameColumn = new TableColumn<Person, String>("Name");
        // määrame veeru vabrik, seose nime jargi
        nameColumn.setCellValueFactory(new PropertyValueFactory<Person, String>("name"));
        // lisame veerg
        table.getColumns().add(nameColumn);

        // veerg vanuse jaoks
        TableColumn<Person, Integer> ageColumn = new TableColumn<Person, Integer>("Age");
        ageColumn.setCellValueFactory(new PropertyValueFactory<Person, Integer>("age"));
        table.getColumns().add(ageColumn);

        FlowPane root = new FlowPane(10, 10, table);

        Scene scene = new Scene(root, 300, 250);

        stage.setScene(scene);
        stage.setTitle("TableView in JavaFX");
        stage.show();
    }
}