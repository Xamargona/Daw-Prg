package Tr2.UD5_Programacion_modular;

import java.util.*;

public class ejer79 {
	static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduzca el número a partir del cual haremos la cuenta atrás...");
		int n = sc.nextInt();
		cuenta_atras(n);
	}
	public static void cuenta_atras(int n) {
		if (n >= 0) {
			System.out.println(n);
			pausa();
			cuenta_atras(--n);
		}else if (n < 0) {
			System.out.println("BOOM!");
			return;
		}
	}
	public static void pausa() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
