package Tr3.UD9_Clases_Avanzadas.ejer124;

import java.util.ArrayList;

public class Poligono {
    private ArrayList<Punto> poligono = new ArrayList<Punto>();

    public Poligono (){}

    public void add (Punto punto) {
        this.poligono.add(punto);
    }

    public void trasladar (int x, int y) {
        for (Punto punto:poligono) {
            punto.setC1(punto.getC1()+x);
            punto.setC2(punto.getC2()+y);
        }
    }

    public void escalar (int x) {
        for (Punto punto:poligono) {
            punto.setC1(punto.getC1()*x);
            punto.setC2(punto.getC2()*x);
        }
    }

    public void n_vertices () {
        System.out.println(poligono.size());
    }

    public String toString () {
        StringBuilder info = new StringBuilder();
        for (Punto punto:poligono) {
            info.append(punto.toString()).append("\n");
        }
        return info.toString();
    }
}

