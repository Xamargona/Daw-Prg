package Tr3.UD9_Clases_Avanzadas.ejer123;

public class PezGlobo extends Pez{
    private int toxinas;

    public PezGlobo (String nombre, int n_escamas, int peso ,int toxinas) {
        super(nombre, n_escamas, peso);
        this.toxinas = toxinas;
    }

    public String rieso () {
        int n = getPeso()*1000/toxinas;
        int x = getPeso()*1000/10;
        int y = getPeso()*1000/10*2;
        if (n < x){
            return "inofensivo";
        } else if (n < y) {
            return "riesgo moderado";
        } else {
            return "yo no lo haría";
        }
    }

    public int getToxinas() {
        return toxinas;
    }

    public void setToxinas(int toxinas) {
        this.toxinas = toxinas;
    }
}
