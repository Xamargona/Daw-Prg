package Tr3.UD9_Clases_Avanzadas.ejer128;

public class Coche extends Vehiculo{

    private int puertas;

    public Coche(String matricula, int puertas) {
        super(matricula);
        this.puertas = puertas;
    }

    // Getters && Setters

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
}
