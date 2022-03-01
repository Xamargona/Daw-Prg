package Tr1.UD2;

import java.util.Scanner;

public class ar313 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int intentos = input.nextInt();
		
		for(int i = 0; i < intentos; i++) {
			
			int x = input.nextInt();
			
			int y = input.nextInt();
			
			if(x+y >= 0) {
				System.out.println("SI");
			}else {
				System.out.println("NO");

			}
			
		}
	}
}
