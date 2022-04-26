package Tr3.UD8_Excepciones_Ficheros;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ejer102 {
    public static void main(String[] args) {

        File archivo = new File("/home/javgon01/Escriptori/archivo.txt");
        try {
            archivo.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        FileWriter escritura = null;
        try {
            escritura = new FileWriter(archivo);
            for (int i = 0; i < 50; i++) {
                escritura.write(Integer.toString(i)+"\n");
            }
            escritura.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
