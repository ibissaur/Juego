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
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Gamer
 */
public class Diseno_cuadricula_facilController implements Initializable {

    @FXML
    private TextField cuadroF1;
    @FXML
    private TextField cuadroF2;
    @FXML
    private TextField cuadroF3;
    @FXML
    private TextField cuadroF4;
    @FXML
    private TextField cuadroFR1;
    @FXML
    private TextField cuadroF5;
    @FXML
    private TextField cuadroF6;
    @FXML
    private TextField cuadroF7;
    @FXML
    private TextField cuadroF8;
    @FXML
    private TextField cuadroFR2;
    @FXML
    private Button botonReiniciar;
    @FXML
    private Button botonRegresar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        Numeros num = new Numeros();
        TextField[] cuadros = {cuadroF1, cuadroF2, cuadroF3, cuadroF4, cuadroF5, cuadroF6, cuadroF7, cuadroF8};

        ValidacionRespuestas(num, cuadros);

        botonReiniciar.setOnAction(event -> {

            boolean todoVacio = true;

            for (int i = 0; i < cuadros.length; i++) {
                if (!cuadros[i].getText().isEmpty()) {
                    todoVacio = false;
                    break;
                }
            }

            if (todoVacio) {
                System.out.println("Ya está reiniciado");
                return;
            }

            for (int i = 0; i < cuadros.length; i++) {

                cuadros[i].setText("");
                cuadros[i].setEditable(true);
            }

            System.out.println("Reiniciado correctamente");

            num.setPuntaje(0);
            System.out.println(num.getPuntaje());

        });

        botonRegresar.setOnAction(event -> {

            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Diseno_menu.fxml"));
                Parent root = loader.load();

                Stage stage = (Stage) botonRegresar.getScene().getWindow();
                Scene scene = new Scene(root);

                stage.setScene(scene);
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

    private void ValidacionRespuestas(Numeros num, TextField cuadros[]) {

        for (int i = 0; i < cuadros.length; i++) {

            final int indice = i;
            TextField campo = cuadros[i];

            campo.textProperty().addListener((obs, oldValue, newValue) -> {

                if (!newValue.matches("\\d*")) {
                    campo.setText(newValue.replaceAll("[^\\d]", ""));
                    return;
                }

                if (newValue.isEmpty()) {
                    campo.getStyleClass().removeAll("correcto", "incorrecto");
                    return;
                }

                if (newValue.length() > 2) {
                    campo.setText(oldValue);
                    return;
                }

                int numero;

                try {
                    numero = Integer.parseInt(newValue);
                } catch (NumberFormatException e) {
                    return;
                }

                if (num.validarNumero(numero, indice)) {

                    campo.getStyleClass().removeAll("incorrecto");
                    campo.getStyleClass().add("correcto");
                    campo.setEditable(false);

                    num.setPuntajeAcunmulado(1);
                    System.out.println(num.getPuntaje());

                } else {

                    if (newValue.length() > 1 || oldValue.length() > 1) {
                        return;
                    }

                    if (num.getPuntaje() != 0) {

                        num.eliminarPuntaje(1);
                        System.out.println(num.getPuntaje());
                        campo.getStyleClass().removeAll("correcto");
                        campo.getStyleClass().add("incorrecto");

                    } else {

                        campo.getStyleClass().removeAll("correcto");
                        campo.getStyleClass().add("incorrecto");

                    }

                }
            });
        }
    }

}
