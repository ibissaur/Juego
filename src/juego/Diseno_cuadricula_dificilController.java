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
public class Diseno_cuadricula_dificilController implements Initializable {

    @FXML
    private Button botonReiniciar;
    @FXML
    private TextField cuadroD1;
    @FXML
    private TextField cuadroD2;
    @FXML
    private TextField cuadroD3;
    @FXML
    private TextField cuadroD4;
    @FXML
    private TextField cuadroD5;
    @FXML
    private TextField cuadroD6;
    @FXML
    private TextField cuadroD7;
    @FXML
    private TextField cuadroD8;
    @FXML
    private TextField cuadroD9;
    @FXML
    private TextField cuadroD10;
    @FXML
    private TextField cuadroD11;
    @FXML
    private TextField cuadroD12;
    @FXML
    private TextField cuadroD13;
    @FXML
    private TextField cuadroD14;
    @FXML
    private TextField cuadroD15;
    @FXML
    private TextField cuadroD16;
    @FXML
    private TextField cuadroD17;
    @FXML
    private TextField cuadroD18;
    @FXML
    private TextField cuadroD19;
    @FXML
    private TextField cuadroD20;
    @FXML
    private TextField cuadroD21;
    @FXML
    private TextField cuadroD22;
    @FXML
    private TextField cuadroD23;
    @FXML
    private TextField cuadroD24;
    @FXML
    private TextField cuadroDR1;
    @FXML
    private TextField cuadroDR6;
    @FXML
    private TextField cuadroDR5;
    @FXML
    private TextField cuadroDR4;
    @FXML
    private TextField cuadroDR3;
    @FXML
    private TextField cuadroDR2;
    @FXML
    private Button botonRegresar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        Numeros num = new Numeros();
        TextField[] cuadros = {cuadroD1, cuadroD2, cuadroD3, cuadroD4, cuadroD5, cuadroD6, cuadroD7, cuadroD8, cuadroD9, cuadroD10, cuadroD11, cuadroD12, cuadroD13, cuadroD14, cuadroD15, cuadroD16, cuadroD17, cuadroD18, cuadroD19, cuadroD20, cuadroD21, cuadroD22, cuadroD23, cuadroD24};

        ValidacionRespuestas(num, cuadros);

        botonReiniciar.setOnAction(event -> {

            for (int i = 0; i < cuadros.length; i++) {

                if (cuadros[i].getText().equalsIgnoreCase("")) {
                    System.out.println("Ya la tabla esta reiniciada");
                    return;
                }
                cuadros[i].setText("");
                cuadros[i].setEditable(true);
            }

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
