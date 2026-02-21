/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juego;

/**
 *
 * @author Gamer
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Juego extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        

        Parent root = FXMLLoader.load(
            getClass().getResource("/juego/Disenocarga.fxml")
        );

        Scene scene = new Scene(root);

        scene.getStylesheets().add(
            getClass().getResource("/juego/estilos.css").toExternalForm()
        );

        primaryStage.setTitle("Turip");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    

    public static void main(String[] args) {
        launch(args);
    }
}