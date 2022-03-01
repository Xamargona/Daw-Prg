package Tr2.UD6_EstructurasDeDatosDinámicas;

import java.util.*;

public class ejer94 {
	static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<String> ricos = new ArrayList();
		boolean aux = true;
		int num = decidir_num_revista();
		do {
			
			System.out.println("Introduzca nombre de rico para la revista "+ num+":");
			String nombre_rico = sc.nextLine();
			if (nombre_rico.equalsIgnoreCase("salir")) {
				aux = false;
				continue;
			}
			boolean factor_nombre = decidir_nombre_rico(nombre_rico);
			System.out.println("Introduzca dinero que dice tener "+nombre_rico);

			int pasta_rico = sc.nextInt();
			sc.nextLine();
			boolean factor_dinero = decidir_pasta_rico(pasta_rico);
			if (factor_dinero && factor_nombre) {
				ricos.add(nombre_rico);
				System.out.println(nombre_rico+" insertado en el Arraylist de forbes en la posicion "+ricos.size());
			}else {
				System.out.println(nombre_rico+" es muy pobre y no puede aparecer en forbes!");
			}
		} while (aux);
		mostrar_ricos(ricos);
	}

	
	public static int decidir_num_revista() {
		System.out.println("Introduzca el numero de la revista:");
		int num = sc.nextInt();
		while (num < 2000) {
			System.out.println("Introduzca el numero de la revista:");
			num = sc.nextInt();
		}
		sc.nextLine();
		return num;
	}
	
	public static boolean decidir_nombre_rico(String nombre_rico) {
		if (nombre_rico.contains("e") && nombre_rico.contains("o")) {
			return true;
		}
		return false;
	}
	
	public static boolean decidir_pasta_rico(int pasta_rico) {
		if (pasta_rico > 6000) {
			return true;
		}
		return false;
	}
	
	public static void mostrar_ricos(ArrayList<String> ricos) {
		Iterator iter = ricos.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
	}
}
