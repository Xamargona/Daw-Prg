package AceptaElReto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AE270 {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n_casos = -1;
        while (sc.hasNext()) {
            n_casos = sc.nextInt();
            if (n_casos == 0) {
                break;
            }
            sc.nextLine();
            String alumno;
            String resultado;
            ArrayList<String> alumnos = new ArrayList();
            ArrayList<Integer> resultados = new ArrayList();
            for (int i = 0; i < n_casos; i++) {
                alumno = sc.nextLine();
                resultado = sc.nextLine();
                int aux;
                if (resultado.equalsIgnoreCase("CORRECTO")) {
                    aux = 1;
                } else {
                    aux = -1;
                }

                if (!alumnos.contains(alumno)) {
                    alumnos.add(alumno);
                    resultados.add(aux);
                } else if (alumnos.contains(alumno)) {
                    int pos = alumnos.indexOf(alumno);
                    int num = resultados.get(pos) + aux;
                    resultados.set(pos, num);
                }
            }
            String[] fin = new String[alumnos.size()];
            for (int i = 0; i < alumnos.size(); i++) {
                if (resultados.get(i) != 0) {
                    String cadena = alumnos.get(i) + ", " + resultados.get(i);
                    fin[i] = cadena;
                } else {
                    fin[i] = " ";
                }
            }
            Arrays.sort(fin);
            for (int i = 0; i < alumnos.size(); i++) {
                if (!fin[i].equalsIgnoreCase(" ")) {
                    System.out.println(fin[i]);
                }
            }
            System.out.println("---");
        }
    }
}
