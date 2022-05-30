package Tr3.Actividades_Evaluables.AE3_JavierMG;
import java.util.*;

public abstract class CriaturaSinAlas extends Criatura{

    protected int edad;
    protected boolean temible;
    static protected String poseedor_anillo = "";

    public CriaturaSinAlas(String nombre, int edad, boolean temible) {
        super(nombre);
        this.edad = edad;
        this.temible = temible;
    }

    public void dar_o_quitar_anillo(String accion) {

        if (accion.equalsIgnoreCase("dar") && poseedor_anillo.equalsIgnoreCase("")) {
            poseedor_anillo = nombre;
            System.out.println("Se le ha otorgado el anillo a "+nombre);
        } else if (accion.equalsIgnoreCase("dar") && poseedor_anillo.equalsIgnoreCase(nombre)) {
            System.out.println(nombre+" ya es el poseedor del anillo");
        } else if (accion.equalsIgnoreCase("dar") && !poseedor_anillo.equalsIgnoreCase(nombre)){
            System.out.println("No le podemos dar a "+nombre+" lo que no tenemos. El actual portador del anillo es "+poseedor_anillo);
        }

        if (accion.equalsIgnoreCase("quitar") && !poseedor_anillo.equalsIgnoreCase(nombre)) {
            System.out.println("No le podemos quitar a "+nombre+" lo que no tiene. El actual portador del anillo es "+poseedor_anillo);
        } else if (accion.equalsIgnoreCase("quitar") && poseedor_anillo.equalsIgnoreCase(nombre)) {
            System.out.println(nombre + " es despojado del anillo");
            poseedor_anillo = "";
        }


    }

    public  abstract void presentarse();

    public String getNombre() {
        return nombre;
    }
}
