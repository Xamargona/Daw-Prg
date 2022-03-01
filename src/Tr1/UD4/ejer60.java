package Tr1.UD4;

import java.util.*;
public class ejer60 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("Introduce un tamaño para el vector");
		int tam = sc.nextInt();
		int valor;
		int[] vector = new int[tam];
		
		for(int i = 0; i < tam; i++) {
			valor = (int)(r.nextDouble()*100+1);
			vector[i] = valor;
		}
		
		System.out.print("[");
		for(int i = 0; i < tam; i++) {
			if(i<tam-1) {
				System.out.print(vector[i]+",");
			}else {
				System.out.println(vector[i] + "]");
			}
		}
		
		int [] vector1 = Arrays.copyOfRange(vector, 0,tam);
		Arrays.sort(vector);
		if(Arrays.equals(vector, vector1)==true) {
			System.out.println("El vector esta ordenado");
		}else if(Arrays.equals(vector, vector1)==false) {
			System.out.println("El vector no esta ordenado");
		}
	}
}
