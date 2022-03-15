package Tr2.UD7_Orientación_objetos.ejer99b;

public class Jugador {

    private String nombre;
    private int dorsal;

    public Jugador(String nombre, int dorsal){
        this.nombre = nombre;
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDorsal() {
        return dorsal;
    }
}
