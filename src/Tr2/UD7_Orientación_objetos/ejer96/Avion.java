package Tr2.UD7_Orientación_objetos.ejer96;

public class Avion {

    private int identificador;
    private String origen;
    private String destino;
    private int dia_ida;
    private int dia_vuelta;
    private String estado;
    static int n_billete = 0;

    public Avion(String origen, String destino, int dia_ida, int dia_vuelta, int identificador){
        this.origen = origen;
        this.destino = destino;
        this.dia_ida = dia_ida;
        this.dia_vuelta = dia_vuelta;
        estado = "Vigente";
        identificador =
    }

    public static int getN_billete() {
        return n_billete;
    }

    public static int getNewN_billete() {
        n_billete++;
        return n_billete;
    }
}
