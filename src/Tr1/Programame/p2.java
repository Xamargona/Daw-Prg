package Tr1.Programame;

import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			sc.nextLine();
			int aux = 0;
			if(n1 == 0 && n2 == 0) {
				break;
			}
			if(n1 %8 != 0 || n2%8 != 0) {
				break;
			}
			if(n1>48|| n2>48) {
				break;
			}
			if(n1<0|| n2<0) {
				break;
			}
			
			char[][] matriz = new char [n1][n2];
			
			for (int i = 0; i < n1; i++) {
				for (int j = 0; j < n2; j++) {
					matriz[i][j] = sc.next().charAt(0);
				}
			}
			char aux1 = 0;
			char aux2 = 0;
			for (int i = 0; i < n1; i++) {
				if(n1%8 == 0) {
					 aux1 = 0;
					 aux2 = 0;
				}
				for (int j = 0; j < n2; j++) {
					if(n2%8 == 0) {
						  aux1 = matriz[i][j];
						  aux2 = 0;
					}
					if(matriz[i][j] != aux1 && aux2 == 0) {
						aux2 = matriz[i][j];
					}
					if(matriz[i][j] != aux1 &&matriz[i][j] != aux2) {
						aux = 1;
					}
					
				}
			}
		
			if(aux == 0) {
				System.out.println("SI");
			}else {
				System.out.println("NO");
			}
			
		}
	}
}
