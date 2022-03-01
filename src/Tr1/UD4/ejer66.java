package Tr1.UD4;

import java.util.*;

public class ejer66 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int[][] tablero = new int [3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = 0;
            }
        }

        System.out.println("BIENVENIDO AL 3 EN RAYA");

        int fila;
        int columna;
        int contador1;
        int contador2;
        int contador3;
        int contador4;
        boolean verificador = true;

        while(verificador){

            System.out.println("Introduce la fila y columna de tu tirada:");
            fila = sc.nextInt();
            columna = sc.nextInt();

            if(fila < 0 || fila > 2) {
                System.out.println("La fila está fuera del tablero!. Valores posibles: 0, 1, 2");
                continue;
            }
            if(columna < 0 || columna > 2) {
                System.out.println("La columna está fuera del tablero!. Valores posibles: 0, 1, 2");
                continue;
            }
            if(tablero[fila][columna] == 0) {
                tablero[fila][columna] = 1;
            }else{
                System.out.println("Esta casilla ya estaba escogida!");
                continue;
            }

            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    if(tablero[i][j] == 0) {
                        System.out.print(" - ");
                    }else if(tablero[i][j] == 1){
                        System.out.print(" X ");
                    }else if(tablero[i][j] == 2) {
                        System.out.print(" O ");
                    }
                }
                System.out.println();
            }

            contador1 = 0;
            contador2 = 0;
            contador3 = 0;
            contador4 = 0;
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    if(tablero[i][j] == 1) {
                        contador1 = contador1 +1;
                    }
                    if(tablero[j][i] == 1) {
                        contador2 = contador2 +1;
                    }
                }
                if(contador1 == 3 || contador2 == 3) {
                    System.out.println("Fin del juego. Has ganado!");
                    verificador = false;
                    break;
                }else {
                    contador1 = 0;
                    contador2 = 0;
                }
                if(tablero[i][i] == 1) {
                    contador3 = contador3 +1;
                }
                if(contador3 == 3 ) {
                    System.out.println("Fin del juego. Has ganado!");
                    verificador = false;
                    break;
                }
            }
            for(int i = 2; i >= 0; i--){
                    if (tablero[2-i][i] == 1){
                        contador4 = contador4+1;
                    }
            }
            if(contador4 == 3 ) {
                System.out.println("Fin del juego. Has ganado!");
                verificador = false;
                break;
            }
            if (!verificador) {
                continue;
            }

            contador1 = 0;
            for(int i = 0; i < 3; i++){
                for (int j = 0; j < 3; j++) {
                    if (tablero[i][j] > 0){
                        contador1 = contador1 +1;
                    }
                }
            }
            if (contador1 == 9){
                System.out.println("Empate! No se pueden realizar más movimientos");
                verificador = false;
                break;
            }

            System.out.println("Turno de la máquina");

            fila = (int)(r.nextDouble()*3);
            columna = (int)(r.nextDouble()*3);
            while(tablero[fila][columna] != 0) {
                fila = (int)(r.nextDouble()*3);
                columna = (int)(r.nextDouble()*3);
            }

            tablero[fila][columna] = 2;
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    if(tablero[i][j] == 0) {
                        System.out.print(" - ");
                    }else if(tablero[i][j] == 1){
                        System.out.print(" X ");
                    }else if(tablero[i][j] == 2) {
                        System.out.print(" O ");
                    }
                }
                System.out.println();
            }

            contador1 = 0;
            contador2 = 0;
            contador3 = 0;
            contador4 = 0;

            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    if(tablero[i][j] == 2) {
                        contador1 = contador1 +1;
                    }
                    if(tablero[j][i] == 2) {
                        contador2 = contador2 +1;
                    }
                }
                if(contador1 == 3 || contador2 == 3) {
                    System.out.println("Fin del juego. Has perdido!");
                    verificador = false;
                    break;
                }else {
                    contador1 = 0;
                    contador2 = 0;
                }
                if(tablero[i][i] == 2) {
                    contador3 = contador3 +1;
                }
                if(contador3 == 3 ) {
                    System.out.println("Fin del juego. Has perdido!");
                    verificador = false;
                    break;
                }
            }
            for(int i = 2; i >= 0; i--){
                if (tablero[2-i][i] == 1){
                    contador4 = contador4+1;
                }
            }
            if(contador4 == 3 ) {
                System.out.println("Fin del juego. Has perdido!");
                verificador = false;
                break;
            }
        }
    }
}
