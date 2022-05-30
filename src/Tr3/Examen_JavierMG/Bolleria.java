package Tr3.Examen_JavierMG;

public abstract class Bolleria {

    protected double peso;
    protected double precio;

    public Bolleria(double peso){
        this.peso = peso;
        this.precio = peso/10;
    }

    public abstract String toString();

    public double getPrecio() {
        return precio;
    }
}
