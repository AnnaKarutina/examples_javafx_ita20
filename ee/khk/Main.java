package ee.khk;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Main extends Application{

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {

        Label label = new Label("Hello");               // teksti label
        Button button = new Button("Button");           // nupp
        Group group = new Group(button);                   // sisseehitatud Group sõlm

        FlowPane root = new FlowPane(label, group);        // juursõlm
        Scene scene = new Scene(root, 300, 150);     // Scene loomine
        stage.setScene(scene);                              // Scene määramine Stage jaoks

        stage.setTitle("Hello JavaFX");

        stage.show();
    }
}