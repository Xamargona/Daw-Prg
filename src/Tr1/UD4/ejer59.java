package Tr1.UD4;

import java.util.*;

public class ejer59 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("Introduce el tamaño del vector:");
		
		int tam = sc.nextInt();
		int[] vector = new int [tam];
		int valor;
		int valor2;
		Boolean a = true;

		do {
			System.out.println("---------------Pulse una opción del menú:---------------");
			System.out.println("1-Rellenar vector por teclado");
			System.out.println("2-Rellenar vector de forma aleatoria (nums de 1 a 100)");
			System.out.println("3-Modificar una posición del vector");
			System.out.println("4-Consultar una posición del vector");
			System.out.println("5-Mostrar todo el vector");
			System.out.println("6-Ordenar ascendentemente el vector");
			System.out.println("9-Salir");
			System.out.println("--------------------------------------------------------");
			
			int opcion = sc.nextInt();
			switch(opcion) {
			
			case 1: 
					for(int i = 0; i < tam; i++) {
						System.out.println("Introduzva valor " + (i+1) + " de " + tam + ":");
						valor = sc.nextInt();
						vector[i] = valor;
					}
					break;
			
			case 2:
					for(int i = 0; i < tam; i++) {
						valor = (int)(r.nextDouble()*100+1);
						vector[i] = valor;
					}
					break;
			
			case 3: 
					System.out.println("Introduzca una posición del vector (0 - " + (tam-1) + "):");
					valor = sc.nextInt();
					while(valor >= tam) {
						System.out.println("Esta posición no existe en el vector, introduce una posición válida:");
						valor = sc.nextInt();
					}
					System.out.println("¿Qué valor quiere introducir en la posición "+ valor +"?");
					valor2 = valor;
					valor = sc.nextInt();
					vector[valor2] = valor;
					break;
			
			case 4:
					System.out.println("Introduzca una posición del vector (0 - " + (tam-1) + "):");
					valor = sc.nextInt();
					System.out.println("El valor contenido en " + valor + " es: " + vector[valor]);
					break;
			
			case 5: 
					System.out.print("[");
					for(int i = 0; i < tam; i++) {
						if(i<tam-1) {
							System.out.print(vector[i]+",");
						}else {
							System.out.println(vector[i] + "]");
						}
					}
					break;
			
			case 6:	
					Arrays.sort(vector);
					break;
			
			case 9: 
					a = false;
					break;
			}
		}while(a == true);
	}
}
