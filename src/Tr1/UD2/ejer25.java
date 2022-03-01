package Tr1.UD2;

import java.util.Scanner;


public class ejer25 {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.println("Introduce el valor del primer cateto:");
	
	double cateto1 = input.nextDouble();
	input.nextLine();
	
	System.out.println("Introduce el valor del segundo cateto:");
	
	double cateto2 = input.nextDouble();
	input.nextLine();
	
	double hipotenusa = Math.sqrt((cateto1*cateto1) + (cateto2*cateto2));
	
	System.out.println("El valor de la hipotenusa es: " + String.format("%.2f",hipotenusa));

	}

}
