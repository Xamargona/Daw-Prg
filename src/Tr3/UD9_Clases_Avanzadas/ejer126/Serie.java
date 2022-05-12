package Tr3.UD9_Clases_Avanzadas.ejer126;

public class Serie extends Contenido{

    private int n_temporadas;
    private boolean finalizada;

    public Serie (String titulo, String productora, int publicacion, boolean visto, int n_temporadas, boolean finalizada) {
        super(titulo, productora, publicacion, visto);
        this.n_temporadas = n_temporadas;
        this.finalizada = finalizada;
    }

    // Getters

    public int getN_temporadas() {
        return n_temporadas;
    }

    public boolean getFinalizada() {
        return finalizada;
    }

    // Setters

    public void setN_temporadas(int n_temporadas) {
        this.n_temporadas = n_temporadas;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }
}
