package Tr3.UD9_Clases_Avanzadas.ejer131;

import java.util.ArrayList;

public class Plato {

    private String nombre;
    private double precio;
    private ArrayList<Ingrediente> lista = new ArrayList<Ingrediente>();

    public Plato(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}
