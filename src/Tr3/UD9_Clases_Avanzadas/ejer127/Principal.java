package Tr3.UD9_Clases_Avanzadas.ejer127;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    static final Scanner sc = new Scanner(System.in);
    static final ArrayList<Mascota> lista = new ArrayList<Mascota>();

    public static void main(String[] args) {

        int opcion = -1;

        while (opcion != 6) {
            try {
                opcion = menu();
                sc.nextLine();
                switch (opcion) {
                    case 1: alta_mascota(); break;
                    case 2: perroygato(); break;
                    case 3: periquitoyconejo(); break;
                    case 4: gatoyperiquito(); break;
                    case 5: perroyconejo(); break;
                    case 6: System.out.println("Ciao");break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static int menu() {

        System.out.println("-----------------------------");
        System.out.println("1-Dar de alta una mascota");
        System.out.println("2-Escuchar perros y gatos");
        System.out.println("3-Escuchar periquitos y conejos");
        System.out.println("4-Escuchar gatos y periquitos");
        System.out.println("5-Escuchar perros y conejos");
        System.out.println("6-Salir");
        System.out.println("-----------------------------");
        int opcion = -1;

        try {
            opcion = sc.nextInt();
            if (opcion > 6 || opcion < 1) {
                throw new Exception("ERROR: Opción incorrecta");
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Introduce solo valores númericos");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return opcion;
    }

    public static void alta_mascota() {
        char tipo;
        while(true) {
            System.out.println("Introduzca el tipo de mascota a dar de alta (P-Perro/G-gato/Q-Periquito/C-Conejo):");
            tipo = sc.nextLine().toLowerCase().charAt(0);
            if (tipo != 'p' && tipo != 'g' && tipo != 'q' && tipo != 'c') {
                System.out.println("Dato erróneo");
            } else {
                break;
            }
        }

        System.out.println("Introduzca nombre de la mascota");
        String nombre = sc.nextLine();

        if (tipo == 'p') {
            lista.add(new Perro(nombre,tipo));
            System.out.println("Se ha dado de alta a un perro llamado "+nombre);
        }
        if (tipo == 'g') {
            lista.add(new Gato(nombre,tipo));
            System.out.println("Se ha dado de alta a un gato llamado "+nombre);
        }
        if (tipo == 'q') {
            lista.add(new Periquito(nombre,tipo));
            System.out.println("Se ha dado de alta a un periquito llamado "+nombre);
        }
        if (tipo == 'c') {
            lista.add(new Conejo(nombre,tipo));
            System.out.println("Se ha dado de alta a un conejo llamado "+nombre);
        }
    }

    public static void perroygato(){
        for (Mascota mascota:lista) {
            if (mascota.getTipo() == 'p' || mascota.getTipo() == 'g') {
                mascota.sonido();
            }
        }
    }

    public static void periquitoyconejo(){
        for (Mascota mascota:lista) {
            if (mascota.getTipo() == 'q' || mascota.getTipo() == 'c') {
                mascota.sonido();
            }
        }
    }

    public static void gatoyperiquito(){
        for (Mascota mascota:lista) {
            if (mascota.getTipo() == 'g' || mascota.getTipo() == 'q') {
                mascota.sonido();
            }
        }
    }

    public static void perroyconejo(){
        for (Mascota mascota:lista) {
            if (mascota.getTipo() == 'p' || mascota.getTipo() == 'c') {
                mascota.sonido();
            }
        }
    }
}
