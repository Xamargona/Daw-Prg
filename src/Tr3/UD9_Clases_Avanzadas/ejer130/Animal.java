package Tr3.UD9_Clases_Avanzadas.ejer130;

public abstract class Animal {

    protected String nombre;
    protected String fechaNacimiento;
    protected int peso;
    protected String comentarios;

    public Animal(String nombre, String fechaNacimiento, int peso) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        comentarios = "";
    }

    public abstract String toString();

    // Getters && Setters

    public String getNombre() {
        return nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getPeso() {
        return peso;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}
