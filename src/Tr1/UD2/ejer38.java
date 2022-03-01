package Tr1.UD2;

import java.util.Scanner;

public class ejer38 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce los valores enteros del que calcular su producto (positivo o negativo) : ");
		
		System.out.println("Primer valor:");
		
		int a = input.nextInt();
		input.nextLine();
		
		System.out.println("Segundo valor:");
		
		int b = input.nextInt();
		input.nextLine();
		
		if(a > 0 && b > 0) {
			System.out.println("El producto de los dos números es positivo.");
		}if(a < 0 && b < 0) {
			System.out.println("El producto de los dos números es positivo.");
		}if(a < 0 && b > 0) {
			System.out.println("El producto de los dos números es negativo.");
		}if(a > 0 && b < 0) {
			System.out.println("El producto de los dos números es negativo.");
		}if(a == 0 || b == 0) {
			System.out.println("El producto de los dos números es 0.");
		}
	}

}