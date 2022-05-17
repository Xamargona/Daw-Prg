package Tr3.UD9_Clases_Avanzadas.ejer127;

public class Periquito extends Mascota{

    public Periquito (String nombre, char tipo) {
        super(nombre, tipo);
    }

    public void sonido() {
        System.out.println("Hola me llamo "+nombre+", soy un periquito y hago pio pio piooo");
    }
}
