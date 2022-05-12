package Tr3.UD9_Clases_Avanzadas.ejer125;

public class Pelicula extends Multimedia  {
    private String actor;
    private String actriz;

    public Pelicula (String titulo, String autor, String formato, float duracion, String actor, String actriz) {
        super(titulo,autor,formato,duracion);
        this.actor = actor;
        this.actriz = actriz;
    }

    public String toString () {
        return "Titulo: "+titulo+"\nAutor: "+autor+"\nFormato: "+formato+"\nDuracion: "+duracion+"\nActor: "+actor+"\nActriz: "+actriz;
    }

    // Getters

    public String getActor() {
        return actor;
    }

    public String getActriz() {
        return actriz;
    }

    // Setters

    public void setActor(String actor) {
        this.actor = actor;
    }

    public void setActriz(String actriz) {
        this.actriz = actriz;
    }
}

