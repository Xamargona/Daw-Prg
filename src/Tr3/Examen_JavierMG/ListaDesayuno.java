package Tr3.Examen_JavierMG;

import java.util.ArrayList;

public class ListaDesayuno {

    private ArrayList<Bolleria> bollos;

    public ListaDesayuno(){
        bollos = new ArrayList<Bolleria>();
    }

    public void anyadir_bollo(Bolleria b) {
        bollos.add(b);
    }

    public String toString() {
        StringBuilder cadena = new StringBuilder("DESAYUNO\n-------\n");
        double precio_total = 0;
        for (Bolleria b: bollos) {
            cadena.append(b.toString());
            precio_total = precio_total + b.getPrecio();
        }
        cadena.append("Por lo que el precio total del desayuno es de ").append(precio_total).append(" €.\n");
        return cadena.toString();
    }
}
