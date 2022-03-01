package Tr1.UD4;

import java.util.*;

public class ejer53 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el tamaño de la lista: ");
		
		int x = sc.nextInt();
		int lista[] = new int [x];
		System.out.println("Introduzca límites inferior y superior para generar números aleatorios: ");
		int primero = sc.nextInt();
		int ultimo = sc.nextInt();
		
		Random r = new Random();
		int y;
		int suma = 0;
		System.out.println("Se ha generado el siguiente array de " + x + " posiciones:");
		for(int i = 0; i<x; i++) {
			y = (int)(r.nextDouble()*(ultimo-primero+1)+primero);	
			lista[i] = y;
			suma = suma + y;
			System.out.print("["+lista[i]+"] ");
		}
		System.out.println();
		System.out.print("La suma de los elementos es: " + suma);
	}
}
