package Tr3.UD9_Clases_Avanzadas.ejer126;

public class Contenido {

    protected String titulo;
    protected String productora;
    protected int publicacion;
    protected boolean visto;

    public Contenido (String titulo, String productora, int publicacion, boolean visto) {
        this.titulo = titulo;
        this.productora = productora;
        this.publicacion = publicacion;
        this.visto = visto;
    }

    // Getters


    public String getTitulo() {
        return titulo;
    }

    public String getProductora() {
        return productora;
    }

    public int getPublicacion() {
        return publicacion;
    }

    public boolean getVisto() {
        return visto;
    }

    // Setters


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public void setPublicacion(int publicacion) {
        this.publicacion = publicacion;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }
}
