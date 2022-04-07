package AceptaElReto;

import java.util.Scanner;

public class AR369 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int entrada = -1;
		
		while(entrada != 0) {
			entrada = sc.nextInt();
			if(entrada < 0 || entrada > 1000 || entrada == 0) {
				continue;
			}
			for(int i = 0; i < entrada;i++) {
				System.out.print("1");
			}
			System.out.println();
		} 
	}
}
