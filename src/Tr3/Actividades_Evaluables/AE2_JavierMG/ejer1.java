package Tr3.Actividades_Evaluables.AE2_JavierMG;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;
public class ejer1 {
    public static void main(String[] args) {
        ArrayList<String> orden = new ArrayList<>();
        File lista = new File("/home/javgon01/IdeaProjects/DAW Programación/src/Tr3/Actividades_Evaluables/AE2_JavierMG/entrada1.txt");
        File ordenado = new File("/home/javgon01/IdeaProjects/DAW Programación/src/Tr3/Actividades_Evaluables/AE2_JavierMG/Salida1.txt");
        //creo archivo
        try {
            ordenado.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        //extraigo el texto
        try {
            Scanner entrada = new Scanner(lista);
            //saltamos el numero
            entrada.nextLine();
            while (entrada.hasNext()){
                String linea = entrada.nextLine();
                orden.add(linea);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        //ordeno el texto
        String orden2[] = new String [orden.size()];
        for (int i = 0; i < orden2.length; i++) {
            orden2[i] = orden.get(i);
        }
        Arrays.sort(orden2);
        String aux = orden2[orden2.length-1];
        String aux2 = "";
        for (int i = 0; i < orden2.length-1; i++) {
            if (i == 0){
                aux2 = orden2[i+1];
                orden2[i+1] = orden2[i];
            } else {
                String aux3 = orden2[i+1];
                orden2[i+1] = aux2;
                aux2 = aux3;
            }
        }
        orden2[0] = aux;
        //Salida1.txt
        try {
            FileWriter entrada = new FileWriter(ordenado);
            for (int i = 0; i < orden2.length; i++) {
                entrada.write(orden2[i]+"\n");
            }
            entrada.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
