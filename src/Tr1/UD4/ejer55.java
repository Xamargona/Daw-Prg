package Tr1.UD4;

import java.util.*;

public class ejer55 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Elije una de las siguientes opciones:");
		System.out.println("1.- Longitud de una cadena");
		System.out.println("2.- Comparación de dos cadenas");
		System.out.println("3.- Concatenación de dos cadenas");
		System.out.println("4.- Obtener subcadenas");
		System.out.println("5.- Invertir cadenas");
		System.out.println("6.- Es palíndromo");
		System.out.println("9.- Salir");
		
		int opcion = sc.nextInt();
		sc.nextLine();
		String a;
		String b;
		int i;
		
		do {
			switch(opcion) {
			
			case 1: System.out.println("Introduce la cadena:");
					a = sc.nextLine();
					i = a.length();
					System.out.println(i);
					break;
					
			case 2:	System.out.println("Introduce la primera cadena:");	
					a = sc.nextLine();
					System.out.println("Introduce la segunda cadena:");
					b = sc.nextLine();
					i= a.compareTo(b);
					if(i==0) {
						System.out.println("Las cadenas son iguales");
					}else if(i>0) {
						System.out.println("La primera cadena es mayor que la segunda");
					}else if(i<0) {
						System.out.println("La segunda cadena es mayor que la primera");
					}
					break;
					
			case 3:	System.out.println("Introduce la primera cadena:");	
					a = sc.nextLine();
					System.out.println("Introduce la segunda cadena:");
					b = sc.nextLine();
					System.out.println(a + b);
					break;
					
			case 4:	System.out.println("Introduce la cadena:");
					a = sc.nextLine();
					System.out.println("Introduce el intervalo:");
					int primero = sc.nextInt();
					int segundo = sc.nextInt();
					String sub =a.substring(primero,segundo);
					System.out.println(sub);
					break;
					
			case 5:	System.out.println("Introduce la cadena:");		
					a = sc.nextLine();
					i = a.length();
					for (int l = i-1; l<i && l>=0; l--){
						System.out.print(a.charAt(l));
					}
					break;
					
			case 6:	System.out.println("Introduce la cadena:");
					a = sc.nextLine();
					i = a.length();
					int j = i-1;
					boolean comprueba = true;
					for (int l = 0; l<i; l++) {
						if(a.charAt(l)!=a.charAt(j)) {
							comprueba = false;
						}else {
							j--; 
						}
					}
					if(comprueba == true) {
						System.out.println("La palabra es palindroma");
					}else {
						System.out.println("La palabra no es palindroma");
					}
					break;		
			}
			if(opcion!=9){
				System.out.println("Elije una de las siguientes opciones:");
				System.out.println("1.- Longitud de una cadena");
				System.out.println("2.- Comparación de dos cadenas");
				System.out.println("3.- Concatenación de dos cadenas");
				System.out.println("4.- Obtener subcadenas");
				System.out.println("5.- Invertir cadenas");
				System.out.println("6.- Es palíndromo");
				System.out.println("9.- Salir");
				
				opcion = sc.nextInt();
				sc.nextLine();
			}else{
				System.out.println("Sayonara baby");
			}
		}
		while(opcion!=9);
	}
}
