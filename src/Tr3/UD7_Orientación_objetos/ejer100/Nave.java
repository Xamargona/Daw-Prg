package Tr3.UD7_Orientación_objetos.ejer100;

import java.util.ArrayList;

public class Nave {

    private String nombre;
    private ArrayList<Tripulante> lista_tripulantes = new ArrayList<Tripulante>();
    private int n_tripulantes;

    public Nave(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void add_tripulante(Tripulante tripulante) {
        lista_tripulantes.add(tripulante);
        n_tripulantes++;
    }

    public int getN_tripulantes() {
        return n_tripulantes;
    }

    public ArrayList<Tripulante> getLista_tripulantes() {
        return lista_tripulantes;
    }
}
