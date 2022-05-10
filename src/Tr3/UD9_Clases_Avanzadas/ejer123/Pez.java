package Tr3.UD9_Clases_Avanzadas.ejer123;

public class Pez {
    private String nombre;
    private int n_escamas;
    protected int peso;

    public Pez (String nombre, int n_escamas, int peso) {
        this.nombre = nombre;
        this.n_escamas = n_escamas;
        this.peso = peso;
    }

    public String calibre (){
        if (this.peso < 100){
            return "pequeño";
        } else if (this.peso < 300) {
            return "mediano";
        } else if (this.peso < 500){
            return "grande";
        } else {
            return "cachalote";
        }
    }

    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public int getPeso() {
        return peso;
    }

    public int getN_escamas() {
        return n_escamas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setN_escamas(int n_escamas) {
        this.n_escamas = n_escamas;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
