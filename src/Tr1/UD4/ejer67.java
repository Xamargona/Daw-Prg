package Tr1.UD4;

import java.util.*;

public class ejer67 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		System.out.println("Introduce el número de filas:");	
		int filas = sc.nextInt();
		System.out.println("Introduce el número de columnas:");
		int columnas = sc.nextInt();
		
		int[][] matriz = new int [filas][columnas];
		
		System.out.println("La matriz se va a rellenar con valores aleatorios; introduce el número inferior del rango:");
		int inferior = sc.nextInt();
		System.out.println("Introduce el número superior del rango:");
		int superior = sc.nextInt();
		sc.nextLine();

		int valor_matriz;
		
		for (int i = 0; i < filas; i ++) {
			for (int j = 0; j < columnas; j++) {
				valor_matriz = (int)(r.nextDouble()*(superior-inferior+1)+inferior);
				matriz[i][j] = valor_matriz; 
				System.out.print("["+matriz[i][j]+"] ");
			}
			System.out.println();
		}
		
		String valor = "";
		int valor1 = 0;
		
		do {
			
			System.out.println("¿Qué número quieres buscar en la matriz?");
			
			if(sc.hasNextInt()) {
				valor1 = sc.nextInt();
				sc.nextLine();
			}else{
				valor = sc.nextLine();
				if(valor.equals("salir")){
					break;
				}else {
					System.out.println("Introduce un número válido");
					continue;
				}
			}
					
			if(valor1 > (superior-inferior+1) || valor1 < inferior) {
				System.out.println("El valor introducido, " + valor1+" está fuera del rango ["+inferior+","+(superior-inferior+1)+"]" );
				continue;
			}
			
			int contador = 0;
			for (int i = 0; i < filas; i ++) {
				for (int j = 0; j < columnas; j++) {
					if(matriz[i][j] == valor1) {
						contador = contador+1;
					}
				}
			}
			
			if(contador == 0) {
				System.out.println("El valor introducido, " + valor1+" está en el rango pero no en la matriz (Rango:["+inferior+","+(superior-inferior+1)+"])" );
				continue;
			}else if(contador == 1) {
				System.out.println("El valor " + valor1 + " está en la matriz y aparece " + contador + " vez");
				for (int i = 0; i < filas; i ++) {
					for (int j = 0; j < columnas; j++) {
						if(matriz[i][j] == valor1) {
							System.out.println("Lo encuentro en la posición ["+i+","+j+"]");
						}
					}
				}
				continue;
			}
			
			System.out.println("El valor " + valor1 + " está en la matriz y aparece " + contador + " veces");
			
			for (int i = 0; i < filas; i ++) {
				for (int j = 0; j < columnas; j++) {
					if(matriz[i][j] == valor1) {
						System.out.println("Lo encuentro en la posición ["+i+","+j+"]");
					}
				}
			}
		}
		while(!valor.equals("salir"));
	}
}
