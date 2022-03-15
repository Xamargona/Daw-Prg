package Tr2.UD7_Orientación_objetos.ejer99b;

public class Equipo {

    private String nombre;
    private Jugador jugador1;
    private Jugador jugador2;
    private Jugador jugador3;

    public Equipo (String nombre, Jugador j1, Jugador j2, Jugador j3){
        this.nombre = nombre;
        this.jugador1 = j1;
        this.jugador2 = j2;
        this.jugador3 = j3;
    }

    public String getNombre() {
        return nombre;
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public Jugador getJugador3() {
        return jugador3;
    }

}
