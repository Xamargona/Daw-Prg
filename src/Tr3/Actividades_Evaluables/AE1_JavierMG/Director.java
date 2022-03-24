package Tr3.Actividades_Evaluables.AE1_JavierMG;

public class Director {

    private String nombre;
    private int edad;
    private int n_oscar;

    public Director(String nombre, int edad, int n_oscar){
        this.nombre = nombre;
        this.edad = edad;
        this.n_oscar = n_oscar;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getN_oscar() {
        return n_oscar;
    }
}
