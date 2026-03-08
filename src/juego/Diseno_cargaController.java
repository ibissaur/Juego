package juego;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.Animation;
import javafx.animation.ScaleTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Diseno_cargaController implements Initializable {

    @FXML
    private Button botonIniciar;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        ScaleTransition pulse = new ScaleTransition(Duration.seconds(1.2), botonIniciar);
        pulse.setToX(1.05);
        pulse.setToY(1.05);
        pulse.setCycleCount(Animation.INDEFINITE);
        pulse.setAutoReverse(true);
        pulse.play();

        botonIniciar.setOnAction(event -> {

            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Diseno_menu.fxml"));
                Parent root = loader.load();

                Stage stage = (Stage) botonIniciar.getScene().getWindow();
                Scene scene = new Scene(root);

                stage.setScene(scene);

            } catch (IOException e) {
                System.out.print("Error cargando la ventana Diseno_menu");
            }

        });
    }
}