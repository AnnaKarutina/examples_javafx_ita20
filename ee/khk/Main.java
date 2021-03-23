package ee.khk;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.geometry.Orientation;
import javafx.geometry.Insets;

public class Main extends Application{

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Label selectedLbl = new Label();

        RadioButton javaBtn = new RadioButton("Java");
        RadioButton jsBtn = new RadioButton("JavaScript");
        RadioButton csharpBtn = new RadioButton("C#");

        ToggleGroup group = new ToggleGroup();
        // gruppi loomine
        javaBtn.setToggleGroup(group);
        jsBtn.setToggleGroup(group);
        csharpBtn.setToggleGroup(group);

        // vajutuse sündmuse töötlus
        javaBtn.setOnAction(event -> selectedLbl.setText("Selected: Java"));
        jsBtn.setOnAction(event -> selectedLbl.setText("Selected: JavaScript"));
        csharpBtn.setOnAction(event -> selectedLbl.setText("Selected: C#"));

        FlowPane root = new FlowPane(Orientation.VERTICAL, 10, 10);
        root.getChildren().addAll(javaBtn, jsBtn, csharpBtn, selectedLbl);
        root.setPadding(new Insets(10));
        Scene scene = new Scene(root, 250, 200);

        stage.setScene(scene);
        stage.setTitle("RadioButtons in JavaFX");
        stage.show();
    }
}