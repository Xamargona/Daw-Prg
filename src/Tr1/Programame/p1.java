package Tr1.Programame;

import java.util.*;

public class p1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		int entrada = -1;
		
		while(entrada != 0) {
			
			entrada = sc.nextInt();
			if(entrada == 0) {
				break;
			}
			
			int salida = 0;
			int marcador1 = 0;
			int marcador2 = 0;
			int aux = 3;
			for(int i = 0; i < entrada-1;i++) {
				int res = (int)(r.nextDouble()*3);
				
				if (aux == 1) {
					res = (int)(r.nextDouble()*2);
					aux = 0;
				}
				if(aux == 3) {
					res = 1;
				}
				if(res == 0) {
					System.out.print("PONG! ");
					salida ++;
				}else if(res == 1) {
					System.out.print("PIC ");
					salida ++;
				}else if(res == 2) {
					System.out.print("POC ");
					aux = 1;
				}
				if(res == 0) {
					if(salida%2 == 0) {
						marcador1 = marcador1 + 1;
					}else {
						marcador2 = marcador2 + 1;
					}
					aux = 1;
				}
				if(aux == 3) {
					aux = 0;
				}
			}
			System.out.println("PONG!");
			int res = 2;
			if(res == 2) {
				if(salida%2 == 0) {
					marcador1 = marcador1 + 1;
				}else {
					marcador2 = marcador2 + 1;
				}
			}
			System.out.println(marcador1 + " " + marcador2);
		}
	}
}
