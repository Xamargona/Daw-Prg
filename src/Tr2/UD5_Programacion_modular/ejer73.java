package Tr2.UD5_Programacion_modular;

import java.util.*;

public class ejer73 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase = sc.nextLine();
		System.out.println(murcia(frase));

	}
	
	public static String murcia(String a) {
		if (a.indexOf("el area 51") == -1) {
			System.out.println("el area 51 no aparece en la transmisión");
		}else{
			while (a.indexOf("el area 51") != -1) {
			int pos = a.indexOf("el area 51");
			String parte1 = a.substring(0, pos);
			String parte2 = a.substring(pos+10);
			a = parte1 + "Murcia" + parte2;
			}
		}
		return a;
	}
}

/*
 * 	public static String murcia(String a) {
		String b = a;
		if(a.indexOf("el area 51") != -1) {
			String[] parte= a.split("el area 51");
			if(a.indexOf("el area 51") == a.length()-10) {
				b = parte[0].concat("Murcia");
				System.out.println(b);
				murcia(b);
			}else {
				b = parte[0].concat("Murcia").concat(parte[1]);
				System.out.println(b);
				murcia(b);
			}
		}
		System.out.println("a1");
		return b;
	}
	
	public static String murcia1(String a) {
		while(a.indexOf("el area 51") != -1) {
			if(a.indexOf("el area 51") == a.length()-10) {
			String[] parte= a.split(a.substring(a.indexOf("el area 51"),a.indexOf("el area 51") + 10 ));
			String b = parte[0].concat("Murcia");
			a = b;
			}else {
			String[] parte= a.split(a.substring(a.indexOf("el area 51"),a.indexOf("el area 51") + 10 ));
			String b = parte[0].concat("Murcia").concat(parte[1]);
			a = b;
			}
			
		}
		
		return a;
	}
*/
