package Tr3.UD8_Excepciones_Ficheros;
import java.io.File;
import java.io.IOException;
import java.util.*;
public class ejer107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántas carpetas quiere crear en el escritorio?");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("¿Qué nombre quiere que aparezca en las carpetas?");
        String nombre = sc.nextLine();

        for (int i = 1; i <= n; i++) {
            File archivo = new File("/home/javgon01/Escriptori/"+nombre+i);
            archivo.mkdir();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
