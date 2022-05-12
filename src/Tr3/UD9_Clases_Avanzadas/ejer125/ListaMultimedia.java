package Tr3.UD9_Clases_Avanzadas.ejer125;

import java.util.ArrayList;

public class ListaMultimedia {

    private int tam;
    private int num = 0;
    private Multimedia[] almacen;

    public ListaMultimedia (int tam) {
        this.tam = tam;
        almacen = new Multimedia[tam];
    }

    public boolean add(Multimedia m) {
        if (almacen.length == tam-1) {
            return false;
        } else {
            almacen[num] = m;
            num = num + 1;
            return true;
        }
    }

    public int size() {
        return num;
    }

    public int indexof(Multimedia m) {
        for (int i = 0; i < num; i++) {
            if (almacen[i] == m) {
                return i;
            }
        }
        return -1;
    }

    public String toString () {
        StringBuilder info = new StringBuilder();
        for (int i = 0; i < num; i++) {
            info.append(almacen[i].toString()).append("\n");
        }
        return info.toString();
    }
}
