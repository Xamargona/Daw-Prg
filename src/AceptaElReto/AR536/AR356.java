package AceptaElReto.AR536;

import java.util.Scanner;

public class AR356 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int x = sc.nextInt();
            //---------------------
            int[] tam = new int[x];
            int[] abono = new int[x];
            int[] agua = new int[x];
            int[] dist = new int[x];
            String[] propietarios = new String[x];
            //---------------------
            int mayorTam = 0;
            int menosAgua = 0;
            int menosDist = 0;
            int mensoAbono = 0;
            //---------------------
            for (int i = 0; i < x; i++) {
                //-------------------
                tam[i] = sc.nextInt();
                if (tam[i] > mayorTam) {
                    mayorTam = tam[i];
                }
                //-------------------
                abono[i] = sc.nextInt();
                if (abono[i] > mensoAbono) {
                    mensoAbono = abono[i];
                }
                //-------------------
                agua[i] = sc.nextInt();
                if (agua[i] > menosAgua) {
                    menosAgua = agua[i];
                }
                //-------------------
                dist[i] = sc.nextInt();
                if (dist[i] > menosDist) {
                    menosDist = dist[i];
                }
                //-------------------
                sc.nextLine();
                propietarios[i] = sc.nextLine();
            }
            boolean verificador = verificar(tam, mayorTam);
            if (verificador) {
                imprimir(tam, mayorTam, propietarios);
            }else {
                verificador = verificar(agua, menosAgua);
                if (verificador) {
                    imprimir(agua, menosAgua, propietarios);
                }else {
                    verificador = verificar(abono, mensoAbono);
                    if (verificador) {
                        imprimir(abono, mensoAbono, propietarios);
                    }
                }
            }
        }
    }
    public static boolean verificar(int[]lista, int x){
        int contador = 0;
        for (int i = 0; i < lista.length; i++) {
            if (x == lista[i]) {
                contador++;
            }
        }
        if (contador != 1) {
            return false;
        }
        return true;
    }

    public static void imprimir (int[]lista, int x, String[]lista2){
        for (int i = 0; i < lista.length; i++) {
            if (x == lista[i]) {
                System.out.println(lista2[i]);
            }
        }
    }
}