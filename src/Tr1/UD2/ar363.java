package Tr1.UD2;

import java.util.Scanner;

public class ar363 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int disminucion = input.nextInt();
		
		int aumento;
		
		int comilonas;
		
		int variable;
		
		int contador;
		
		while(disminucion != 0) {
			
			aumento = 0;
			variable = 0;
			contador = 1;
			
			comilonas = input.nextInt();
			
			for(int i = 0; i < comilonas; i++) {
				
				aumento = input.nextInt();
				variable = variable + aumento;
				
			}
			
			while(disminucion < variable){
				variable = variable - disminucion;
				contador ++;
			}
			
			System.out.println(contador);
			disminucion = input.nextInt();
		}
	}
}
