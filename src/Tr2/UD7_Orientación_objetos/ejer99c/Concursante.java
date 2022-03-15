package Tr2.UD7_Orientación_objetos.ejer99c;

public class Concursante {

    private String nombre;
    private int edad;
    private Concursante pareja;

    public Concursante(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setPareja(Concursante pareja) {
        this.pareja = pareja;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public Concursante getPareja() {
        return pareja;
    }
}
