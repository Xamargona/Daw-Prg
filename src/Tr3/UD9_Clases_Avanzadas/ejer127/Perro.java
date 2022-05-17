package Tr3.UD9_Clases_Avanzadas.ejer127;

public class Perro extends Mascota{

    public Perro (String nombre, char tipo) {
        super(nombre, tipo);
    }

    public void sonido() {
        System.out.println("Hola me llamo "+nombre+", soy un perro y hago guauuuuu");
    }
}
