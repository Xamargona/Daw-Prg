package Tr2.UD7_Orientación_objetos.ejer99c;
import Tr2.UD7_Orientación_objetos.ejer99b.Equipo;
import Tr2.UD7_Orientación_objetos.ejer99b.Jugador;

import java.util.*;
public class Principal {
    static final Scanner sc = new Scanner(System.in);
    static final ArrayList<Isla> lista_islas = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("Bienvenido a las islas de las tentaciones");
        System.out.println("Introduzca nombres de las islas separadas por '-':");
        String cadena = sc.nextLine();
        int contador = 0;
        while(cadena.contains("-")){
            String[] partes = cadena.split("-",2);
            cadena = partes[1];
            lista_islas.add(nueva_isla(partes[0]));
            muestra_isla(lista_islas.get(contador));
            contador++;
        }
        lista_islas.add(nueva_isla(cadena));
        muestra_isla(lista_islas.get(contador));
    }

    public static Isla nueva_isla(String nombreIsla){
        System.out.println("Introduzca la pareja 1 de la isla "+nombreIsla+"...");
        Concursante c1 = nuevo_concursante();
        Concursante c2 = nuevo_concursante();
        c1.setPareja(c2);
        c2.setPareja(c1);
        Concursante c3 = nuevo_concursante();
        Concursante c4 = nuevo_concursante();
        c3.setPareja(c4);
        c4.setPareja(c3);
        return new Isla(nombreIsla, c1, c2, c3, c4);
    }

    public static Concursante nuevo_concursante(){
        System.out.println("Edad y nombre del concursante:");
        String cadena = sc.nextLine();
        String[] partes = cadena.split(" ");
        String n = partes[0];
        String nombre = partes[1];
        int edad = Integer.parseInt(n);
        return new Concursante(nombre, edad);
    }

    public static void muestra_isla(Isla isla){
        System.out.println("Detalles de la isla "+isla.getNombre()+":");
        System.out.println("\t"+isla.getP1().getNombre()+", de "+isla.getP1().getEdad()+" años y su pareja es: "+isla.getP1().getPareja().getNombre() +", de "+isla.getP1().getPareja().getEdad()+" años.");
        System.out.println("\t"+isla.getP2().getNombre()+", de "+isla.getP2().getEdad()+" años y su pareja es: "+isla.getP2().getPareja().getNombre() +", de "+isla.getP2().getPareja().getEdad()+" años.");
        System.out.println("\t"+isla.getP3().getNombre()+", de "+isla.getP3().getEdad()+" años y su pareja es: "+isla.getP3().getPareja().getNombre() +", de "+isla.getP3().getPareja().getEdad()+" años.");
        System.out.println("\t"+isla.getP4().getNombre()+", de "+isla.getP1().getEdad()+" años y su pareja es: "+isla.getP4().getPareja().getNombre() +", de "+isla.getP4().getPareja().getEdad()+" años.");
    }

}
