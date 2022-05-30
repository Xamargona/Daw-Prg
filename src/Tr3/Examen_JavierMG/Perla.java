package Tr3.Examen_JavierMG;
import java.util.Random;
import java.util.*;

public class Perla implements Interface_Perla{

    Random r = new Random();
    private int peso;
    private double precio;
    private String material;

    public Perla() {
        this.peso = peso_aleatorio();
        this.material = material_aleatorio();
        this.precio = calcular_precio();
    }

    @Override
    public int peso_aleatorio() {
        return (int)(r.nextDouble() * 100 + 50);
    }

    @Override
    public String material_aleatorio() {
        int aux = (int)(r.nextDouble() * 4 + 1);
        switch (aux) {
            case 1 -> {
                return "plata";
            }
            case 2 -> {
                return "oro";
            }
            case 3 -> {
                return "platino";
            }
            case 4 -> {
                return "rodio";
            }
        }
        return "";
    }

    @Override
    public double calcular_precio() {
        switch (this.material){
            case "plata" -> {
                return this.peso*2.25;
            }
            case "oro" -> {
                return this.peso*7.5;
            }
            case "platino" -> {
                return this.peso*10;
            }
            case "rodio" -> {
                return this.peso*12;
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "-Perla de "+material+" que pesa "+peso+" g."+" PVP: "+precio+" €.\n";
    }
}
