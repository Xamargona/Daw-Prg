package Tr1.Examen_alternativo_U1;

import java.util.Scanner;

public class recup02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int filas = 0;
		int columnas = 0;
		boolean aux = true;

		while(aux) {
			aux = false;
			System.out.println("Introduzca filas:");
			filas = sc.nextInt();
			System.out.println("Introduzca columnas:");
			columnas = sc.nextInt();
			if(filas%2 !=0 || columnas%2 !=0) {
				System.out.println("ERROR, la matriz ha de ser de lado par");
				aux = true;
			}
			if(filas != columnas) {
				System.out.println("ERROR, la matriz ha de ser cuadrada");
				aux = true;
			}
		} 
		int[][] matriz = new int [filas][columnas];

		for(int i = 0; i < filas; i++) {
			for(int j = 0; j < columnas; j++){
				if(i < filas/2 && j < columnas/2) {
					matriz[i][j] = 1;
				}
				if(i < filas/2 && j >= columnas/2) {
					matriz[i][j] = 2;
				}
				if(i >= filas/2 && j < columnas/2) {
					matriz[i][j] = 3;
				}
				if(i >= filas/2 && j >= columnas/2) {
					matriz[i][j] = 4;
				}
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
