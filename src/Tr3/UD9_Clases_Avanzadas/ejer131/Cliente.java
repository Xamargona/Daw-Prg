package Tr3.UD9_Clases_Avanzadas.ejer131;

public class Cliente {
    private String nombre;
    private int tlf;

    public Cliente(String nombre, int tlf) {
        this.nombre = nombre;
        this.tlf = tlf;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTlf() {
        return tlf;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTlf(int tlf) {
        this.tlf = tlf;
    }
}
