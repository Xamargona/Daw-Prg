package Tr3.UD9_Clases_Avanzadas.ejer130;

import java.util.ArrayList;

public class ClinicaVeterinaria {

    private ArrayList<Animal> listaAnimales;

    public ClinicaVeterinaria() {
        this.listaAnimales = new ArrayList<Animal>();
    }

    public void InsertarAnimal(Animal animal) {
        listaAnimales.add(animal);
    }

    public void BuscarAnimal(String nombre) {
        for (Animal animal:listaAnimales) {
            if (animal.getNombre().equalsIgnoreCase(nombre)){
                System.out.println(animal.toString());
                return;
            }
        }
        System.out.println("Animal no encontrado");
    }

    public void InsertarComentarioAnimal(String nombre, String comentario) {
        for (Animal animal:listaAnimales) {
            if (animal.getNombre().equalsIgnoreCase(nombre)){
                animal.setComentarios(comentario);
                System.out.println("Comentario insertado correctamente");
                return;
            }
        }
        System.out.println("Animal no encontrado");
    }

    public String toString() {
        StringBuilder cadena = new StringBuilder();
        for (Animal animal:listaAnimales) {
            cadena.append(animal.toString());
            cadena.append("---------------\n");
        }
        return cadena.toString();
    }
}
