package Tr2.UD5_Programacion_modular;

import java.util.Scanner;

public class ejer77Recursive {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(convierteEnPalotes(n));
	}
	
	public static String convierteEnPalotes(int n1) {
		String palito = "";
		int n2 = n1;
		int contador = 0;
		if(n1 > 9) {
			while(n2 > 9) {
				n2 = n2/10;
				contador++;
			}		
			for(int i = 0; i < n2; i++) {
				palito = palito + "|";
			}
			if(contador != 0) {
				palito = palito+"-";
			}
			for(int i = 0; i < contador; i++) {
				n2= n2*10;
			}
			String n3 = Integer.toString(n1);
			int n4 = 1;
			while(n3.charAt(n4) == '0'){
				palito = palito+"-";
				n4++;
			}
			return palito + convierteEnPalotes(n1-n2);
		}else {
			for(int i = 0; i < n1; i++) {
				palito = palito + "|";
			}
			return palito;
		}
	}
}
