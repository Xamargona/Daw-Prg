package Tr1.Actividades_Varias;

import java.util.*;

public class actividad_array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x;
		int[] lista = new int [10];
		System.out.print("Introduce el primer valor de la lista:");
		x = sc.nextInt();
		lista[0] = x;
		
		for(int i = 1; i < lista.length;i++) {
			
			System.out.print("Introduce un valor superior al anterior:");
			x = sc.nextInt();
			lista[i] = x;
			while(lista[i] <= lista [i-1]) {
				System.out.println("He dicho superior >:(");
				x = sc.nextInt();
				lista[i] = x;
			}
		}
	}
}
