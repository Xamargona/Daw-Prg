package Tr3.UD7_Orientación_objetos.ejer100;

import java.util.ArrayList;

public class Flota {

    private String nombre;
    private ArrayList<Nave> lista_naves = new ArrayList<Nave>();
    private int n_naves = 0;

    public Flota(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void add_nave(Nave nave){
        lista_naves.add(nave);
        n_naves++;
    }

    public int getN_naves() {
        return n_naves;
    }

    public ArrayList<Nave> getLista_naves() {
        return lista_naves;
    }
}
