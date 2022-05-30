package Tr3.UD9_Clases_Avanzadas.ejer130;

enum RazaGato { Comun, Siames, Persa, Angora, ScottishFold };

public class Gato extends Animal{

    private RazaGato raza;
    private String microchip;

    public Gato(String nombre, String fechaNacimiento, int peso, RazaGato raza, String microchip) {
        super(nombre, fechaNacimiento, peso);
        this.raza = raza;
        this.microchip = microchip;
    }

    public String toString() {
        return "Ficha de Gato\nNombre: " + nombre + "\n" +
                "Raza: " + raza + "\n" +
                "Fecha de Nacimiento: " + fechaNacimiento + "\n" +
                "Peso: " + peso + " Kg\n" +
                "Microchip: " + microchip + "\n" +
                "Comentarios: " + comentarios+ "\n";
    }
}
