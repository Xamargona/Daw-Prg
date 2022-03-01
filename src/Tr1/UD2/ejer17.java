package Tr1.UD2;

import java.util.Scanner;

public class ejer17 {
	
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.println("Introduce el valor de x:");
	
	int x = input.nextInt();
	input.nextLine();

	System.out.println("Introduce el valor de y:");
	int y = input.nextInt();
	input.nextLine();
	
	int suma = x + y;
	int resta = x - y;
	int producto = x*y;
	double cociente = (double)x/y;
	
	System.out.println("Los valores introducidos son " + x + " y " + y );
	System.out.println("\t\t" + "SUMA" + "\t" + "ESTA" + "\t" + "PRODUCTO" + "\t\t" + "COEFICIENTE");
	System.out.println("-------------------------------------------------------------------");
	System.out.print("x=" + x + "y=" + y);
	System.out.println("\t\t" + suma + "\t" + resta+ "\t" + producto + "\t\t" + cociente);
	System.out.println("-------------------------------------------------------------------");

	}
}