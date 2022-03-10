package Tr2.AceptaElReto;
import  java.util.*;

public class AE151 {
    static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n_filas = 1;
        while (sc.hasNext() && n_filas!=0){
            n_filas = sc.nextInt();
            if (n_filas == 0){
                break;
            }
            int[][]matriz = new int[n_filas][n_filas];
            for (int i = 0; i < n_filas; i++){
                for (int j = 0; j < n_filas; j++){
                    int valor = sc.nextInt();
                    matriz[i][j] = valor;
                }
            }
            boolean verificaor = true;
            for (int i = 0; i < n_filas; i++) {
                for (int j = 0; j < n_filas; j++) {
                    if (i == j && matriz[i][j] != 1){
                        verificaor = false;
                    } else if (i != j && matriz[i][j] != 0) {
                        verificaor = false;;
                    }
                }
            }
            if (verificaor){
                System.out.println("SI");
            }else {
                System.out.println("NO");
            }
        }
    }
}
