package Tr1.UD2;

import java.util.Scanner;

public class ejer11 {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.println("Introduce tu peso en gramos");
	
	double peso = input.nextDouble();
	input.nextLine();
	peso = peso/1000;
	
	System.out.println("Introduce tu altura en cm");
	
	double altura = input.nextDouble();
	input.nextLine();
	
	altura = altura/100;
	double imc = peso/(altura*altura);
	
	System.out.println("El IMC calculado es " + imc);

	}

}
