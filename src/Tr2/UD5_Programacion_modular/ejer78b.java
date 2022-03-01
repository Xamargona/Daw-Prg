package Tr2.UD5_Programacion_modular;

import java.util.Arrays;
import java.util.Scanner;

public class ejer78b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("JUGADOR1: Introduzca la palabra para adivinar:");
		String palabra = sc.nextLine();
		ahorcado(palabra);
	}

	public static void ahorcado(String palabra) {
		Scanner sc = new Scanner(System.in);
		String[] secreta = new String[palabra.length()];
		String palabraFinal = "";
		for (int i = 0; i < secreta.length; i++) {
			secreta[i] = String.valueOf(palabra.charAt(i));
		}
		String[] asteriscos = new String[secreta.length];
		for (int i = 0; i < asteriscos.length; i++) {
			asteriscos[i] = "*";
			palabraFinal = palabraFinal+asteriscos[i];
		}
		int errores = 0;
		System.out.println("JUGADOR2: La palabra para advinar es la siguiente:");
		System.out.println(palabraFinal);
		while (asteriscos != secreta) {
			System.out.println("Introduzca letra:");
			String letra = sc.nextLine();
			if(!palabra.contains(letra)) {
				errores++;
				System.out.println("La letra "+letra+" no se encuentra en la palabra.");
				System.out.print("Error "+errores+" de 8: ");
				switch (errores) {
				case 1:System.out.print("Te pinto la horca\n");break;
				case 2:System.out.print("Te pinto la cabeza\n");break;
				case 3:System.out.print("Te pinto el cuerpo\n");break;
				case 4:System.out.print("Te pinto el brazo izquierdo\n");break;
				case 5:System.out.print("Te pinto el brazo derecho\n");break;
				case 6:System.out.print("Te pinto la pierna izquierda\n");break;
				case 7:System.out.print("Te pinto la pierna izquierda\n");break;
				case 8:System.out.print("AHORCADO!\n");return;
				}
			}else{
				int contador = 0;
				for(int i = 0; i < secreta.length; i++) {
					if(secreta[i].equals(letra)) {
						asteriscos[i] = letra;
						contador++;
					}
				}
				if (contador == 1) {
					System.out.println("La letra "+letra+" esta en la palabra "+contador+" vez.");;
				}else {
					System.out.println("La letra "+letra+" esta en la palabra "+contador+" veces.");;
				}
				palabraFinal = "";
				for (int i = 0; i < asteriscos.length; i++) {
					palabraFinal = palabraFinal+asteriscos[i];
				}
				System.out.println(palabraFinal);
				if(Arrays.equals(secreta, asteriscos)) {
					System.out.println("Palabra adivinada! Gracias por jugar al ahorcado!");
					return;
				}
			}
		}
	}
}
