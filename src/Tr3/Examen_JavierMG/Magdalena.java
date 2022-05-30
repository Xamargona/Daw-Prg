package Tr3.Examen_JavierMG;

public class Magdalena extends Bolleria{

    private String tipo;
    private boolean papel;

    public Magdalena(double peso, String tipo, boolean papel) {
        super(peso);
        this.tipo = tipo;
        this.papel = papel;
    }

    public String llevapapel() {
        if (papel){
            return " y lleva papel";
        } else {
            return " y no lleva papel";
        }
    }

    @Override
    public String toString() {
        return "-Magdalena de "+peso+" g. con forma "+tipo+llevapapel()+". PVP: "+precio+" €.\n";
    }
}
