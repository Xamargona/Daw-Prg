package Tr1.UD2;

import java.util.Scanner;

public class ejer40 {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("La altura ha de ser un número natural e impar mayor o igual que 3");
		System.out.println("Por favor, introduzca la altura de la X:");
		
		int altura = input.nextInt();
		input.nextLine();
		
		// IMPAR POR QUE NECESITA UN CENTRO
		
		while(altura%2 == 0 || altura < 3){
			
			System.out.println("Introduzca un valor válido");
			altura = input.nextInt();
			input.nextLine();
		}
		
		int bucle = (altura-1)/2;

		//-------------------------------------------

		int variador_y = altura;
		int variador_x = 0;
				
		for (int i = 0; i < bucle; i++){
			
			String y = "";
			
			variador_y = variador_y - 2;
			
			for(int j = 0; j < variador_y; j++) {
				
				y = y + " ";	
			}
			
			String x = "";
			
			for(int j = 0; j < variador_x  ; j++) {
							
				x = x + " ";	
			}
			
			variador_x = variador_x + 1; 
			
			System.out.println(x + "*" + y + "*" + x);
			
			x = x + " ";
		}
		
		//-------------------------------------------

		String z = "";
		
		for (int i = 0; i < bucle; i++) {
			
			z = z + " ";	
		}
		
		//-------------------------------------------

		variador_y = 1;
		variador_x = bucle;
		
		System.out.println(z + "*");
		
		for (int i = 0; i < bucle; i++){
			
			String y = "";
						
			for(int j = 0; j < variador_y; j++) {
				
				y = y + " ";	
			}
			
			variador_y = variador_y + 2;
			
			String x = "";
			
			for(int j = 1; j < variador_x  ; j++) {
							
				x = x + " ";
			}
			
			variador_x = variador_x - 1; 
			
			System.out.println(x + "*" + y + "*" + x);
			
			x = x + " ";

		}
	}
}
