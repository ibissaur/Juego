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

            } catch (IOException e) {
                System.out.print("\nError cargando la ventana Diseno_menu");
            }

        });
    }
}
