package Tr3.UD9_Clases_Avanzadas.ejer123;

public class PezEspada extends Pez{
    private  String origen;

    public PezEspada(String nombre, int n_escamas, int peso ,String origen ) {
        super(nombre, n_escamas, peso);
        this.origen = origen;
    }

    public Boolean autentificar () {
        if (origen.equalsIgnoreCase("Mediterraneo")) {
            //Emperador
            return false;
        } else if (origen.equalsIgnoreCase("Atlántico") || origen.equalsIgnoreCase("Pacífico")) {

            //PezEspada
            return true;
        }
        //OtraEspecie
        return false;
    }
}