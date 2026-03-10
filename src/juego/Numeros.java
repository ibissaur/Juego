package juego;

public class Numeros {

    private int numero;
    int numCorrectos[] = new int[8];

    public Numeros(int numero) {
        this.numero = numero;
        InMatriz();
    }

    public Numeros() {
        InMatriz();
    }

    public void InMatriz() {
        int numCorrectos[] = new int[8];

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

    public int getNumero() {
        return numero;
    }

    public void setNumCorrectos(int[] numCorrectos) {
        this.numCorrectos = numCorrectos;
    }

    public void verificarResultado(int numero1, int numero2, int numero3, int numero4, int numero5, int numero6,
            int numero7, int numero8) {

    }

}
