package Tr3.Examen_JavierMG;

import java.util.ArrayList;

public class Collar implements Interface_Collar{

    private ArrayList<Perla> perlas;
    private double longitud;

    public Collar(double longitud) {
        this.longitud = longitud;
        this.perlas = new ArrayList<Perla>();
    }

    public void addPerla(Perla p) {
        perlas.add(p);
    }

    @Override
    public double calcular_precio() {
        double precioFinal = 0;
        for (Perla p : perlas) {
            precioFinal = precioFinal + p.calcular_precio();
        }
        return precioFinal;
    }

    @Override
    public String toString() {
        StringBuilder cadena = new StringBuilder("JOYERIA\n-------\nEl collar tiene una cadena de " + longitud + " cm. y las siguientes perlas:\n");
        double precio_total = 0;
        for (Perla p: perlas) {
            cadena.append(p.toString());
            precio_total = precio_total + p.calcular_precio();
        }
        cadena.append("Por lo que el precio total del collar es de ").append(precio_total).append(" €.\n");
        return cadena.toString();
    }
}
