package AceptaElReto;

import java.util.Scanner;

public class AR456 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int intentos = sc.nextInt();
		int altura;
		int anchura;
		int tamany;
		int total;
		int tabletas;
		int base = 0;
		
		for(int i = 0; i < intentos; i++) {
			tabletas = 1;
			altura = sc.nextInt();
			anchura = sc.nextInt();
			tamany = altura*anchura;
			base = tamany;
			total = sc.nextInt();
			while (tamany < total) {
				tamany = tamany + base;
				tabletas = tabletas + 1;
			}
		System.out.println(tabletas);
		}
	}
}
