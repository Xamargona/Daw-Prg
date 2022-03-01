package Tr1.UD2;

import java.util.Scanner;

public class ar411 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int peso_total = input.nextInt();
		
		int peso_elefante = 1;
		
		int contador = 0;
		
		while (peso_total != 0) {
			
			contador = 0;
			peso_elefante = 1;
			while(peso_elefante != 0) {
				peso_elefante = input.nextInt();
				if(peso_elefante != 0) {
					peso_total = peso_total - peso_elefante;
					if (peso_total >=0) {
						contador ++;
					}
				}
			}
			
			System.out.println(contador);
			peso_total = input.nextInt();
			
		}
	}
}
