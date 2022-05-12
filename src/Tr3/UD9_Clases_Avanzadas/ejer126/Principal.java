package Tr3.UD9_Clases_Avanzadas.ejer126;
import  java.util.*;
public class Principal {

    static final Scanner sc = new Scanner(System.in);
    static final ArrayList<Contenido> lista = new ArrayList<Contenido>();

    public static void main(String[] args) {

        int opcion = -1;

        while (opcion != 6) {
            try {
                opcion = menu();
                sc.nextLine();
                switch (opcion) {
                    case 1: alta_peli(); break;
                    case 2: alta_serie(); break;
                    case 3: ver_contenido(); break;
                    case 4: listar_contenido(); break;
                    case 5: listar_pendiente(); break;
                    case 6: System.out.println("Ciao");break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public static int menu() {

        System.out.println("-----------------------------");
        System.out.println("1-Dar de alta una pelicula");
        System.out.println("2-Dar de alta una serie");
        System.out.println("3-Ver un contenido");
        System.out.println("4-Listar contenido");
        System.out.println("5-Listar contenido pendiente por ver");
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

    public static void alta_peli() {
        String titulo = pedirString("titulo");
        String productora = pedirString("productora");
        int publicacion = pedirInt("año de publicacion");
        int nominaciones = pedirInt("numero de nominaciones a los Oscars");
        int oscars;
        do {
            oscars = pedirInt("numero de Oscars ganados");
            if (oscars > nominaciones) {
                System.out.println("ERROR!, mas oscars ganados que nominaciones!");
            }
        }while (oscars > nominaciones);
        lista.add(new Pelicula(titulo,productora,publicacion, false, nominaciones, oscars));
        System.out.println("La pelicula "+titulo+" ha sido dada de alta correctamente!");
    }

    public static void alta_serie() {
        String titulo = pedirString("titulo");
        String productora = pedirString("productora");
        int publicacion = pedirInt("año de publicacion");
        int n_temporadas = pedirInt("el numero de temporadas");

        boolean finalizada = true;
        String entrada = "";
        do {
            System.out.println("¿La serie está finalizada o no? (S/N)");
            entrada = sc.nextLine();
            if (entrada.equalsIgnoreCase("N")){
                finalizada = false;
                break;
            } else if (entrada.equalsIgnoreCase("S")) {
                break;
            }
        }while (!entrada.equalsIgnoreCase("N")||!entrada.equalsIgnoreCase("S"));
        lista.add(new Serie(titulo,productora,publicacion, false, n_temporadas, true));
        System.out.println("La Serie "+titulo+" ha sido dada de alta correctamente!");
    }

    public static void ver_contenido() {
        System.out.println("Introduzca el titulo del contenido que quiere visualizar:");
        String cadena = sc.nextLine();
        for (Contenido multimedia:lista) {
            if (multimedia.getTitulo().equalsIgnoreCase(cadena)) {
                multimedia.setVisto(true);
                return;
            }
        }
        System.out.println("El contenido "+cadena+" no existe en nuestra base de datos");
    }

    public static void listar_contenido() {
        for (Contenido multimedia:lista) {
            System.out.println(multimedia.titulo+"|"+multimedia.getProductora()+"|"+multimedia.getPublicacion()+"|"+multimedia.getVisto());
        }
    }

    public static void listar_pendiente() {
        for (Contenido multimedia:lista) {
            if (!multimedia.getVisto()){
                System.out.println(multimedia.titulo+"|"+multimedia.getProductora()+"|"+multimedia.getPublicacion()+"|"+multimedia.getVisto());
            }
        }
    }
    public static String pedirString(String variable){
        String cadena = "";
        do {
            System.out.println("Introduzca " + variable + ":");
            try {
                cadena = sc.nextLine();
                if (cadena.isEmpty()) {
                    throw new Exception("No se ha introducido ninguna cadena de texto");
                }
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (cadena.isEmpty());
        return cadena;
    }

    public static int pedirInt(String variable){
        int num = -1;
        do {
            System.out.println("Introduzca " + variable + ":");
            try {
                num = Integer.parseInt(sc.nextLine());
                if (num < 0) {
                    throw new Exception("Introduce valores positivos");
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Introduce solo valores numericos");
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (num < 0);
        return num;
    }

}
