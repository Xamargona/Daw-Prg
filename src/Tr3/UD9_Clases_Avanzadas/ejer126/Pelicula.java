package Tr3.UD9_Clases_Avanzadas.ejer126;

public class Pelicula extends Contenido{

    private int n_nominaciones;
    private int n_oscars;

    public Pelicula (String titulo, String productora, int publicacion, boolean visto, int n_nominaciones, int n_oscars) {
        super(titulo, productora, publicacion, visto);
        this.n_nominaciones = n_nominaciones;
        this.n_oscars = n_oscars;
    }

    // Getters


    public int getN_nominaciones() {
        return n_nominaciones;
    }

    public int getN_oscars() {
        return n_oscars;
    }

    // Setters


    public void setN_nominaciones(int n_nominaciones) {
        this.n_nominaciones = n_nominaciones;
    }

    public void setN_oscars(int n_oscars) {
        this.n_oscars = n_oscars;
    }
}
