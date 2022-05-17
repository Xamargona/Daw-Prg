package Tr3.UD9_Clases_Avanzadas.ejer127;

public abstract class Mascota {

    protected String nombre;
    protected char tipo;

    public Mascota (String nombre, char tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public abstract void sonido();

    // Getters && Setters

    public String getNombre() {
        return nombre;
    }

    public char getTipo() {
        return tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
}
