package Tr3.UD9_Clases_Avanzadas.ejer124;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Poligono poligono = new Poligono();
        poligono.add(new Punto(0,0));
        poligono.add(new Punto(0,2));
        poligono.add(new Punto(2,0));
        poligono.add(new Punto(2,2));
        System.out.println(poligono.toString());
        poligono.trasladar(4,-3);
        System.out.println(poligono.toString());
        poligono.escalar(2);
        System.out.println(poligono.toString());
        poligono.n_vertices();
    }
}
