package Tr1.UD4;

import java.util.*;

public class ejer56 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el número de filas:");
		int filas = sc.nextInt();
		
		System.out.println("Introduce el número de columnas:");
		int columnas = sc.nextInt();
		
		int[][] matriz = new int [filas][columnas];
		
		int valor;
		int total = 0;
		
		for (int i = 0; i < filas; i ++) {
			for (int j = 0; j < columnas; j++) {
				System.out.println("Introduce un valor para la posición de la matriz ["+i+"]"+"["+j+"]");
				valor = sc.nextInt();
				matriz[i][j] = valor; 
				total = total + valor;
			}
		}
		
		for (int i = 0; i < filas; i ++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print("["+matriz[i][j]+"] ");
			}
			System.out.println();
		}
		System.out.println("El total de la matriz es: " + total);
	}

}
