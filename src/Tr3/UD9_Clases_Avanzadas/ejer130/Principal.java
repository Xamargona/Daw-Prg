package Tr3.UD9_Clases_Avanzadas.ejer130;

public class Principal {
    public static void main(String[] args) {

        Perro perro = new Perro("Snoopy", "24/05/2005", 25, RazaPerro.Beagle, "Microchip001");
        Gato gato = new Gato("Garfield", "27/07/2012", 120, RazaGato.Comun, "Microchip002");
        Pajaro pajaro = new Pajaro("Piolín", "12/07/2016", 1, EspeciePajaro.Canario, true);
        Reptil reptil = new Reptil("Godzilla", "12/01/1420", 19800, EspecieReptil.LagartoGigante,false);

        ClinicaVeterinaria clinica = new ClinicaVeterinaria();

        clinica.InsertarComentarioAnimal("Pulgas", "Comentario");
        clinica.InsertarAnimal(perro);
        clinica.InsertarAnimal(gato);
        clinica.InsertarAnimal(pajaro);
        clinica.InsertarAnimal(reptil);

        System.out.println(clinica.toString());
        clinica.InsertarComentarioAnimal("Snoopy", "Viene acompañado de su hermano Spike");
        clinica.InsertarComentarioAnimal("Garfield", "Llega a la consulta con un empacho de Lasaña");
        clinica.InsertarComentarioAnimal("Piolín", "Repite continuamente ‘Me parece que he visto a un lindo gatito'");
        clinica.InsertarComentarioAnimal("Godzilla", "Sufre heridas de su pelea contra Gamera");

        System.out.println(clinica.toString());
    }
}
