package Tr3.UD9_Clases_Avanzadas.ejer127;

public class Gato extends Mascota{

    public Gato (String nombre, char tipo) {
        super(nombre, tipo);
    }

    public void sonido() {
        System.out.println("Hola me llamo "+nombre+", soy un gato y hago miauuu");
    }
}
