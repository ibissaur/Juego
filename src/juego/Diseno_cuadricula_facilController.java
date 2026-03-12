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

        inicializarCuadros();

        botonReiniciar.setOnAction(event -> {

            TextField[] cuadros = {cuadroF1, cuadroF2, cuadroF3, cuadroF4, cuadroF5, cuadroF6, cuadroF7, cuadroF8};

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

    }

    private void inicializarCuadros() {

        num.validarNumero(cuadroF1, 0);
        num.validarNumero(cuadroF2, 1);
        num.validarNumero(cuadroF3, 2);
        num.validarNumero(cuadroF4, 3);
        num.validarNumero(cuadroF5, 4);
        num.validarNumero(cuadroF6, 5);
        num.validarNumero(cuadroF7, 6);
        num.validarNumero(cuadroF8, 7);

    }

}
