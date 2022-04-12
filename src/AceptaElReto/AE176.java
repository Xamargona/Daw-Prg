package AceptaElReto;
import java.util.*;
public class AE176 {
    static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (true){
            int tam1 = sc.nextInt();
            int tam2 = sc.nextInt();
            sc.nextLine();
            if(tam1 == 0 && tam2 == 0){
                break;
            }
            String[][] matriz = new String[tam1][tam2];
            for (int i = 0; i < tam1; i++) {
                String dividir = sc.nextLine();
                char[] cadena = dividir.toCharArray();
                for (int j = 0; j < tam2; j++) {
                    matriz[i][j] = Character.toString(cadena[j]);
                }
            }

            int contador = 0;

            for (int i = 1; i < tam1-1; i++) {
                for (int j = 1; j < tam2-1; j++) {
                    if(matriz[i][j].equalsIgnoreCase("_")){
                        int minas = 0;
                        //---------------------------------
                        if (matriz[i-1][j-1].equalsIgnoreCase("*")){
                            minas++;
                        }
                        if (matriz[i-1][j].equalsIgnoreCase("*")){
                            minas++;
                        }
                        if (matriz[i-1][j+1].equalsIgnoreCase("*")){
                            minas++;
                        }
                        if (matriz[i][j-1].equalsIgnoreCase("*")){
                            minas++;
                        }
                        if (matriz[i][j+1].equalsIgnoreCase("*")){
                            minas++;
                        }
                        if (matriz[i+1][j-1].equalsIgnoreCase("*")){
                            minas++;
                        }
                        if (matriz[i+1][j].equalsIgnoreCase("*")){
                            minas++;
                        }
                        if (matriz[i+1][j+1].equalsIgnoreCase("*")){
                            minas++;
                        }
                        if (minas >= 6){
                            contador++;
                        }
                        //---------------------------------
                    }
                }
            }
            System.out.println(contador);

        }
    }
}
