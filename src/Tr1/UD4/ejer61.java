package Tr1.UD4;

import java.util.*;

public class ejer61 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el número de filas y columnas:");
		int filas = sc.nextInt();
		
		int columnas = filas;
		
		int[][] matriz = new int [filas][columnas];
		int comprobante1 = 0;
		int comprobante2 = 0;
		int comprobante3 = 0;
		int comprobante4 = 0;
		int comprobante5 = 0;
		int valor;
		Boolean chequeo = true;
		
		for (int i = 0; i < filas; i ++) {
			for (int j = 0; j < columnas; j++) {
				System.out.println("Introduce un valor para la posición de la matriz ["+i+"]"+"["+j+"]");
				valor = sc.nextInt();	
				matriz[i][j] = valor; 
			}
		}	

		for (int j = 0; j < columnas; j++) {
			comprobante1 = comprobante1 + matriz[0][j];
		}
// filas y diagonales
		for (int i = 0; i < filas; i ++) {
			for (int j = 0; j < columnas; j++) {
				comprobante2 = comprobante2 + matriz[i][j];
				if(j==(columnas-1)){
					if(comprobante2 != comprobante1) {
						chequeo = false;
					}
					comprobante2 = 0;
				}
				if(j==i) {
					comprobante4 = comprobante4 + matriz[i][j];
				}
				if(i+j == filas-1) {
					comprobante5 = comprobante5 + matriz[i][j];
				}
			}
		}
		if(comprobante4 != comprobante1) {
			chequeo = false;
		}
		if(comprobante5 != comprobante1) {
			chequeo = false;
		}
// columnas
		for (int i = 0; i < columnas; i ++) {
			for (int j = 0; j < filas; j++) {
				comprobante3 = comprobante3 + matriz[i][j];
				if(j==(filas-1)){
					if(comprobante3 != comprobante1) {
						chequeo = false;
					}
					comprobante3 = 0;
				}
			}
		}

		
		
		for (int i = 0; i < filas; i ++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print("["+matriz[i][j]+"] ");
			}
			System.out.println();
		}
		
		if(chequeo==true) {
			System.out.println("Es un cuadrado mágico");
		}else if(chequeo==false) {
			System.out.println("No es un cuadrado mágico");
		}
	}
}
