package Tr3.UD9_Clases_Avanzadas.ejer130;

enum EspeciePajaro { Canario, Periquito, Agaporni };

public class Pajaro extends Animal{

    private EspeciePajaro raza;
    private boolean cantor;

    public Pajaro(String nombre, String fechaNacimiento, int peso, EspeciePajaro raza, boolean cantor) {
        super(nombre, fechaNacimiento, peso);
        this.raza = raza;
        this.cantor = cantor;
    }

    public String toString() {
        if (cantor){
            return "Ficha de Pajaro\nNombre: " + nombre + "\n" +
                    "Raza: " + raza + "\n" +
                    "Fecha de Nacimiento: " + fechaNacimiento + "\n" +
                    "Peso: " + peso + " Kg\n" +
                    "Cantor: Este da la lata por las mañanas\n" +
                    "Comentarios: " + comentarios+ "\n";
        } else {
            return "Ficha de Pajaro\nNombre: " + nombre + "\n" +
                    "Raza: " + raza + "\n" +
                    "Fecha de Nacimiento: " + fechaNacimiento + "\n" +
                    "Peso: " + peso + " Kg\n" +
                    "Comentarios: " + comentarios + "\n";
        }
    }
}