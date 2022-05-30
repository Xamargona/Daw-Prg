package Tr3.Examen_JavierMG;

public class Napolitana extends Bolleria{

    private String relleno;


    public Napolitana(double peso, String relleno) {
        super(peso);
        this.relleno = relleno;
    }

    @Override
    public String toString() {
        return "-Napolitana de "+peso+" g. con relleno de sabor "+relleno+". PVP: "+precio+" €.\n";
    }
}
