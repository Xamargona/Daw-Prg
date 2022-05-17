package Tr3.UD9_Clases_Avanzadas.ejer128;

public class Remolque {

    private int peso;

    public Remolque(int peso) {
        this.peso = peso;
    }

    public String toString() {
        return "Peso del remolque: "+peso+" Kg";
    }

    // Getters && Setters

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
