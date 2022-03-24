package Tr3.UD7_Orientación_objetos.ejer100;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    static final Scanner sc = new Scanner(System.in);
    static ArrayList<Nave> lista_naves = new ArrayList<>();
    static ArrayList<Flota> lista_flotas = new ArrayList<>();

    public static void main(String[] args) {
        int opcion;
        do {
            opcion = menu();
            switch (opcion){
                case 1: alta_nave(); break;
                case 2: alta_tripulante(); break;
                case 3: alta_flota(); break;
                case 4: consulta_nave();break;
                case 5: consulta_flota();break;
                case 0: System.out.println("Que la fuerza te acompañe...");break;
            }
        }while(opcion != 0);
    }

    public static int menu(){
        int opcion;
        do {
            System.out.println("----------- Menú de la galaxia -----------");
            System.out.println("1-Alta de nave             4-Consultar nave");
            System.out.println("2-Alta de tripulante       5-Consultar flota");
            System.out.println("3-Alta de flota            0-Salir");
            System.out.println("------------------------------------------");
            opcion = sc.nextInt();
        }while(opcion < 0 || opcion > 5);
        sc.nextLine();
        return opcion;
    }

    public static void alta_nave(){
        String nombre_nave;
        do {
            System.out.println("Introduzca nombre de la nave:");
            nombre_nave = sc.nextLine();
            if (validar_nave(nombre_nave)){
                System.out.println("Esta nave ya se encuentra registrada");
            }
        }while(nombre_nave.isEmpty() || validar_nave(nombre_nave));
        lista_naves.add(new Nave(nombre_nave));
    }

    public static void alta_tripulante(){
        String nombre_nave;
        do {
            System.out.println("Introduzca nombre de la nave donde desea dar de alta al tripulante:");
            nombre_nave = sc.nextLine();
        }while(!validar_nave(nombre_nave));
        int pos_nave = indice_nave(nombre_nave);
        String nombre_tripulante;
        do {
            System.out.println("Introduzca el nombre del tripulante para la nave "+nombre_nave+":");
            nombre_tripulante = sc.nextLine();
        }while(nombre_tripulante.isEmpty());
        int edad;
        do {
            System.out.println("Introduzca la edad del nuevo tripulante:");
            edad = sc.nextInt();
            if (edad < 0){
                System.out.println("Error edad negativa.");
            } else if (edad > 0 && edad < 18) {
                System.out.println("No estamos autorizados para llevar tripulabtes menores.");
            }
        }while (edad < 18);
        sc.nextLine();
        String rango;
        do {
            System.out.println("Introduzca su rango (Soldado, Capitan, Comandante):");
            rango = sc.nextLine();
        }while(!validar_rango(rango));
        if (rango.equalsIgnoreCase("Soldado")){
            rango = "Soldado";
        } else if (rango.equalsIgnoreCase("Capitan")) {
            rango = "Capitan";
        } else if (rango.equalsIgnoreCase("Comandante")) {
            rango = "Comandante";
        }
        lista_naves.get(pos_nave).add_tripulante(new Tripulante(nombre_tripulante, edad, rango));

    }

    public static boolean validar_nave(String nombre_nave){
        // Nave en la lista: return true, else return false.
        for (Nave nave : lista_naves){
            if (nave.getNombre().equalsIgnoreCase(nombre_nave)) {
                return true;
            }
        }
        return false;
    }

    public static int indice_nave(String nombre_nave){
        // Nave en la lista: return true, else return false.
        for (Nave nave : lista_naves){
            if (nave.getNombre().equalsIgnoreCase(nombre_nave)) {
                return lista_naves.indexOf(nave);
            }
        }
        return -1;
    }

    public static boolean validar_rango(String rango){
        return  rango.equalsIgnoreCase("Soldado") ||
                rango.equalsIgnoreCase("Capitan") ||
                rango.equalsIgnoreCase("Comandante");
    }

    public static void alta_flota(){
        if (lista_naves.isEmpty()){
            System.out.println("Imposible crear flota, no hay ninguna nave a añadir.");
            return;
        }
        String nombre_flota;
        do {
            System.out.println("Introduzca nombre para su flota:");
            nombre_flota = sc.nextLine();
            if (validar_flota(nombre_flota)){
                System.out.println("Esta flota ya se encuentra registrada");
            }
        }while(nombre_flota.isEmpty() || validar_flota(nombre_flota));
        lista_flotas.add(new Flota(nombre_flota));
        String nombre_nave;
        int indice_flota = indice_flota(nombre_flota);
        do {
            System.out.println("Introduzca nombre de nave para añadir a la flota "+nombre_flota +" (hasta teclear 'salir'):");
            nombre_nave = sc.nextLine();
            if (validar_nave(nombre_nave)){
                int indice_nave = indice_nave(nombre_nave);
                lista_flotas.get(indice_flota).add_nave(lista_naves.get(indice_nave));
                System.out.println("La nave "+lista_naves.get(indice_nave).getNombre()+" se añade a la flota "+nombre_flota);
            }
        }while(!nombre_nave.equalsIgnoreCase("salir"));
    }

    public static boolean validar_flota(String nombre_flota){
        // Nave en la lista: return true, else return false.
        for (Flota flota : lista_flotas){
            if (flota.getNombre().equalsIgnoreCase(nombre_flota)) {
                return true;
            }
        }
        return false;
    }

    public static int indice_flota(String nombre_flota){
        // Nave en la lista: return true, else return false.
        for (Flota flota : lista_flotas){
            if (flota.getNombre().equalsIgnoreCase(nombre_flota)) {
                return lista_flotas.indexOf(flota);
            }
        }
        return -1;
    }

    public static void consulta_nave(){
        String nombre_nave;
        System.out.println("Introduzca el nombre de la nave:");
        nombre_nave = sc.nextLine();
        if (validar_nave(nombre_nave)){
            int indice_nave = indice_nave(nombre_nave);
            System.out.println("Encontrada la nave "+lista_naves.get(indice_nave).getNombre()+" con " + lista_naves.get(indice_nave).getN_tripulantes()+":");
            for (Tripulante tripulante : lista_naves.get(indice_nave).getLista_tripulantes()){
                System.out.println("\t-"+tripulante.getRango()+" "+tripulante.getNombre()+"("+tripulante.getEdad()+")");
            }
        }
    }

    public static void consulta_flota(){
        String nombre_flota;
        System.out.println("Introduzca el nombre de la flota:");
        nombre_flota = sc.nextLine();
        if (validar_flota(nombre_flota)){
            int indice_flota = indice_flota(nombre_flota);
            System.out.println("Encontrada la flota "+lista_flotas.get(indice_flota).getNombre()+" con " + lista_flotas.get(indice_flota).getN_naves()+":");
            for (Nave nave : lista_flotas.get(indice_flota).getLista_naves()){
                System.out.println("\t-"+nave.getNombre());
            }
        }
    }

}
