package Tr1.UD2;

import java.util.Scanner;

public class ejer7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce el valor de la variable a");
		
		int a = input.nextInt();
		input.nextLine();
		
		
		System.out.println("Introduce el valor de la variable b");
		
		int b = input.nextInt();
		input.nextLine();
		
		System.out.println("Al principio del programa, el valor de a es " + a + " y el valor de b es " + b + ".");
		
		int c = a;
		a = b;
		b = c;
		
		System.out.println("Después del intercambio, el valor de a es " + a + " y el valor de b es " + b + ".");

	}

}
