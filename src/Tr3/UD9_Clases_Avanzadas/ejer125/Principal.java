package Tr3.UD9_Clases_Avanzadas.ejer125;

import java.sql.ClientInfoStatus;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    static final Scanner sc = new Scanner(System.in);
    static final ListaMultimedia lista = new ListaMultimedia(2);

    public static void main(String[] args) {
        int opcion = -1;
        while (opcion != 3) {
            try {
                opcion = menu();
                sc.nextLine();
                switch (opcion) {
                    case 1: alta_peli(); break;
                    case 2: muestar_lista(); break;
                    case 3: System.out.println("Ciao");break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public static int menu() {
        System.out.println("1-Alta peli");
        System.out.println("2-Muestra lista");
        System.out.println("3-Salir");
        int opcion = -1;
        try {
            opcion = sc.nextInt();
            if (opcion > 3 || opcion < 1) {
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
    public static void alta_peli(){
        System.out.println("titulo");
        String titulo = sc.nextLine();
        System.out.println("autor");
        String autor = sc.nextLine();
        System.out.println("formato");
        String formato = sc.nextLine();
        System.out.println("duracion");
        float duracion = sc.nextFloat();
        sc.nextLine();
        System.out.println("actor");
        String actor = sc.nextLine();
        System.out.println("actriz");
        String actriz = sc.nextLine();
        lista.add(new Pelicula(titulo,autor,formato,duracion,actor,actriz));
    }

    public static void muestar_lista(){
        System.out.println(lista.toString());
    }
}
