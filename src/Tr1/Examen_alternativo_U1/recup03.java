package Tr1.Examen_alternativo_U1;

import java.util.Random;
import java.util.Scanner;

public class recup03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int[][] matriz = new int [3][3];
		boolean aux = true;
		int aux1 = 1;
		String x;
		while(aux){
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					aux1=1;
					matriz[i][j] = (int)(r.nextDouble()*100+1);
					while(aux1==1) {
						aux1=0;
						for(int k = 2; k < matriz[i][j]/2; k++) {
							if(matriz[i][j] % k == 0) {
								aux1=1;
							}
						}
						matriz[i][j] = (int)(r.nextDouble()*100+1);
					}
					System.out.print(matriz[i][j] + " ");
				}
			System.out.println();
			}
			
			System.out.println("¿otra? (S/N)");
			x = sc.nextLine();
			if(x.equals("N")) {
				aux = false;
			}
		}
		
	}
}
