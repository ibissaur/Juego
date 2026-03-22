/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package juego;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.Animation;
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
public class Ventana_dificultadController implements Initializable {

    @FXML
    private Button Boton_facil;
    @FXML
    private Button Boton_medio;
    @FXML
    private Button Boton_dificil;
    @FXML
    private Button botonRegresar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        animacionBotones();

        cargarVentanaCuadriculas();

    }

    private void cargarVentanaCuadriculas() {

        Boton_facil.setOnAction(event -> {

            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Diseno_cuadricula_facil.fxml"));
                Parent root = loader.load();

                Stage stage = (Stage) Boton_facil.getScene().getWindow();
                Scene scene = new Scene(root);

                stage.setScene(scene);
                stage.setTitle("Cuadricula: dificultad facil");
                stage.centerOnScreen();

            } catch (IOException e) {
                System.out.print("\nError cargando la ventana Diseno_cuadricula_facil");
            }

        });

        Boton_medio.setOnAction(event -> {

            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Diseno_cuadricula_medio.fxml"));
                Parent root = loader.load();

                Stage stage = (Stage) Boton_medio.getScene().getWindow();
                Scene scene = new Scene(root);

                stage.setScene(scene);
                stage.setTitle("Cuadricula: dificultad medio");
                stage.centerOnScreen();

            } catch (IOException e) {
                System.out.print("\nError cargando la ventana Diseno_cuadricula_medio");
            }

        });

        Boton_dificil.setOnAction(event -> {

            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Diseno_cuadricula_dificil.fxml"));
                Parent root = loader.load();

                Stage stage = (Stage) Boton_dificil.getScene().getWindow();
                Scene scene = new Scene(root);

                stage.setScene(scene);
                stage.setTitle("Cuadricula: dificultad dificil");
                stage.centerOnScreen();

            } catch (IOException e) {
                System.out.print("\nError cargando la ventana Diseno_cuadricula_dificil");
            }

        });

        botonRegresar.setOnAction(event -> {

            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Diseno_menu.fxml"));
                Parent root = loader.load();

                Stage stage = (Stage) botonRegresar.getScene().getWindow();
                Scene scene = new Scene(root);

                stage.setScene(scene);
                stage.setTitle("Menú principal");
                stage.centerOnScreen();

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

            } catch (IOException e) {
                System.out.print("\nError cargando la ventana Diseno_menu");
            }

        });

    }

    private void animacionBotones() {
        ScaleTransition pulse = new ScaleTransition(Duration.seconds(1.2), Boton_facil);
        pulse.setToX(1.05);
        pulse.setToY(1.05);
        pulse.setCycleCount(Animation.INDEFINITE);
        pulse.setAutoReverse(true);
        pulse.play();

        ScaleTransition pulse2 = new ScaleTransition(Duration.seconds(1.2), Boton_medio);
        pulse2.setToX(1.05);
        pulse2.setToY(1.05);
        pulse2.setCycleCount(Animation.INDEFINITE);
        pulse2.setAutoReverse(true);
        pulse2.play();

        ScaleTransition pulse3 = new ScaleTransition(Duration.seconds(1.2), Boton_dificil);
        pulse3.setToX(1.05);
        pulse3.setToY(1.05);
        pulse3.setCycleCount(Animation.INDEFINITE);
        pulse3.setAutoReverse(true);
        pulse3.play();
    }

}
