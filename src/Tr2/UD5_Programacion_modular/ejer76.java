package Tr2.UD5_Programacion_modular;

import java.util.*;

public class ejer76 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion = -1;
		int n;
		while(opcion !=3) {
			System.out.println("Introduzca un número:");
			n = sc.nextInt();
			System.out.println("Introduzca una opción:");
			System.out.println("1-Realizar el sumatorio de "+n);
			System.out.println("2-Realizar el factorial de "+n);
			System.out.println("3-Salir de este programa");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("El sumatorio de "+n+" es: "+sumatorio(n));
				break;
			case 2:
				System.out.println("El factorial de "+n+" es: "+factorial(n));
				break;
			case 3: 
				System.out.print("Gracias por utilizar este menú");
				break;
			default:
				break;
			}
		}
	}

	public static int sumatorio(int n) {
		int num = 0;
		for (int i = 0; i <= n; i++) {
			num = num + i; 
		}
		return num;
	}
	public static int factorial(int n) {
		int num = n;
		for (int i = n-1; i > 0; i--) {
			num = num * i; 
		}
		return num;
	}
	
	
}
