package Tr1.Actividades_Evaluables.AE1_JavierMG;

import java.util.Scanner;

public class eval12 {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
				
		System.out.println("Por favor, introduzca la altura (número impar mayor o igual a 5):");
		
		int altura = input.nextInt();
		input.nextLine();

		while(altura%2 == 0 || altura < 5){
			
			System.out.println("La altura introducida no es correcta");
			altura = input.nextInt();
			input.nextLine();
		}
		
		int bucle = (altura-3)/2;
		
		System.out.println("MMMMMM");
		
		
		
		for(int i = 0; i<bucle; i++) {
		
			System.out.println("M    M");
		
		}
		
		System.out.println("MMMMMM");
		
		for(int i = 0; i<bucle; i++) {
			
			System.out.println("M    M");
		
		}
		
		System.out.println("MMMMMM");

	}
}
