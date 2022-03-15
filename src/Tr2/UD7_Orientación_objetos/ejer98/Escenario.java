package Tr2.UD7_Orientación_objetos.ejer98;

public class Escenario {

    private String nombre;
    private Luchador luchador1;
    private Luchador luchador2;

    public Escenario(String nombre, Luchador l1, Luchador l2){
        this.nombre = nombre;
        luchador1 = l1;
        luchador2 = l2;
    }

    public String getNombre() {
        return nombre;
    }

    public Luchador getLuchador1() {
        return luchador1;
    }

    public Luchador getLuchador2() {
        return luchador2;
    }
}
