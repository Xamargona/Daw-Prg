package Tr3.UD8_Excepciones_Ficheros.ejer101;

public class Animal {
    private boolean tipo;
    private String nombre;
    private int peso;

    public Animal(boolean tipo, String nombre, int peso){
        this.tipo = tipo;
        this.nombre = nombre;
        this.peso = peso;
    }

    public String isTipo() {
        if (tipo) {
            return "tigre";
        } else {
            return "leones";
        }
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
