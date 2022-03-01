package Tr1.Actividades_Evaluables.AE3_JavierMG;

import java.util.*;

public class eval31 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("Bienvenido a VEGGIE-BAR!");
		System.out.println("PASO1: PRIMER PLATO");
		System.out.println("¿Cuantos primeros platos tendrá el menú?");
		
		int can_p1 = sc.nextInt();
		sc.nextLine();
		String[] platos = new String [can_p1];
		String plato; 
		int precio;
		int[] precios = new int [can_p1];
		
		for(int i = 0; i < can_p1; i++) {
			System.out.println("Introduzca el plato " + (i+1) + " de " + can_p1 + ":");
			plato = sc.nextLine();
			while(plato.indexOf("verduras")==-1){
				System.out.println("Ojo este plato no contiene verduras!");
				System.out.println("Introduzca el plato " + (i+1) + " de " + can_p1 + ":");
				plato = sc.nextLine();
			}
			platos[i] = plato;
			System.out.println("Introduzca el precio para " + plato + ":");
			precio = sc.nextInt();
			sc.nextLine();
			precios[i] = precio;
			System.out.println("Se ha dado de alta el plato "+plato+" que cuesta "+ precio +"€.");
		}
		
		//----------------------------------------------------------------------------------------------
		
		System.out.println("PASO2: POSTRES");
		System.out.println("¿Cuantos postres tendrá el menú?");
		
		int can_postres = sc.nextInt();
		sc.nextLine();
		String[] postres = new String [can_postres];
		String postre; 
		int precio_postre;
		int[] precios_postres = new int [can_postres];
		
		for(int i = 0; i < can_postres; i++) {
			System.out.println("Introduzca el postre " + (i+1) + ":");
			postre = sc.nextLine();
			if(postre.indexOf("aguacate")==-1){
				precio_postre = 5;
			}else {
				precio_postre = 8;
			}
			postres[i] = postre;
			precios_postres[i] = precio_postre;
			System.out.println("Se ha dado de alta el postre "+postre+" que cuesta "+ precio_postre +"€.");
		}
		
		//----------------------------------------------------------------------------------------------
	
		System.out.println("PASO3: Se ha dado de alta el siguiente menu...");
		System.out.println("PRIMEROS PLATOS");
		for(int i = 0; i < can_p1; i++) {
			System.out.println((i+1) + " :" + platos[i] + "....." + precios[i] + "€");
		}
		System.out.println();
		System.out.println("POSTRES");
		for(int i = 0; i < can_postres; i++) {
			System.out.println((i+1) + " :" + postres[i] + "....." + precios_postres[i] + "€");
		}
		
		//----------------------------------------------------------------------------------------------

		System.out.println("PASO4: HACER UN PEDIDO");
		String pedido;
		String pedido_postre;
		int variable_pedido = 0;
		int variable_postre = 0;
		
		System.out.println("Introduzca nombre de primer plato:");
		pedido = sc.nextLine();
		
		for(int i = 0; i < can_p1;){
			int a = pedido.compareTo(platos[i]);
			if(a == 0){
				variable_pedido = i;
				break;
			}else if(i == can_p1-1){
				System.out.println("Ese plato no existe en el menu...");
				System.out.println("Introduzca nombre de primer plato:");
				pedido = sc.nextLine();
				i = -1;
			}
			i++;
		}
	
		System.out.println("Introduzca nombre de postre:");
		pedido_postre = sc.nextLine();

		for(int i = 0; i < can_postres;){
			int a = pedido_postre.compareTo(postres[i]);
			if(a == 0){
				variable_postre = i;
				break;
			}else if(i == can_postres-1){
				System.out.println("Ese plato no existe en el menu...");
				System.out.println("Introduzca nombre de postre:");
				pedido_postre = sc.nextLine();
				i = -1;
			}
			i++;
		}

		System.out.println("Este es tu pedido...");
		System.out.println("Primer plato: " + platos[variable_pedido] + "....." + precios[variable_pedido] +"€.");
		System.out.println("Postre: " + postres[variable_postre] + "....." + precios_postres[variable_postre] +"€.");
		System.out.println("TOTAL: " + (precios_postres[variable_postre]+precios[variable_pedido]) + " €.");
		System.out.println("Gracias por venir a VEGGIE-BAR!");

	}
}
