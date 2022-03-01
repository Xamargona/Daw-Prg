package Tr2.UD5_Programacion_modular;

import java.util.*;

public class ejer71 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int contador = 1;
		for(int i = 2; i < 1000; i++) {
			if(esPrimo(i) == true && contador !=4){
				System.out.print(i+" ");
				contador++;
			}else if (esPrimo(i) == true && contador == 4){
				System.out.println(i);
				contador = 1;
			}
		}
	}
	
	public static boolean esPrimo(int n) {
		int contador = 2;
		boolean primo = true;
		while ((primo) && (contador!=n)){
			  if (n % contador == 0)
			    primo = false;
			  contador++;
		}
		return primo;
	}
}
