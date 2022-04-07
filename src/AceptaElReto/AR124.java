package AceptaElReto;

import java.util.Scanner;

public class AR124 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n1 = -1;
		int n2 = -1;
		while(n1 != 0 && n2 != 0) {
			int contador = 0;
			int min = 0;
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			if(n1 == 0 && n2 == 0) {
				break;
			}
			String aux1 = String.valueOf(n1);
			String aux2 = String.valueOf(n2);
	        char[] dig1= aux1.toCharArray();
	        char[] dig2= aux2.toCharArray();
	        if(dig2.length < dig1.length) {
	        	min = dig2.length;
	        }else {
	        	min = dig1.length;
	        }
	        for(int j = 0; j < min; j++) {
				int aux = 0;
				aux = Integer.parseInt(String.valueOf(dig1[dig1.length-j-1])) + Integer.parseInt(String.valueOf(dig2[dig2.length-j-1]));;
				if (aux > 9) {
					contador = contador +1;
				}
	        }
	        System.out.println(contador);
		}
		
	}
}
