package Tr1.UD2;

import java.util.Scanner;

public class ar_calle {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int n = 1;
		
		while(n!=0 && n>0 &&n<1000) { 
			
			n = input.nextInt();
			input.nextLine();
			
			if(n%2 == 0 && n!=0) {
				
			System.out.println("DERECHA");
			
			}if(n%2 != 0 ){
				
			System.out.println("IZQUIERDA");
			
			}
		}
	}
}
