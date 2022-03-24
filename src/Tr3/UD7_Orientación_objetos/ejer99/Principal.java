package Tr3.UD7_Orientación_objetos.ejer99;
import java.util.*;

public class Principal {
    static final Scanner sc = new Scanner(System.in);
    static ArrayList<Sala> cine = new ArrayList<>();

    public static void main(String[] args) {
        creacine();
        int opcion;
        do {
            opcion = menu();
            switch (opcion){
                case 1: encolarCliente(); break;
                case 2: desencolarCliente(); break;
                case 3: infosala(); break;
                case 4: estadocine();break;
                case 5: System.out.println("Ciao");break;
            }
        }while(opcion != 5);
    }

    public static int menu(){
        int opcion;
        do {
            System.out.println("----------- Menu Kinepolis -------------");
            System.out.println("1-Encolar cliente en una sala");
            System.out.println("2-Desencolar cliente de la sala");
            System.out.println("3-Información de una sala");
            System.out.println("4-Estado del cine");
            System.out.println("5-Salir");
            opcion = sc.nextInt();
        }while(opcion < 1 || opcion > 5);
        sc.nextLine();
        return opcion;
    }

    public static void creacine() {
        System.out.println("Bienvenido a Kinepolis, ¿de cuantas salas dispone tu cine?");
        int n_salas;
        do {
            n_salas = sc.nextInt();
        }while(n_salas < 1);
        for (int i = 0; i < n_salas; i++) {
            cine.add(new Sala(i+1));
        }
    }

    public static void estadocine(){
        for (Sala sala : cine) {
            System.out.println("Clientes de la sala "+sala.getN_sala()+":");
            if (!sala.getColasala().isEmpty()){
                for (Cliente cliente : sala.getColasala()){
                    System.out.println("\t"+cliente.getNombre()+", "+cliente.getEdad()+".");
                }
            }
        }
    }

    public static void encolarCliente(){
        int x;
        do {
            System.out.println("¿Sobre qué sala desea realizar la operación?");
            x = sc.nextInt();
        }while(x < 1 || x > cine.size());
        sc.nextLine();
        System.out.println("Introduzca nombre del nuevo cliente para la cola "+x+":");
        String nombre = sc.nextLine();
        System.out.println("Introduzca su edad:");
        int edad = sc.nextInt();
        sc.nextLine();
        x--;
        cine.get(x).getColasala().add(new Cliente(nombre, edad));
    }

    public static void desencolarCliente(){
        int x;
        do {
            System.out.println("¿Sobre qué sala desea realizar la operación?");
            x = sc.nextInt();
        }while(x < 1 || x > cine.size());
        sc.nextLine();
        if (cine.get(x).getColasala().isEmpty()){
            System.out.println("La sala "+x+" no tiene a nadie en cola.");
        }else{
            System.out.println("Desencolamos al primero de la cola de la sala "+x);
            x--;
            cine.get(x).getColasala().remove();
        }
    }

    public static void infosala(){
        int x;
        do {
            System.out.println("¿De que sala desea obtener información?");
            x = sc.nextInt();
        }while(x < 1 || x > cine.size());
        System.out.println("Clientes de la sala "+x+":");
        x--;
        for (Cliente cliente : cine.get(x).getColasala()){
            System.out.println("\t"+cliente.getNombre()+", "+cliente.getEdad()+".");
        }
    }
}
