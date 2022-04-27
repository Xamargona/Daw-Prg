package Tr3.UD8_Excepciones_Ficheros;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ejer108 {
    static final Scanner sc = new Scanner(System.in);
    static final ArrayList<String> agenda = new ArrayList<>();

    public static void main(String[] args) {
        int opcion = -1;
        while (opcion != 4) {
            try {
                opcion = menu();
                sc.nextLine();
                switch (opcion) {
                    case 1: alta_contacto(); break;
                    case 2: baja_contacto(); break;
                    case 3: listar_agenda(); break;
                    case 4: System.out.println("Ciao");break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        if (agenda.size() != 0) {
            File contactos = new File("/home/javgon01/Escriptori/Agenda.txt");
            try {
                contactos.createNewFile();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            try {
                FileWriter escritura = new FileWriter(contactos);
                for (String nombre:agenda) {
                    escritura.write(nombre+"\n");
                }
                escritura.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static int menu() {
        System.out.println("1-Dar de alta un contacto de la agenda");
        System.out.println("2-Dar de baja un contacto de la agenda");
        System.out.println("3-Listar agenda");
        System.out.println("4-Salir");
        int opcion = -1;
        try {
            opcion = sc.nextInt();
            if (opcion > 4 || opcion < 1) {
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

    public static void alta_contacto() {
        System.out.println("Introduzca nombre del nuevo contacto:");
        String entrada = sc.nextLine();
        try {
            for (String nombre:agenda) {
                if (nombre.equalsIgnoreCase(entrada)) {
                    throw new Exception("Contacto ya registrado");
                }
            }
            agenda.add(entrada);
            System.out.println("Contacto "+entrada+" añadido");
            System.out.println("Numero de contactos en la agenda: "+agenda.size());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void baja_contacto() {
        if (agenda.isEmpty()) {
            System.out.println("Todavía no hay ningún contacto añadido");
            return;
        }
        System.out.println("Introduzca nombre del contacto a dar de baja:");
        String entrada = sc.nextLine();
        try {
            for (String nombre:agenda) {
                if (nombre.equalsIgnoreCase(entrada)) {
                    agenda.remove(nombre);
                    System.out.println("Contacto "+nombre+" eliminado");
                    System.out.println("Numero de contactos en la agenda: "+agenda.size());
                    return;
                }
            }
            throw new Exception("Contacto no encontrado");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void listar_agenda() {
        for (String nombre : agenda) {
            System.out.println(nombre);
        }
    }
}
