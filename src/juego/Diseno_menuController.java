/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package juego;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.RotateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Gamer
 */
public class Diseno_menuController implements Initializable {

    @FXML
    private Button botonJuego;
    @FXML
    private Button botonSalir;
    @FXML
    private Label labelMensaje;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        RotateTransition r = new RotateTransition(Duration.millis(200), labelMensaje);
        r.setToAngle(10);

        RotateTransition back = new RotateTransition(Duration.millis(200), labelMensaje);
        back.setToAngle(0);

        labelMensaje.setOnMouseEntered(e -> r.playFromStart());
        labelMensaje.setOnMouseExited(e -> back.playFromStart());
    }

}
