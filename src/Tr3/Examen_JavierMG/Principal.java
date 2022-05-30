package Tr3.Examen_JavierMG;

import java.util.*;
public class Principal {
    public static void main(String[] args) {

        Perla p1 = new Perla();
        Perla p2 = new Perla();
        Perla p3 = new Perla();

        Collar collar = new Collar(16.3);

        collar.addPerla(p1);
        collar.addPerla(p2);
        collar.addPerla(p3);

        Magdalena m1 = new Magdalena(190, "cuadrada",true);
        Magdalena m2 = new Magdalena(83, "redonda",false);
        Napolitana n1 = new Napolitana(210, "crema");
        Napolitana n2 = new Napolitana(332, "chocolate");

        ListaDesayuno desayuno = new ListaDesayuno();
        desayuno.anyadir_bollo(m1);
        desayuno.anyadir_bollo(m2);
        desayuno.anyadir_bollo(n1);
        desayuno.anyadir_bollo(n2);

        System.out.println(collar.toString());
        System.out.println(desayuno.toString());

    }
}
