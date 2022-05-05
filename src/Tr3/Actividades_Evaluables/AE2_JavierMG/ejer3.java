package Tr3.Actividades_Evaluables.AE2_JavierMG;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class ejer3 {
    public static void main(String[] args) {
        ArrayList<String> orden1 =new ArrayList<>();
        ArrayList<String> orden2 =new ArrayList<>();
        File lista1 = new File("/home/javgon01/IdeaProjects/DAW Programación/src/Tr3/Actividades_Evaluables/AE2_JavierMG/Salida1.txt");
        File lista2 = new File("/home/javgon01/IdeaProjects/DAW Programación/src/Tr3/Actividades_Evaluables/AE2_JavierMG/Salida2.txt");
        File archivo = new File("/home/javgon01/IdeaProjects/DAW Programación/src/Tr3/Actividades_Evaluables/AE2_JavierMG/Salida3.txt");
        try {
            archivo.createNewFile();
            Scanner nombres = new Scanner(lista1);
            Scanner asignaturas = new Scanner(lista2);
            FileWriter escritura = new FileWriter(archivo);
            escritura.write(nombres.nextLine().substring(0,17)+asignaturas.nextLine().substring(3,14)+"\n");
            while (nombres.hasNext()){
                orden1.add(nombres.nextLine());
            }
            while (asignaturas.hasNext()){
                orden2.add(asignaturas.nextLine());
            }
            for (int i = 0; i < orden2.size(); i++) {
                for (int j = 0; j < orden1.size(); j++) {
                    if (orden1.get(j).substring(0,3).equalsIgnoreCase(orden2.get(i).substring(0,3))){
                        escritura.write(orden1.get(j)+orden2.get(i).substring(3,orden2.get(i).length())+"\n");
                    }
                }
            }

            escritura.close();

        } catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
