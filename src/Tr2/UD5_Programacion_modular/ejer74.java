package Tr2.UD5_Programacion_modular;

import java.util.*;

public class ejer74 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String texto = sc.nextLine();
		imprimeCajaTexto(texto);
	}
	
	public static void imprimeCajaTexto(String texto){
		String espaciado = "";
		for (int i = 0; i < texto.length()+2;i++) {
			espaciado = espaciado + " ";
		}
		for(int i = 1; i <= 5; i++) {
			if(i == 1 || i == 5) {
				for(int j = 0; j < texto.length()+4; j++) {
					System.out.print("*");
				}
			}else if(i % 2 == 0 ){
				System.out.print("*" + espaciado + "*");
			}else if(i == 3) {
				System.out.print("* " + texto + " *");
			}
			System.out.println();
		}
		
	}
}
