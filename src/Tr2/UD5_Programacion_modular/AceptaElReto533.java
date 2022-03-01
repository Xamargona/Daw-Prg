package Tr2.UD5_Programacion_modular;

import java.util.Scanner;

public class AceptaElReto533 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for(int i = 0; i < n; i ++) {
			int n1 = sc.nextInt();
			int n2 = -1;
			int contador = 0;
			while(n2 != 0) {
				n2 = sc.nextInt();
				contador = n2 + contador;
			}
			if(contador >= n1 ) {
				System.out.println((i+1));
			}else {
				System.out.println("SIGAMOS RECICLANDO");
			}
		}
	}
}
