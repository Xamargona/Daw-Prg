package Tr1.UD4;

import java.util.*;

public class ejer57 {

	public static void main(String[] args) {

		Random r = new Random();

		System.out.println("Vamos a tirar los dados...");
		
		int x = 0;
		int y = 1;
		
		int i = 1;
		
		while (x!=y) {
			x = (int)(r.nextDouble()*6+1);
			y = (int)(r.nextDouble()*6+1);
			System.out.println("En la tirada " + i + " ha salido " + x + " y el " + y);
			i++;
		}
		
		System.out.println("Han salido iguales!!");
	
	}

}
