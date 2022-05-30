package Tr3.Actividades_Evaluables.AE3_JavierMG;

import java.util.*;

public class Orco extends CriaturaSinAlas{

    private boolean colmillos;
    private String arma;

    public Orco(String nombre, int edad, boolean colmillos) {
        super(nombre, edad, false);
        this.colmillos = colmillos;
        arma = null;
    }

    public void armar(String arma) {
        this.arma = arma;
        System.out.println(nombre+" ha sido equipado con una "+arma);
        if (arma.equalsIgnoreCase("hacha") && colmillos == true){
            this.temible = true;
            System.out.println(nombre+" tiene un hacha y colmillos, es temible!");
        }
    }

    @Override
    public void presentarse() {
        System.out.printf("Soy "+nombre+" un orco de "+edad+" años ");
        if (colmillos) {
            System.out.printf(" tengo colmillos ");
        } else {
            System.out.printf(" no tengo colmillos");
        }

        if (arma != null){
            System.out.printf(" voy armado con una "+arma);
        } else {
            System.out.print(" voy desarmado");
        }

        if (temible) {
            System.out.print(" soy temible!\n");
        } else {
            System.out.print(" no soy temible.\n");
        }

    }
}
