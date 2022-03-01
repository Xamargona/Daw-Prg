package Tr2.UD5_Programacion_modular;

import java.util.*;

public class AceptaElReto171 {
	static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int cant = -1;
		while(cant != 0) {
			cant = sc.nextInt();
			if(cant == 0) {
				break;
			}
			
			int[] lista = new int [cant]; 
			
			for(int i = 0; i < cant; i++) {
				int alt = sc.nextInt();
				lista[i] = alt;
			}
			
			int contador = 0;
			int cantmax = 0;
			for (int i = cant-1; i >= 0; i--) {
				if(cantmax<lista[i]) {
					cantmax = lista[i];
					contador++;
				}
			}
			
			System.out.println(contador);
		}
		
	}
}
