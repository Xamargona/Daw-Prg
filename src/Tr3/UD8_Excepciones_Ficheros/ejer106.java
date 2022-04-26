package Tr3.UD8_Excepciones_Ficheros;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class ejer106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File archivo = new File("/home/javgon01/Escriptori/index.html");
        try {
            archivo.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        FileWriter escritura = null;
        try {
            escritura = new FileWriter(archivo);

            escritura.write("<html>\n");

            System.out.println("Introduzca el título (<title>) de la página web:");
            String entrada = sc.nextLine();
            escritura.write("<head>\n<title>"+entrada+"</title>\n</head>\n");

            System.out.println("Introduzca el texto del rotulo h1 (<h1>) de la página web:");
            entrada = sc.nextLine();
            escritura.write("<body>\n<h1>"+entrada+"</h1>\n");

            System.out.println("Introduzca el texto del parrafo p (<p>) de la pagina web:");
            entrada = sc.nextLine();
            escritura.write("<p>"+entrada+"</p>\n");

            System.out.println("Introduzca la página web que se enlazará en la etiqueta <a href=>:");
            entrada = sc.nextLine();
            escritura.write("<a href = "+'"'+entrada+'"'+">Esto es un enlace</a>\n");

            escritura.write("</body>\n</html>");

            System.out.println("Pagina web creada!, gracias por utilizar este programa...");

            escritura.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
