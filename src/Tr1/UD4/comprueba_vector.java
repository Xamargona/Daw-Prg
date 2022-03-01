package Tr1.UD4;

import java.util.*;

public class comprueba_vector {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el tamaño del vector y a continuación sus valores sin repetir");
		
		int tam = sc.nextInt();
		int valor;
		int[] vector = new int[tam];
		
		for (int i = 0; i <tam;i++) {
			valor = sc.nextInt();
			vector[i] = valor;
			for(int j = 0; j<i;) {
				if(vector[j] == vector[i]) {
					System.out.println("Que no me des valores repetidos so burro");
					valor = sc.nextInt();
					vector[i] = valor;	
					j = 0;
					}else{
						j++;
					}
			continue;
			}
		}
	}
}

