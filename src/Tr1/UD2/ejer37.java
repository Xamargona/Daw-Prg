package Tr1.UD2;

import java.util.Scanner;

public class ejer37 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce los valores de la primera coordenada:");
		
		System.out.println("x:");
		
		double x = input.nextDouble();
		
		System.out.println("y:");
		
		double y = input.nextDouble();
		
		if(x == 0 && y != 0){
			System.out.println("El punto seleccionado se encuentra en el eje de ordenadas: ("+ x +"," + y +")");
		}if(x != 0 && y == 0){
			System.out.println("El punto seleccionado se encuentra en el eje de abscisas: ("+ x +"," + y +")");
		}if(x == 0 && y == 0){
			System.out.println("El punto seleccionado se encuentra en el origen de coordenadas: ("+ x +"," + y +")");
		}if(x > 0 && y > 0){
			System.out.println("El punto seleccionado se encuentra en el primer cuadrante: ("+ x +"," + y +")");
		}if(x < 0 && y > 0){
			System.out.println("El punto seleccionado se encuentra en el segundo cuadrante: ("+ x +"," + y +")");
		}if(x < 0 && y < 0){
			System.out.println("El punto seleccionado se encuentra en el tercer cuadrante: ("+ x +"," + y +")");
		}if(x > 0 && y < 0){
			System.out.println("El punto seleccionado se encuentra en el cuarto cuadrante: ("+ x +"," + y +")");
		}

	}

}
