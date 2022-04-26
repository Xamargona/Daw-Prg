package Tr3.UD8_Excepciones_Ficheros;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class ejer104 {
    public static void main(String[] args) {

        File archivo_nuevo = new File("/home/javgon01/Escriptori/archivo3.txt");
        File archivo_copiar = new File("/home/javgon01/Escriptori/archivo.txt");

        try {
            archivo_nuevo.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        FileWriter entrada = null;

        try {
            Scanner sc = new Scanner(archivo_copiar);
            entrada = new FileWriter(archivo_nuevo);
            while (sc.hasNext()) {
                String linea = sc.nextLine();
                if (Integer.parseInt(linea)%5 == 0) {
                    entrada.write(linea+"\n");
                }
            }
            entrada.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
