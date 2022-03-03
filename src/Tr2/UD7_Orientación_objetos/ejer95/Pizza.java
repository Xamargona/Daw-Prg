package Tr2.UD7_Orientación_objetos.ejer95;

public class Pizza {

    private String tam;
    private String tipo;
    private String estado;
    static int pizzas_pedidas = 0;
    static int pizzas_servidas = 0;

    public Pizza(String tipo,String tam){
        this.tam = tam;
        this.tipo = tipo;
        estado = "pedida";
        pizzas_pedidas++;
    }

    public void estado_pizza(){
        System.out.println("Pizza de tipo "+tipo+" y tamaño "+tam+". Estado: "+estado);
    }

    public void servir() {
        if (estado.equals("servida")){
            System.out.println("Esta pizza ya se ha servido");
            return;
        }
        estado = "servida";
        pizzas_pedidas--;
        pizzas_servidas++;
    }

    public static int getPizzas_servidas() {
        return pizzas_servidas;
    }

    public static int getPizzas_pedidas() {
        return pizzas_pedidas;
    }
}
