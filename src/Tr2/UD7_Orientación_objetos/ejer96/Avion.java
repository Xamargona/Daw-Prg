package Tr2.UD7_Orientación_objetos.ejer96;

public class Avion {

    private String origen;
    private String destino;
    private int dia_ida;
    private int dia_vuelta;
    private String estado;

    public Avion(String origen, String destino, int dia_ida, int dia_vuelta){
        this.origen = origen;
        this.destino = destino;
        this.dia_ida = dia_ida;
        this.dia_vuelta = dia_vuelta;
        estado = "Vigente";
    }


}
