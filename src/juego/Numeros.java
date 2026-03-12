package juego;

import javafx.scene.control.TextField;

public class Numeros {

    private int numCorrectos[];
    private int Puntaje;

    public Numeros() {
        numCorrectos = new int[8];
        Puntaje = 0;
        InMatriz();
    }

    public void InMatriz() {

        numCorrectos[0] = 1;
        numCorrectos[1] = 2;
        numCorrectos[2] = 3;
        numCorrectos[3] = 4;
        numCorrectos[4] = 5;
        numCorrectos[5] = 6;
        numCorrectos[6] = 7;
        numCorrectos[7] = 8;
    }

    public int[] getNumCorrectos() {
        return numCorrectos;
    }

    public void setNumCorrectos(int[] numCorrectos) {
        this.numCorrectos = numCorrectos;
    }

    public int getPuntaje() {
        return Puntaje;
    }

    public void setPuntaje(int Puntaje) {
        this.Puntaje = Puntaje;
    }

    public void setPuntajeAcunmulado(int Puntaje) {
        this.Puntaje += Puntaje;
    }

    public void eliminarPuntaje(int Puntaje) {
        this.Puntaje -= Puntaje;
    }

    public void validarNumero(TextField campo, int posicionNum) {

        if (posicionNum < 0 || posicionNum >= numCorrectos.length) {
            System.out.println("Ha ocurrido un error. El Indice esta afuera de rango");
            return;
        }

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

            int numero = Integer.parseInt(newValue);

            if (numero == numCorrectos[posicionNum]) {

                campo.getStyleClass().removeAll("incorrecto");
                campo.getStyleClass().add("correcto");
                setPuntajeAcunmulado(1);
                System.out.println(Puntaje);
                campo.setEditable(false);

            } else {

                if (Puntaje != 0) {
                    eliminarPuntaje(1);
                    System.out.println(Puntaje);
                    campo.getStyleClass().removeAll("correcto");
                    campo.getStyleClass().add("incorrecto");
                }

            }

        });
    }

}
