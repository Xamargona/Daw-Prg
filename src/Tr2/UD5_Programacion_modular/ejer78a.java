package Tr2.UD5_Programacion_modular;

import java.util.*;
public class ejer78a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("JUGADOR1: Introduzca la palabra para adivinar:");
		String palabra = sc.nextLine();
		ahorcado(palabra);
	}

	public static void ahorcado(String palabra) {
		Scanner sc = new Scanner(System.in);
		char[] secreta = palabra.toCharArray();
		char[] aux = new char[secreta.length];
		for (int i = 0; i < aux.length; i++) {
			aux[i] = '*';
		}
		int errores = 0;
		System.out.println("JUGADOR2: La palabra para advinar es la siguiente:");
		System.out.println(aux);
		while (true) {
			System.out.println("Introduzca letra:");
			char letra = sc.next().charAt(0);
			if(new String(secreta).indexOf(letra) == -1) {
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
					if(secreta[i] == letra) {
						aux[i] = letra;
						contador++;
					}
				}
				if (contador == 1) {
					System.out.println("La letra "+letra+" esta en la palabra "+contador+" vez.");;
				}else {
					System.out.println("La letra "+letra+" esta en la palabra "+contador+" veces.");;
				}
				System.out.println(aux);
				contador = 0;
				for(int i = 0; i < aux.length; i++) {
					if(aux[i] != '*') {
						contador++;
					}
				}
				if(contador == aux.length) {
					System.out.println("Palabra adivinada! Gracias por jugar al ahorcado!");
					return;
				}
			}
		}
	}
}
