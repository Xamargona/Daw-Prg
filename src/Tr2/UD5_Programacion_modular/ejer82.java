package Tr2.UD5_Programacion_modular;

import java.util.*;

public class ejer82 {
	static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		divisores(n);
	}

	public static void divisores (int n) {
		int x = 0;
		if (n > 0) {
			while(x <= n) {
				x++;
				if(n%x == 0) {
					System.out.print(x + ",");
				}
			}
			
		}
	}
}
