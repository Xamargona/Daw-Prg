package Tr1.UD4;

import java.util.*;

public class ejer54 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int dni = sc.nextInt();
		
		String lista[] = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};

		int resto = dni%23;
		
		System.out.println(dni + lista[resto]);
	}
}
