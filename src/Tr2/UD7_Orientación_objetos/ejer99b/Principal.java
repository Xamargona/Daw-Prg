package Tr2.UD7_Orientación_objetos.ejer99b;
import java.util.*;

public class Principal {

    static final Scanner sc = new Scanner(System.in);
    static ArrayList<Equipo> lista_equipos = new ArrayList<>();

    public static void main(String[] args) {

        int n_equipos = n_equipos();

        for (int i = 1; i < n_equipos+1; i++) {
            System.out.println("Introduzca nombre del equipo "+i+":");
            lista_equipos.add(crear_equipo());
            mostrar_equipo(lista_equipos.get(i-1));
        }

        mostrar_equipos();

    }

    public static int n_equipos(){
        int x = -1;
        do {
            System.out.println("Introduzca numero de equipos a dar de alta:");
            x = sc.nextInt();
        }while(x < 1);
        sc.nextLine();
        return x;
    }

    public static Equipo crear_equipo(){
        String nombre = sc.nextLine();
        System.out.println("Para el "+nombre+", introduzca dorsal y nombre del jugador 1:");
        Jugador j1 = crear_jugador();
        System.out.println("Para el "+nombre+", introduzca dorsal y nombre del jugador 2:");
        Jugador j2 = crear_jugador();
        System.out.println("Para el "+nombre+", introduzca dorsal y nombre del jugador 3:");
        Jugador j3 = crear_jugador();
        return new Equipo(nombre, j1, j2, j3);
    }

    public static Jugador crear_jugador(){
        String cadena = sc.nextLine();
        String[] partes = cadena.split(" ");
        String n = partes[0];
        String nombre = partes[1];
        int dorsal = Integer.parseInt(n);
        return new Jugador(nombre, dorsal);
    }

    public static void mostrar_equipo(Equipo equipo){
        System.out.println("NOMBRE: "+equipo.getNombre()+"\nJUGADORES:");
        System.out.println("\t"+equipo.getJugador1().getDorsal()+": "+equipo.getJugador1().getNombre());
        System.out.println("\t"+equipo.getJugador2().getDorsal()+": "+equipo.getJugador2().getNombre());
        System.out.println("\t"+equipo.getJugador3().getDorsal()+": "+equipo.getJugador3().getNombre());
    }

    public static void mostrar_equipos(){
        System.out.println("Lista de los jugadores con los dorsales pares:");
        for (Equipo equipo: lista_equipos){
            if (equipo.getJugador1().getDorsal() % 2 == 0){
                System.out.println("\t"+equipo.getJugador1().getDorsal()+": "+equipo.getJugador1().getNombre());
            }
            if (equipo.getJugador2().getDorsal() % 2 == 0){
                System.out.println("\t"+equipo.getJugador2().getDorsal()+": "+equipo.getJugador2().getNombre());
            }
            if (equipo.getJugador3().getDorsal() % 2 == 0){
                System.out.println("\t"+equipo.getJugador3().getDorsal()+": "+equipo.getJugador3().getNombre());
            }
        }
        System.out.println("Lista de los jugadores con los dorsales impares:");
        for (Equipo equipo: lista_equipos){
            if (equipo.getJugador1().getDorsal() % 2 != 0){
                System.out.println("\t"+equipo.getJugador1().getDorsal()+": "+equipo.getJugador1().getNombre());
            }
            if (equipo.getJugador2().getDorsal() % 2 != 0){
                System.out.println("\t"+equipo.getJugador2().getDorsal()+": "+equipo.getJugador2().getNombre());
            }
            if (equipo.getJugador3().getDorsal() % 2 != 0){
                System.out.println("\t"+equipo.getJugador3().getDorsal()+": "+equipo.getJugador3().getNombre());
            }
        }
    }

}

