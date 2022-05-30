package Tr3.UD9_Clases_Avanzadas.ejer131;

import java.util.ArrayList;

public class Mesa implements Interface_Mesa{

    private int numMesa;
    private int personas;
    private String estado;
    private String ubicacion;
    private int factura;
    static int id = 0;
    public ArrayList<Plato> lista = new ArrayList<Plato>();

    public Mesa(int personas, String ubicacion) {
        id++;
        this.numMesa = id;
        this.personas = personas;
        this.estado = "LIBRE";
        this.ubicacion = ubicacion;
    }

    @Override
    public String obtenerDatosMesa() {
        return "\n-----------\nNº: "+numMesa+"\nCapacidad: "+personas+
                " personas\nUbicación: "+ubicacion+"\nEstado: "+estado;
    }

    public int getnumMesa() {
        return numMesa;
    }

    @Override
    public void liberarMesa() {
        this.estado = "LIBRE";
    }

    @Override
    public void ocuparMesa() {
        this.estado = "OCUPADA";
    }

    @Override
    public void pedirPlato(Plato p) {
        lista.add(p);
    }

    @Override
    public void detalle_platos() {
        for (Plato p:lista) {
            p.getNombre();
        }
    }

    @Override
    public double calcular_factura() {
        double total = 0;
        for (Plato p:lista) {
            total = total + p.getPrecio();
        }
        return total;
    }
}
