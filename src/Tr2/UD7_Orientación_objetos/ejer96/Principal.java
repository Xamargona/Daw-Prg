package Tr2.UD7_Orientación_objetos.ejer96;
import java.util.*;

public class Principal {
    static final Scanner sc = new Scanner(System.in);
    static ArrayList<Billete> lista_billetes = new ArrayList();

    public static void main(String[] args) {
        lista_billetes.add(new Billete("","",0,0));
        char x;
        do {
            x = seleccion_menu();
            switch (x){
                case '1': comprar_billete();
                    break;
                case '2': cancelar_billete();
                    break;
                case '3': imprimir_lista();
                    break;
                case 's':
                case 'S':
                    break;
            }

        }while(Character.compare(x,'s') != 0 && Character.compare(x, 'S') != 0);
    }

    public static char seleccion_menu(){
        System.out.println("1-Comprar billete de avion");
        System.out.println("2-Cancelar billete de avion");
        System.out.println("3-Estado de mi reserva");
        System.out.println("S-Salir");
        char opcion = sc.next().charAt(0);
        if (opcion != '1' &&
            opcion != '2' &&
            opcion != '3' &&
            opcion != 's' &&
            opcion != 'S') {
         opcion = seleccion_menu();
        }
        sc.nextLine();
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
        if (contador != 3){
            System.out.println("ERROR, hemos detectado "+contador+" @ cuando deberia ser 4");
        }else{
            dividir_cadena(info);
        }
    }

    public static void dividir_cadena(String cadena){
        String [] partes = cadena.split("@");
        String origen = partes[0];
        String destino = partes[1];
        int dia_ida = Integer.parseInt(partes[2]);
        int dia_vuelta = Integer.parseInt(partes[3]);
        Billete billete = new Billete(origen,destino,dia_ida,dia_vuelta);
        lista_billetes.add(billete);
        System.out.println("Billete comprado");
    }

    public static void cancelar_billete(){
        int entrada;
        if (lista_billetes.size()==1){
            return;
        }
        do {
            System.out.println("Introduzca id del billete a cancelar");
            entrada = sc.nextInt();
        }while(entrada < 0 || entrada > lista_billetes.size());
        sc.nextLine();
        if(lista_billetes.get(entrada).getEstado()){
            System.out.println("Billete encontrado, ¿Confirma su cancelación(S/N)?");
            String respuesta = "";
            do {
                respuesta = sc.nextLine();
            }while(!respuesta.equalsIgnoreCase("s")&&!respuesta.equalsIgnoreCase("n"));
            if (respuesta.equalsIgnoreCase("s")){
                lista_billetes.get(entrada).setEstado(false);
                System.out.println("Billete cancelado correctamente");
            }else{
                System.out.println("Proceso de cancelación cancelado");
            }
        }else{
            System.out.println("El billete ya se encuentra cancelado");
        }
    }

    public static void imprimir_lista(){
        System.out.println("¿Qué vuelos desea ver? (V-Vigentes, C-Cancelados, T-Todos)");
        String respuesta = "";
        do {
            respuesta = sc.nextLine();
        }while(!respuesta.equalsIgnoreCase("v")&&!respuesta.equalsIgnoreCase("c")&&!respuesta.equalsIgnoreCase("t"));
        if (respuesta.equalsIgnoreCase("v")) {
            for (int i = 1; i < lista_billetes.size(); i++) {
                if (lista_billetes.get(i).getEstado()) {
                    System.out.printf(i+":");
                    lista_billetes.get(i).muestra();
                }
            }
        } else if (respuesta.equalsIgnoreCase("c")) {
            for (int i = 1; i < lista_billetes.size(); i++) {
                if (!lista_billetes.get(i).getEstado()) {
                    System.out.printf(i+":");
                    lista_billetes.get(i).muestra();
                }
            }
        }else if (respuesta.equalsIgnoreCase("t")) {
            for (int i = 1; i < lista_billetes.size(); i++) {
                System.out.printf(i+":");
                lista_billetes.get(i).muestra();
                }
            }
        }
}
