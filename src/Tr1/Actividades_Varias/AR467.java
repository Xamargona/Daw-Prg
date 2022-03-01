package Tr1.Actividades_Varias;

import java.util.*;

public class AR467 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int intentos = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < intentos; i++) {
			String entrada = sc.nextLine();
			String[] partes = entrada.split(" es ");
			String parte1 = partes[0];
			String parte2 = partes[1];
			if(parte1.toLowerCase().equals(parte2.toLowerCase())) {
				System.out.println("TAUTOLOGIA");
			}else {
				System.out.println("NO TAUTOLOGIA");
			}
		}
	}
}
