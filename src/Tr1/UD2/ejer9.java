package Tr1.UD2;

import java.util.Scanner;

public class ejer9 {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.println("Introduce tu edad");
	
	int edad = input.nextInt();
	input.nextLine();
	
	System.out.println("Número secreto es " + Math.sqrt(((1492/edad) - 20)));

	}

}
