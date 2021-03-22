package ee.khk;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {

        Group root = new Group();       // juursõlm
        Scene scene = new Scene(root);  // Scene loomine
        stage.setScene(scene);          // Scene määramine Stage

        stage.setTitle("Hello JavaFX");
        stage.setWidth(300);
        stage.setHeight(150);

        stage.show();
    }
}
