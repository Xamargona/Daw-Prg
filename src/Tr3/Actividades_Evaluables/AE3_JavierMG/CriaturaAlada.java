package Tr3.Actividades_Evaluables.AE3_JavierMG;
import java.util.*;

public class CriaturaAlada extends Criatura{

    private boolean fuego;
    private CriaturaSinAlas jinete;

    public CriaturaAlada(String nombre, boolean fuego) {
        super(nombre);
        this.fuego = fuego;
        jinete = null;
    }

    public void anyadir_jinete(CriaturaSinAlas otro) {
        if ((otro instanceof Orco) && otro.temible) {
            System.out.println(otro.nombre + " controla a "+ nombre);
            jinete = otro;
        } else {
            System.out.println(otro.nombre + " no puede controlar a "+ nombre);
        }
    }

    public void presentarse() {
        System.out.printf("Soy "+ nombre+" una criatura alada ");
        if (fuego){
            System.out.print("escupefuego");
        } else {
            System.out.print("pero soy incapaz de escupi fuego");
        }
        if (jinete != null){
            System.out.printf(" mi jinete es "+jinete.getNombre()+"\n");
        }else{
            System.out.println(" no tengo jinete\n");
        }
    }
}
