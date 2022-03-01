package Tr1.Actividades_Evaluables.AE1_JavierMG;

import java.util.Scanner;

public class eval11 {

	public static void main(String[] args) {
		
		// ¡¡La pedida por consola de mi scanner la establezco como input no sc por comodidad!!
		
		Scanner input = new Scanner(System.in);
		
		// Diálogo introducción

		System.out.println("Bienvenido al ejercicio de la caja fuerte");
		System.out.println("------------------------------------------");

		// Bucle general de oportunidades para aceptar
		
		for(int i = 1; i <= 15; i++) {
			
			// Mostramos el intento
			
			System.out.println("Intento numero "+ i + " de 15:");
			
			// Pedimos digitos al usuario
			
			System.out.println("Introduzca digito numero 1:");
			
			int d1 = input.nextInt();
			input.nextLine();
			
			System.out.println("Introduzca digito numero 2:");
			
			int d2 = input.nextInt();
			input.nextLine();
			
			System.out.println("Introduzca digito numero 3:");
			
			int d3 = input.nextInt();
			input.nextLine();
			
			System.out.println("Introduzca digito numero 4:");
			
			int d4 = input.nextInt();
			input.nextLine();
			
			// Comparamos los digitos con la contrasela 1234 establecida
			// Si es 1234 acaba el bucle si no sigue
			// La contraseña se compara justo aquí abajo digito a digito
			
			if(d1 == 1 && d2 == 2 && d3 == 3 && d4 == 4 ) {
				
				System.out.println("Correcto!, la clave era 1234!");
				break;
				
			}else{
				
				System.out.println("Lo siento, la clave "+d1+d2+d3+d4+" no es correcta!");
				System.out.println("------------------------------------------");
			}
		}
	}
}
