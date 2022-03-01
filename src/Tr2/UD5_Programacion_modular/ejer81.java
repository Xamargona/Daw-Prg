package Tr2.UD5_Programacion_modular;

import java.util.*;

public class ejer81 {
	static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		System.out.println(mayor1(n1,n2));
		System.out.println(mayor2(n1, n2, n3));
		System.out.println(mayor3(n1, n2, n3, n4));

	}
	public static int mayor1(int n1, int n2) {
		int mayor = n1;
		if(mayor < n2){
			mayor = n2;
		}
		return mayor;
	}
	public static int mayor2(int n1, int n2, int n3) {
		int mayor = n1;
		if(mayor < n2 || mayor < n3) {
			mayor = mayor2(n2, n3, n1);
		}
		return mayor;
	}
	public static int mayor3(int n1, int n2, int n3, int n4) {
		int mayor = n1;
		if(mayor < n2 || mayor < n3 || mayor < n4) {
			mayor = mayor3(n2, n3, n4, n1);
		}
		return mayor;
	}
}
