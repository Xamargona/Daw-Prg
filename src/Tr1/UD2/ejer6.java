package Tr1.UD2;

import java.util.Scanner;

public class ejer6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Siguiendo la ecuación de segundo grado introduce el valor de cada variable:");
		
		System.out.println("Introduce un valor para la variable 'a'.");
		
		int a = input.nextInt();
		input.nextLine();
		
		while(a == 0){
			System.out.println("La ecuación es indefinida, introduce un valor distinto de 0 para a.");
			System.out.println("Introduce un valor para la variable 'a'.");
			a = input.nextInt();
			input.nextLine();
		}		
		
		System.out.println("Introduce un valor para la variable 'b'.");
		int b = input.nextInt();
		input.nextLine();
		
		System.out.println("Introduce un valor para la variable 'c'.");
		int c = input.nextInt();
		input.nextLine();
		
		
		if(((b*b) - 4*a*c) < 0){
			System.out.println("La ecuación no tiene solución");
		}else{
			 double x = (-b-(Math.sqrt((b*b)-4*a*c)))/(2*a);
			 double y = (-b+(Math.sqrt((b*b)-4*a*c)))/(2*a);
			 
			 System.out.println("Los resultados de la ecuación són " + x + " y " + y);			
		}
	}
}
