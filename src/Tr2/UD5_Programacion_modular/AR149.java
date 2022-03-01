package Tr2.UD5_Programacion_modular;

import java.util.*;

public class AR149 {
	static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		while (sc.hasNext()) {
			int x = sc.nextInt();
			int[] lista = new int [x];
			int mayor = 0;
			for (int i = 0; i < lista.length; i++) {
				lista[i] = sc.nextInt();
				if(i == 0) {
					mayor = lista[i];
				}
				if(mayor < lista[i]) {
					mayor= lista[i];
				}	
			}
			System.out.println(mayor);
			
		}
	}

}
