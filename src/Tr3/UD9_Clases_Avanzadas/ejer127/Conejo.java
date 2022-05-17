package Tr3.UD9_Clases_Avanzadas.ejer127;

public class Conejo extends Mascota{

    public Conejo (String nombre, char tipo) {
        super(nombre, tipo);
    }

    public void sonido() {
        System.out.println("Hola me llamo "+nombre+", soy un conejo y hago raabit raaabit");
    }
}
