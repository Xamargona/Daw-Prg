package Tr3.UD9_Clases_Avanzadas.ejer125;

public class Multimedia {
    protected String titulo;
    protected String autor;
    protected String formato;
    protected float duracion;

    public Multimedia (String titulo, String autor, String formato, float duracion) {
        this.autor = autor;
        this.titulo = titulo;
        this.formato = formato;
        this.duracion = duracion;
    }

    public String toString () {
        return "Titulo: "+titulo+"\n"+"Autor: "+autor+"\n"+"Formato: "+formato+"\n"+"Duracion: "+duracion;
    }

    //Getters

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getFormato() {
        return formato;
    }

    public float getDuracion() {
        return duracion;
    }

    //Setters

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }
}
