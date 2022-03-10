package Tr2.UD7_Orientación_objetos.ejer96;

public class Billete {

    private String origen;
    private String destino;
    private int dia_ida;
    private int dia_vuelta;
    private boolean estado; //true = vigente false = cancelado

    public Billete(String origen, String destino, int dia_ida, int dia_vuelta){
        this.origen = origen;
        this.destino = destino;
        this.dia_ida = dia_ida;
        this.dia_vuelta = dia_vuelta;
        estado = true;
    }
    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public int getDia_ida() {
        return dia_ida;
    }

    public int getDia_vuelta() {
        return dia_vuelta;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void muestra() {
        System.out.println(origen+"-"+destino+" IDA: día "+dia_ida+" VUELTA: día "+dia_vuelta);
    }
}
