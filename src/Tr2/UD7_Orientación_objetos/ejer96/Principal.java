package Tr2.UD7_Orientación_objetos.ejer96;
import java.sql.Array;
import java.util.*;

public class Principal {
    static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        char x;
        do {
            x = seleccion_menu();
            switch (x){
                case '1': break;
                case '2': break;
                case '3': break;
                case '4': break;
                case 's': break;
                case 'S': break;
            }

        }while(Character.compare(x,'s') != 0 && Character.compare(x, 'S') != 0);


    }

    public static char seleccion_menu(){
        System.out.println("1-Comprar billete de avion");
        System.out.println("2-Cancelar billete de avion");
        System.out.println("3-Estado de mi reserva");
        System.out.println("S-Salir");
        char opcion = sc.next().charAt(0);
        if (opcion != '1' ||
                opcion != '2' ||
                opcion != '3' ||
                opcion != 's' ||
                opcion != 'S') {
         opcion = seleccion_menu();
        }
        return opcion;
    }

    public static void comprar_billete(){
        System.out.println("Introduzca origen, destino, dia de ida y de vuelta separados por @:");
        String info = sc.nextLine();
        char[] cadena = info.toCharArray();
        int contador = 0;
        for (int i = 0; i < cadena.length; i++) {
            if (cadena[i] == '@'){
                contador++;
            }
        }
        if (contador != 4){
            System.out.println("ERROR, hemos detectado "+contador+" @ cuando deberia ser 4");
            return;
        }else{
            dividir_cadena(info);
        }
    }
    public static void dividir_cadena(String cadena){
        String [] partes = cadena.split("@");
        String origen = partes[0];
        partes = partes[1].split("@");
        String destino = partes[0];
        partes = partes[1].split("@");
        int dia_ida = Integer.parseInt(partes[0]);
        partes = partes[1].split("@");
        int dia_vuelta = Integer.parseInt(partes[0]);

    }
}
