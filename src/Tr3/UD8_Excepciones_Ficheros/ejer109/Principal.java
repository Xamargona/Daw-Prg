package Tr3.UD8_Excepciones_Ficheros.ejer109;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.io.File;

public class Principal {
    public static void main(String[] args) {
        File xml = new File("/home/javgon01/IdeaProjects/DAW Programación/src/Tr3/UD8_Excepciones_Ficheros/ejer109/ejer121.xml");
        int contador_libros = 0;
        int nota_media = 0;
        try {
            Scanner sc = new Scanner(xml);
            while (sc.hasNext()) {
                String linea = sc.nextLine();
                if (linea.contains("<LIBRO>")) {
                    contador_libros++;
                }
                if (linea.contains("<TITULO>")) {
                    int inicio = linea.indexOf("<TITULO>")+8;
                    int fin = linea.indexOf("</TITULO>");
                    String titulo = linea.substring(inicio,fin);
                    File libro = new File("/home/javgon01/Escriptori/"+titulo+".txt");
                    FileWriter escritura = new FileWriter(libro,true);
                    escritura.write("------------------------"+"\n");

                    linea = sc.nextLine();
                    if (linea.contains("<AUTOR>")) {
                        inicio = linea.indexOf("<AUTOR>")+7;
                        fin = linea.indexOf("</AUTOR>");
                        String autor = linea.substring(inicio,fin);
                        escritura.write("Autor:"+autor+"\n");
                    }
                    linea = sc.nextLine();
                    if (linea.contains("<EDITORIAL>")) {
                        inicio = linea.indexOf("<EDITORIAL>")+11;
                        fin = linea.indexOf("</EDITORIAL>");
                        String editorial = linea.substring(inicio,fin);
                        escritura.write("Editorial:"+editorial+"\n");
                    }
                    linea = sc.nextLine();
                    if (linea.contains("<CATEGORIA>")) {
                        inicio = linea.indexOf("<CATEGORIA>")+11;
                        fin = linea.indexOf("</CATEGORIA>");
                        String categoria = linea.substring(inicio,fin);
                        escritura.write("Categoria:"+categoria+"\n");
                    }
                    linea = sc.nextLine();
                    if (linea.contains("<ISBN>")) {
                        inicio = linea.indexOf("<ISBN")+6;
                        fin = linea.indexOf("</ISBN>");
                        String ISBN = linea.substring(inicio,fin);
                        escritura.write("ISBN:"+ISBN+"\n");
                    }
                    linea = sc.nextLine();
                    if (linea.contains("<NOTA>")) {
                        inicio = linea.indexOf("<NOTA>")+6;
                        fin = linea.indexOf("</NOTA>");
                        String NOTA = linea.substring(inicio,fin);
                        String nota = linea.substring(inicio+1,fin-1);
                        escritura.write("Nota:"+nota+"\n");
                        int putuacion = Integer.parseInt(nota);
                        nota_media = nota_media+putuacion;
                    }
                    linea = sc.nextLine();
                    if (linea.contains("<COMENTARIOS>")) {
                        inicio = linea.indexOf("<COMENTARIOS>")+13;
                        fin = linea.indexOf("</COMENTARIOS>");
                        String COMENTARIOS = linea.substring(inicio,fin);
                        escritura.write("Comentarios:"+COMENTARIOS+"\n");
                    }
                    escritura.write("------------------------");
                    escritura.close();
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(contador_libros);
        float nota_final = nota_media;
        nota_final = nota_final/contador_libros;
        System.out.println(nota_final);
    }
}
