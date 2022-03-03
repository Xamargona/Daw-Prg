package Tr2.UD7_Orientación_objetos.ejer95;

public class Principal {

    public static void main(String[] args) {
        Pizza p1 = new Pizza("margarita","mediana");
        p1.estado_pizza();
        Pizza p2 = new Pizza("hawaina","familiar");
        p2.estado_pizza();
        System.out.println(Pizza.getPizzas_pedidas());
        p1.servir();
        p1.estado_pizza();
        p1.servir();
        System.out.println(Pizza.getPizzas_pedidas());
        System.out.println(Pizza.getPizzas_servidas());
    }

}
