package Tr1.UD2;

import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Introduce el valor del que obtener su tabla de multiplicar");
		int x = input.nextInt();
		input.nextLine();
		
		System.out.println(x + " x 1 = " + (x*1));
		System.out.println(x + " x 1 = " + (x*2));
		System.out.println(x + " x 1 = " + (x*3));
		System.out.println(x + " x 1 = " + (x*4));
		System.out.println(x + " x 1 = " + (x*5));
		System.out.println(x + " x 1 = " + (x*6));
		System.out.println(x + " x 1 = " + (x*7));
		System.out.println(x + " x 1 = " + (x*8));
		System.out.println(x + " x 1 = " + (x*9));
		System.out.println(x + " x 1 = " + (x*10));		
	}
}
