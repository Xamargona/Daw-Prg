package Tr3.UD9_Clases_Avanzadas.ejer130;

enum RazaPerro { PastorAleman, Husky, FoxTerrier, Dalmata, Beagle, SanBernardo };

public class Perro extends Animal{

    private RazaPerro raza;
    private String microchip;

    public Perro(String nombre, String fechaNacimiento, int peso, RazaPerro raza, String microchip) {
        super(nombre, fechaNacimiento, peso);
        this.raza = raza;
        this.microchip = microchip;
    }

    @Override
    public String toString() {
        return "Ficha de Perro\nNombre: " + nombre + "\n" +
                "Raza: " + raza + "\n" +
                "Fecha de Nacimiento: " + fechaNacimiento + "\n" +
                "Peso: " + peso + " Kg\n" +
                "Microchip: " + microchip + "\n" +
                "Comentarios: " + comentarios+ "\n";
    }
}
