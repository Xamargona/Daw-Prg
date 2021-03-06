package Tr3.UD9_Clases_Avanzadas.ejer124;

public class Punto {
    private int c1;
    private int c2;

    public Punto (int c1, int c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public String toString(){
        return "("+c1+","+c2+")";
    }

    public int getC1() {
        return c1;
    }

    public int getC2() {
        return c2;
    }

    public void setC1(int c1) {
        this.c1 = c1;
    }

    public void setC2(int c2) {
        this.c2 = c2;
    }
}
