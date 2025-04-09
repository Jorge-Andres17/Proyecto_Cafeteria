package co.edu.uniquindio.cafeteria.cafeteria;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CafeteriaApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CafeteriaApp.class.getResource("cafeteria.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Cafeteria");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}