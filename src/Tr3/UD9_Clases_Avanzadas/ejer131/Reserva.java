package Tr3.UD9_Clases_Avanzadas.ejer131;

public class Reserva {

    private String fecha;
    private int hora;
    private int personas;
    private String cliente;
    private Mesa mesa;

    public Reserva(String fecha, int hora, int personas, String cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.personas = personas;
        this.cliente = cliente;
        this.mesa = mesa;
        mesa.ocuparMesa();
    }
}
