package Tr1.UD4;

import java.util.*;

public class ejer58 {
	
	public static void main(String[] args) {

		Random r = new Random();
		
		int x;
		int y = (int)(r.nextDouble()*7+1);
		int z = 4*y;
	
		String[] notas = {"Do","Re","Mi","Fa","Sol","La","Si"};
		String[] duplicado = new String [1];

		for (int i = 1; i < z; i++) {
			
			x = (int)(r.nextDouble()*7);
			System.out.print(" " + notas[x] + " ");
			
			if(i==1) {
				duplicado[0] = notas[x];
			}
			
			if (i%4 == 0) {
				System.out.print("|");
			}
			if (z == i+1) {
				System.out.print(" " + duplicado[0] + " ");
			}
			
		}		
		System.out.print("||");
	}
}