package Tr1.Actividades_Evaluables.AE1_JavierMG;

import java.util.Scanner;

public class eval13 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Introduce un número positivo:");
		
		int x = input.nextInt();
		input.nextLine();
		
		while(x%2 != 0){
			
			System.out.println("Error, ntroduce un número positivo:");
			
			x = input.nextInt();
			input.nextLine();
		}
	
		for(int i = 1; i <= x; i++){
			
			for(int j = i; j <= x; j++) {
				
				int resultado = i + j + (2*i*j);
				System.out.println("Par " + i + "," + j + ": " + i + "+" + j + "+" + "2*" + i + "*" + j + " vale " + resultado);
				
			}	
		}
	}
}
