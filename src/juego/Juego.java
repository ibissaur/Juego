/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juego;

/**
 *
 * @author Gamer
 */
import javafx.animation.FadeTransition;
import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Juego extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("/juego/Diseno_carga.fxml"));

        Scene scene = new Scene(root);

        scene.getStylesheets().add(getClass().getResource("/juego/diseno_carga.css").toExternalForm());

        FadeTransition fade = new FadeTransition(Duration.seconds(0.5), root);
        fade.setFromValue(0);
        fade.setToValue(1);

        ScaleTransition zoom = new ScaleTransition(Duration.seconds(0.5), root);
        zoom.setFromX(0.8);
        zoom.setFromY(0.8);
        zoom.setToX(1);
        zoom.setToY(1);

        fade.play();
        zoom.play();

        primaryStage.setTitle("Iniciar juego");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
