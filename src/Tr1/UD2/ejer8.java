package Tr1.UD2;

import java.util.Scanner;

public class ejer8 {
	
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.println("Bienvenido a mi calculadora.");
	System.out.println("Introduce el valor de la primera variable:");
	
	int a = input.nextInt();
	input.nextLine();

	System.out.println("Introduce el valor de la segunda variable");
	int b = input.nextInt();
	input.nextLine();
	
	System.out.println("El valor de a es: " + a );
	System.out.println("El valor de b es: " + b );
	System.out.println("a + b = " + (a+b));
	System.out.println("a - b = " + (a-b));
	System.out.println("a x b = " + (a*b));
	System.out.println("a / b = " + (a/b));
	System.out.println("a % b = " + (a%b));
	}
}
