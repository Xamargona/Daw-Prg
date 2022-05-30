package Tr3.Actividades_Evaluables.AE3_JavierMG;
import java.util.*;

public class Hobbit extends CriaturaSinAlas{

    private int velocidad;

    public Hobbit(String nombre, int edad, int velocidad){
        super(nombre, edad, false);
        this.velocidad = velocidad;
    }

    @Override
    public void presentarse() {
        if (nombre.equalsIgnoreCase("Sam") && velocidad < 10) {
            System.out.println("Soy "+nombre+" un hobbit de "+edad+" años y no soy para nada temible, . Voy a "+velocidad+"Km/h. Sam va lentín");
            return;
        }
        if (nombre.equalsIgnoreCase("Smeagol") && poseedor_anillo.equalsIgnoreCase("Smeagol")) {
            System.out.println("Soy Gollum un hobbit de "+edad+" años y no soy para nada temible, . Voy a "+velocidad+"Km/h. Es miooo! mi tesorooooo");
            return;
        }
        System.out.println("Soy "+nombre+" un hobbit de "+edad+" años y no soy para nada temible. Voy a "+velocidad+"Km/h");

    }
}
