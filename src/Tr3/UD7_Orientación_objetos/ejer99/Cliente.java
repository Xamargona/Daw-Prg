package Tr3.UD7_Orientación_objetos.ejer99;

public class Cliente {
    private String nombre;
    private int edad;

    public Cliente(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
