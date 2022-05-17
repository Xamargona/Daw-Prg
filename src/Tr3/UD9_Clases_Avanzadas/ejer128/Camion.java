package Tr3.UD9_Clases_Avanzadas.ejer128;

public class Camion extends Vehiculo{

    private Remolque remolque = null;

    public Camion(String matricula) {
        super(matricula);
    }

    public void acelerar(int v) throws Exception{
        int x = velocidad + v;
        if (x > 100) {
            throw new Exception("Frenando Alonso!");
        } else {
            this.velocidad = x;
        }
    }

    public void ponRemolque(Remolque remolque) {
        this.remolque = remolque;
    }

    public void quitaRemolque() {
        this.remolque = null;
    }

    public String toString() {
        if (remolque != null) {
            return super.toString() + "\nPeso: " + remolque.getPeso();
        } else {
            return super.toString();
        }
    }
}
