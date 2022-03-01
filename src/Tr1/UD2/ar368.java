package Tr1.UD2;

import java.util.Scanner;

public class ar368 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		

		int huevos = input.nextInt();
		int capacidad = input.nextInt();
		int coccion;
		
		while(huevos!=0 && capacidad!=0) {
			
			coccion = 10;
			
			while(huevos > capacidad) {
				huevos = huevos - capacidad;
				coccion = coccion + 10;
			}
			
			System.out.println(coccion);
			huevos = input.nextInt();
			capacidad = input.nextInt();
		}	
	}
}
