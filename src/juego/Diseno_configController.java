/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package juego;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.animation.ScaleTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Gamer
 */
public class Diseno_configController implements Initializable {

    @FXML
    private Button botonRegresar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        botonRegresar.setOnAction(event -> {

            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Diseno_menu.fxml"));
                Parent root = loader.load();

                Stage stage = (Stage) botonRegresar.getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.setTitle("Menú principal");
                
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
                
                stage.centerOnScreen();

            } catch (IOException e) {
                System.out.print("Error cargando el menú principal");
            }

        });

    }

}
