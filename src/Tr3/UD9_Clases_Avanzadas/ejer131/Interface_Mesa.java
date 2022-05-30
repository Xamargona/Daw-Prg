package Tr3.UD9_Clases_Avanzadas.ejer131;

public interface Interface_Mesa {
    public String obtenerDatosMesa();
    public int getnumMesa();
    public void liberarMesa();
    public void ocuparMesa();
    public void pedirPlato(Plato p);
    public void detalle_platos();
    public double calcular_factura();
}
