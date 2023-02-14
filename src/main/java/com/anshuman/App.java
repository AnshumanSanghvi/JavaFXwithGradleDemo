package com.anshuman;

import java.net.URL;
import java.nio.file.Paths;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        URL sceneLocation = Paths.get("./src/main/resources/fxml/scene.fxml").toUri().toURL();
        Parent root = FXMLLoader.load(sceneLocation);

        Scene scene = new Scene(root);
        URL stylesLocation = Paths.get("./src/main/resources/css/styles.css").toUri().toURL();
        scene.getStylesheets().add(stylesLocation.toExternalForm());

        stage.setTitle("JavaFX and Gradle");
        stage.setScene(scene);
        stage.show();
    }
}