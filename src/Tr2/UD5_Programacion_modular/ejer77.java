package Tr2.UD5_Programacion_modular;

import java.util.*;

public class ejer77 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(convierteEnPalotes(n));
	}
	public static String convierteEnPalotes(int n) {
		String aux1 = Integer.toString(n);
		char[] aux2 = aux1.toCharArray();
		String palotes = "";
		for(int i = 0; i < aux2.length; i++) {
			switch (aux2[i]) {
			case '0': palotes = palotes + ""; break;
			case '1': palotes = palotes + "|"; break;
			case '2': palotes = palotes + "||"; break;
			case '3': palotes = palotes + "|||"; break;
			case '4': palotes = palotes + "||||"; break;
			case '5': palotes = palotes + "|||||"; break;
			case '6': palotes = palotes + "||||||"; break;
			case '7': palotes = palotes + "|||||||"; break;
			case '8': palotes = palotes + "||||||||"; break;
			case '9': palotes = palotes + "|||||||||"; break;
			}
			if(i < aux2.length-1) {
				palotes = palotes+"-";
			}
		}
		return palotes;
	}
}

