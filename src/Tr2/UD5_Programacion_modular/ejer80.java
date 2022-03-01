package Tr2.UD5_Programacion_modular;

import java.util.*;

public class ejer80 {
	static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduzca un número para pasar a binario:");
		int n = sc.nextInt();
		System.out.println(binario(n));
	}
	public static String binario(int n) {
		String bin;
		if(n == 0) {
			bin = "";
		}else{
			bin = binario(n/2) + (n%2);	
		}
		return bin;
	}
}
