package ee.khk;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application{

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Hello JavaFX"); // akna pealkiri
        stage.setWidth(250);            // akna laius
        stage.setHeight(150);           // akna pikkus
        stage.show();                   // akna kuvamine ekraanil
    }
}
