package Tr1.Actividades_Varias;

import java.util.Scanner;

public class AR140 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n1 = 0;
		
		while(n1 > -1) {
			n1 = sc.nextInt();
			if(n1 < 0) {
				break;
			}
			String n2 = String.valueOf(n1);
	        char[] digits = n2.toCharArray();
			int total = 0;
	        for(int i = 0; i < digits.length; i++) {
        		total = total + Integer.parseInt(String.valueOf(digits[i]));
	        	if(i < digits.length-1) {
	        		System.out.print(digits[i]+" + ");
	        	}else{
	        		System.out.print(digits[i]+" = "+total+"\n");
	        	}
	        }
		}
	}
}
