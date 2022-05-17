package Tr3.UD9_Clases_Avanzadas.ejer128;

public class Vehiculo {

    protected String matricula;
    protected int velocidad;

    public Vehiculo(String matricula){
        this.matricula = matricula;
        this.velocidad = 0;
    }

    public String toString() {
        return "Matricula: "+matricula+"\nVelocidad: "+velocidad+" Km/h";
    }

    public void acelerar(int v) throws Exception{
        velocidad = velocidad + v;
    }

    // Getters && Setters

    public String getMatricula() {
        return matricula;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}
