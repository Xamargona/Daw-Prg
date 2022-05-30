package Tr3.UD9_Clases_Avanzadas.ejer130;

enum EspecieReptil { Tortuga, Iguana, DragonDeComodo, LagartoGigante };

public class Reptil extends Animal{

    private EspecieReptil raza;
    private boolean venenoso;

    public Reptil(String nombre, String fechaNacimiento, int peso, EspecieReptil raza, boolean venenoso) {
        super(nombre, fechaNacimiento, peso);
        this.raza = raza;
        this.venenoso = venenoso;
    }

    public String toString() {
        if (venenoso){
            return "Ficha de Reptil\nNombre: " + nombre + "\n" +
                    "Raza: " + raza + "\n" +
                    "Fecha de Nacimiento: " + fechaNacimiento + "\n" +
                    "Peso: " + peso + " Kg\n" +
                    "Venenoso: Tu deja que te pique y te echarás unas risas\n" +
                    "Comentarios: " + comentarios+ "\n";
        } else {
            return "Ficha de Reptil\nNombre: " + nombre + "\n" +
                    "Raza: " + raza + "\n" +
                    "Fecha de Nacimiento: " + fechaNacimiento + "\n" +
                    "Peso: " + peso + " Kg\n" +
                    "Comentarios: " + comentarios+ "\n";
        }
    }
}