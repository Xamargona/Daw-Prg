package Tr2.UD7_Orientación_objetos.ejer99c;

public class Isla {

    private String nombre;
    private Concursante p1;
    private Concursante p2;
    private Concursante p3;
    private Concursante p4;

    public Isla(String nombre, Concursante p1, Concursante p2, Concursante p3, Concursante p4){
        this.nombre = nombre;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public String getNombre() {
        return nombre;
    }

    public Concursante getP1() {
        return p1;
    }

    public Concursante getP2() {
        return p2;
    }

    public Concursante getP3() {
        return p3;
    }

    public Concursante getP4() {
        return p4;
    }
}
