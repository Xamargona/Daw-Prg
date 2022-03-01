package Tr2.UD5_Programacion_modular;

import java.util.*;
public class ejer75 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(convierteEnPalabras(num));
	}
	
	public static String convierteEnPalabras(int n) {
		String aux1 = Integer.toString(n);
		char[] aux2 = aux1.toCharArray();
		String a = "";
		for(int i = 0; i < aux2.length; i++) {
			switch (aux2[i]) {
			case '1': a = a + "uno"; break;
			case '2': a = a + "dos"; break;
			case '3': a = a + "tres"; break;
			case '4': a = a + "cuatro"; break;
			case '5': a = a + "cinco"; break;
			case '6': a = a + "seis"; break;
			case '7': a = a + "siete"; break;
			case '8': a = a + "ocho"; break;
			case '9': a = a + "nueve"; break;
			}
			if(i < aux2.length-1) {
				a = a+", ";
			}
		}
		return a;
	}
}
