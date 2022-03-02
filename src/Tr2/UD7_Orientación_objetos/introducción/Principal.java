package Tr2.UD7_Orientación_objetos.introducción;

import java.util.ArrayList;
import java.util.Iterator;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Ordenador> lista_orde = new ArrayList<Ordenador>();
        Ordenador orde1 = new Ordenador("I7",16,512);
        Ordenador orde2 = new Ordenador("I5",8,256);
        lista_orde.add(orde1);
        lista_orde.add(orde2);
        for (Ordenador ordenador : lista_orde) {
            ordenador.encender_ordenador();
        }

    }
}
