package Tr1.UD2;

import java.util.Scanner;

public class ejer35 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Introduzca la altura de la bandera:");
		
		int altura = input.nextInt();
		input.nextLine();
		
		System.out.println("Introduzca la anchura de la bandera:");
		
		int anchura = 0;
		input.nextLine();
		
		System.out.println("¿Quiere escudo bordado? (s/n)");
				
		String escudo = input.nextLine();
		
		while(!escudo.equals("n") && !escudo.equals("N") && !escudo.equals("s") && !escudo.equals("S")){
			
			System.out.println("Introduce un valor válido:");
				
			escudo = input.nextLine();
		
		}
		
		int bandera = altura*anchura;	
		
		double precio_bandera = bandera/100;
		
		double precio = 0;
		
		double valor_escudo = 2.5;
		
		double envio = 3.25;
				
		if(escudo.equals("s") || !escudo.equals("S")) {
						
			precio = precio_bandera + valor_escudo + envio;
			
		}else if(escudo.equals("n") || !escudo.equals("N")) {
			
			precio = precio_bandera + envio;
			valor_escudo = 0;
			
		}
	
		
		System.out.println("Gracias. Aquí tiene el desglose de su compra.");
		System.out.println("Bandera de " + bandera + " cm²:      " + precio_bandera + " €");
		
		if(escudo.equals("s") || !escudo.equals("S")) {
			System.out.println("Con escudo:            " + valor_escudo + " €");
		}else {
			System.out.println("Sin escudo:            " + valor_escudo + " €");
		}
		System.out.println("Gastos de envío:       " + envio + " €");
		System.out.println("Total:                 " + precio + " €");

	}

}
