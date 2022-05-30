package Tr3.Actividades_Evaluables.AE3_JavierMG;
import java.util.*;

public class Hombre extends CriaturaSinAlas{

    private int peso;
    private String arma;

    public Hombre(String nombre, int edad,int peso){
        super(nombre, edad, false);
        this.peso = peso;
        arma = null;
    }

    public void dar_arma(String arma) {

        int peso_arma = 0;
        char[] cadena = arma.toCharArray();
        peso_arma = cadena.length * 10;

        if (peso_arma <= (peso/2)){
            this.arma = arma;
            System.out.println(nombre+" ha sido equipado con "+arma);
        }else {
            System.out.printf("Esa arma es muy pesada! pesa "+peso_arma+" y debería pesar como mucho "+(peso/2));
        }
    }

    @Override
    public void presentarse() {
        System.out.printf("Soy un hombre, me llamo "+nombre+" tengo "+edad+" años, peso "+peso+" Kg.");
        if (arma == null){
            System.out.print(" y voy desarmado.\n");
        } else {
            System.out.printf(" y mi arma es una "+arma+".\n");
        }
    }
}
