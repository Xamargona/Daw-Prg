package Tr3.UD7_Orientación_objetos.ejer100;

public class Tripulante {

    private String nombre;
    private int edad;
    private String rango;

    public Tripulante(String nombre, int edad, String rango){
        this.nombre = nombre;
        this.edad = edad;
        this.rango = rango;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getRango() {
        return rango;
    }
}
