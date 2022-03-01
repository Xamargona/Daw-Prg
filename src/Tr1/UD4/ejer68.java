package Tr1.UD4;

import java.util.Random;
import java.util.Scanner;

public class ejer68 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int x = (int)(r.nextDouble()*100+1);
		int y;
		int contador = 1;
		System.out.println("El juego del número mágico");
		System.out.println("Introduzca número:");
		y = sc.nextInt();
		while(y!=x){
			if(y < x) {
				System.out.println("El número mágico es mayor!");
				System.out.println("Introduzca número:");
				y = sc.nextInt();
			}else if(y > x) {
				System.out.println("El número mágico es menor!");
				System.out.println("Introduzca número:");
				y = sc.nextInt();
			}
			contador = contador +1;
		}
		if(contador == 1) {
		System.out.print("Enhorabuena! Has acertado el número que era el " + x + "ln" + " Lo has solucionado en " + contador + " intento!");
		}
		System.out.print("Enhorabuena! Has acertado el número que era el " + x + "ln" + " Lo has solucionado en " + contador + " intentos!");
	}
}
