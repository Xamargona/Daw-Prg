package Tr3.Actividades_Evaluables.AE3_JavierMG;
import java.util.*;

public class Elfo extends CriaturaSinAlas{

    private CriaturaSinAlas pareja;
    private String color;

    public Elfo(String nombre, int edad, String color){
        super(nombre, edad, false);
        this.color = color;
        this.pareja = null;
    }

    public void emparejar(CriaturaSinAlas otro) {

        if (nombre.equalsIgnoreCase("Arwen") && !otro.nombre.equalsIgnoreCase("Aragorn") && !(otro instanceof Hombre)){
            System.out.println("Tu... no eres Aragorn");
        } else if (nombre.equalsIgnoreCase("Arwen") && otro.nombre.equalsIgnoreCase("Aragorn") && (otro instanceof Hombre)) {
            System.out.println("Por fin estaremos juntos hasta el fin Aragorn");
            pareja = otro;
        } else {
            System.out.println(nombre+ " ha sido emparejado con "+otro.getNombre());
            pareja = otro;
        }

    }

    public void presentarse() {

        System.out.printf("Soy un Elfo, me llamo "+nombre+" tengo "+edad+" años, soy de color "+color);

        if (pareja != null) {
            System.out.printf(" y mi pareja es " + pareja.getNombre()+"\n");
            pareja.presentarse();
        } else {
            System.out.print(" estoy soltero.\n");
        }

    }

}
