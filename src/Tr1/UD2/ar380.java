package Tr1.UD2;

import java.util.Scanner;

public class ar380 {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

		int cantidad = input.nextInt();
		int gastos;
		int variable = 0;
		while(cantidad !=0) {
			
			gastos = 0;
			variable = 0;
			
			for(int i = 0; i < cantidad; i++ ) {
				
				gastos = input.nextInt();

				variable = variable + gastos;
			}
			
			System.out.println(variable);
			cantidad = input.nextInt();
		}
	}
}
