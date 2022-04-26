package Tr3.UD8_Excepciones_Ficheros;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class ejer103 {
    public static void main(String[] args) {
        //creo los objetos a trabajar
        File archivo_nuevo = new File("/home/javgon01/Escriptori/archivo2.txt");
        File archivo = new File("/home/javgon01/Escriptori/archivo.txt");

        try {
            //creo el nuevo fichero
            archivo_nuevo.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //asigno el objeto de escitura al nuevo archivo y el scanner al otro
        FileWriter escritura = null;
        try {
            Scanner sc = new Scanner(archivo);
            escritura = new FileWriter(archivo_nuevo);
            while (sc.hasNext()) {
                escritura.write(sc.nextLine()+"\n");
            }
            escritura.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
