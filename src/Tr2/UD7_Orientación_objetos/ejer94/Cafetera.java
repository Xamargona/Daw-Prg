package Tr2.UD7_Orientación_objetos.ejer94;

public class Cafetera {

    private int capacidad_maxima;
    private int cantidad_actual;

    public Cafetera(int capacidad_maxima){
        this.capacidad_maxima = capacidad_maxima;
    }

    public void llenar_cafetera() {
        cantidad_actual = capacidad_maxima;
        System.out.println("La cafetera está llena, hay disponibles "+capacidad_maxima+"cl.");
    }

    public void vaciar_cafetera() {
        cantidad_actual = 0;
        System.out.println("Cafeteria vacía");
    }

    public void agregar_cafe(int cantidad) {
        if (cantidad < 0){
            System.out.println("Creo que te has equivocado");
            return;
        }
        if (cantidad_actual+cantidad > capacidad_maxima) {
            System.out.println("La cantidad actual es: " + cantidad_actual + "cl. La capacidad máxima es: " + capacidad_maxima + " por lo que si agregamos " + cantidad + "cl se desbordaria la cafetera");
            return;
        }
        cantidad_actual = cantidad_actual+cantidad;
        System.out.println("Agregados "+cantidad+"cl. Cantidad actual de "+cantidad_actual+"cl.");
    }

    public void servir_taza(int cantidad_solicitada) {
        if (cantidad_actual == 0){
            System.out.println("Lo siento, la cafetera está vacía");
            return;
        }
        if (cantidad_solicitada > cantidad_actual){
            System.out.println("Lo siento, solo te he podido servir "+ cantidad_actual +"cl");
            cantidad_actual = 0;
            return;
        }
        cantidad_actual = cantidad_actual - cantidad_solicitada;
        System.out.println("Servimos una taza de "+cantidad_solicitada+"cl y quedan en la cafetera "+ cantidad_actual +"cl.");
    }

}
