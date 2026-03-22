package juego;

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

    public boolean validarNumero(int numero, int posicionNum) {

        if (posicionNum < 0 || posicionNum >= numCorrectos.length) {
            System.out.println("Índice fuera de rango");
            return false;
        }

        return numero == numCorrectos[posicionNum];
    }

}
