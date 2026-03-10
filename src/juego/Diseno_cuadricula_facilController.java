/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package juego;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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

    private Numeros num = new Numeros();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //lógica provisional
        inicializarCuadros();
    }

    private void inicializarCuadros() {

        cuadroF1.textProperty().addListener((obs, oldValue, newValue) -> {

            if (!newValue.matches("\\d*")) {
                cuadroF1.setText(newValue.replaceAll("[^\\d]", ""));
                return;
            }

            if (newValue.isEmpty()) {
                cuadroF1.getStyleClass().removeAll("correcto", "incorrecto");
                return;
            }

            if (newValue.length() > 2) {
                cuadroF1.setText(oldValue);
                return;
            }

            int numero = Integer.parseInt(newValue);

            if (numero == 1) {

                cuadroF1.getStyleClass().removeAll("incorrecto");
                cuadroF1.getStyleClass().add("correcto");

            } else {

                cuadroF1.getStyleClass().removeAll("correcto");
                cuadroF1.getStyleClass().add("incorrecto");

            }

        });

        cuadroF2.textProperty().addListener((obs, oldValue, newValue) -> {

            if (!newValue.matches("\\d*")) {
                cuadroF2.setText(newValue.replaceAll("[^\\d]", ""));
                return;
            }

            if (newValue.isEmpty()) {
                cuadroF2.getStyleClass().removeAll("correcto", "incorrecto");
                return;
            }

            if (newValue.length() > 2) {
                cuadroF2.setText(oldValue);
                return;
            }

            int numero = Integer.parseInt(newValue);

            if (numero == 2) {

                cuadroF2.getStyleClass().removeAll("incorrecto");
                cuadroF2.getStyleClass().add("correcto");

            } else {

                cuadroF2.getStyleClass().removeAll("correcto");
                cuadroF2.getStyleClass().add("incorrecto");

            }

        });

        cuadroF3.textProperty().addListener((obs, oldValue, newValue) -> {

            if (!newValue.matches("\\d*")) {
                cuadroF3.setText(newValue.replaceAll("[^\\d]", ""));
                return;
            }

            if (newValue.isEmpty()) {
                cuadroF3.getStyleClass().removeAll("correcto", "incorrecto");
                return;
            }

            if (newValue.length() > 2) {
                cuadroF3.setText(oldValue);
                return;
            }

            int numero = Integer.parseInt(newValue);

            if (numero == 3) {

                cuadroF3.getStyleClass().removeAll("incorrecto");
                cuadroF3.getStyleClass().add("correcto");

            } else {

                cuadroF3.getStyleClass().removeAll("correcto");
                cuadroF3.getStyleClass().add("incorrecto");

            }

        });

        cuadroF4.textProperty().addListener((obs, oldValue, newValue) -> {

            if (!newValue.matches("\\d*")) {
                cuadroF4.setText(newValue.replaceAll("[^\\d]", ""));
                return;
            }

            if (newValue.isEmpty()) {
                cuadroF4.getStyleClass().removeAll("correcto", "incorrecto");
                return;
            }

            if (newValue.length() > 2) {
                cuadroF4.setText(oldValue);
                return;
            }

            int numero = Integer.parseInt(newValue);

            if (numero == 4) {

                cuadroF4.getStyleClass().removeAll("incorrecto");
                cuadroF4.getStyleClass().add("correcto");

            } else {

                cuadroF4.getStyleClass().removeAll("correcto");
                cuadroF4.getStyleClass().add("incorrecto");

            }

        });

        cuadroF5.textProperty().addListener((obs, oldValue, newValue) -> {

            if (!newValue.matches("\\d*")) {
                cuadroF5.setText(newValue.replaceAll("[^\\d]", ""));
                return;
            }

            if (newValue.isEmpty()) {
                cuadroF5.getStyleClass().removeAll("correcto", "incorrecto");
                return;
            }

            if (newValue.length() > 2) {
                cuadroF5.setText(oldValue);
                return;
            }

            int numero = Integer.parseInt(newValue);

            if (numero == 5) {

                cuadroF5.getStyleClass().removeAll("incorrecto");
                cuadroF5.getStyleClass().add("correcto");

            } else {

                cuadroF5.getStyleClass().removeAll("correcto");
                cuadroF5.getStyleClass().add("incorrecto");

            }

        });

        cuadroF6.textProperty().addListener((obs, oldValue, newValue) -> {

            if (!newValue.matches("\\d*")) {
                cuadroF6.setText(newValue.replaceAll("[^\\d]", ""));
                return;
            }

            if (newValue.isEmpty()) {
                cuadroF6.getStyleClass().removeAll("correcto", "incorrecto");
                return;
            }

            if (newValue.length() > 2) {
                cuadroF6.setText(oldValue);
                return;
            }

            int numero = Integer.parseInt(newValue);

            if (numero == 6) {

                cuadroF6.getStyleClass().removeAll("incorrecto");
                cuadroF6.getStyleClass().add("correcto");

            } else {

                cuadroF6.getStyleClass().removeAll("correcto");
                cuadroF6.getStyleClass().add("incorrecto");

            }

        });

        cuadroF7.textProperty().addListener((obs, oldValue, newValue) -> {

            if (!newValue.matches("\\d*")) {
                cuadroF7.setText(newValue.replaceAll("[^\\d]", ""));
                return;
            }

            if (newValue.isEmpty()) {
                cuadroF7.getStyleClass().removeAll("correcto", "incorrecto");
                return;
            }

            if (newValue.length() > 2) {
                cuadroF7.setText(oldValue);
                return;
            }

            int numero = Integer.parseInt(newValue);

            if (numero == 7) {

                cuadroF7.getStyleClass().removeAll("incorrecto");
                cuadroF7.getStyleClass().add("correcto");

            } else {

                cuadroF7.getStyleClass().removeAll("correcto");
                cuadroF7.getStyleClass().add("incorrecto");

            }

        });

        cuadroF8.textProperty().addListener((obs, oldValue, newValue) -> {

            if (!newValue.matches("\\d*")) {
                cuadroF8.setText(newValue.replaceAll("[^\\d]", ""));
                return;
            }

            if (newValue.isEmpty()) {
                cuadroF8.getStyleClass().removeAll("correcto", "incorrecto");
                return;
            }

            if (newValue.length() > 2) {
                cuadroF8.setText(oldValue);
                return;
            }

            int numero = Integer.parseInt(newValue);

            if (numero == 8) {

                cuadroF8.getStyleClass().removeAll("incorrecto");
                cuadroF8.getStyleClass().add("correcto");

            } else {

                cuadroF8.getStyleClass().removeAll("correcto");
                cuadroF8.getStyleClass().add("incorrecto");

            }

        });

    }

}
