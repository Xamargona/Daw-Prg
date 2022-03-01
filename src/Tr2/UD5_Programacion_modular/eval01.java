package Tr2.UD5_Programacion_modular;

import java.util.*;
public class eval01 {
	static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int[][] temperaturas = new int [4][4];
		
		String[] ciudades = new String [4];

		for (int[] row : temperaturas)
            Arrays.fill(row, 0);
		
		Arrays.fill(ciudades, "_");
		
		int x;
		do {
			x = mostrar_menu();
			switch (x) {
			
			case 1: 
				String ciudad = registrar_validar_ciudad();
				boolean aux = validar_espacio_cuidades(ciudades, ciudad);
				if(aux == true) {
					registrar_temperaturas(ciudad, ciudades, temperaturas);
				}
				break;
				
			case 2:
				mostrar_registros(ciudades, temperaturas);
				break;
			
			case 3:
				System.out.println("Gracias por consultar nuestra estacion metereológica");
				break;

			}
		} while (x!=3);

	}
	
	public static int mostrar_menu() {
		System.out.println("1-Introduce temperaturas de una ciudad");
		System.out.println("2-Listar temperaturas de todas las ciudades");
		System.out.println("3-Salir");
		int opcion = sc.nextInt();
		if (opcion < 1 || opcion > 3) {
			opcion = mostrar_menu();
		}
		return opcion;	
	}
	public static String registrar_validar_ciudad() {
		sc.nextLine();
		System.out.println("Introduzca el nombre de una ciudad");
		String ciudad = sc.nextLine();
		if (ciudad.isEmpty()) {
			System.out.println("¡ERROR! No has introducido ningún nombre");
			ciudad = registrar_validar_ciudad();
		}
		return ciudad;
	}
	
	public static boolean validar_espacio_cuidades(String[] registros, String ciudad) {
		for (int i = 0; i < registros.length; i++) {
			if(registros[i].equals("_")) {
				registros[i] = ciudad;
				return true;
			}
			if(registros[i].equals(ciudad)) {
				System.out.println("Esta ciudad ya se encuentra registrada ¿Realizar un nuevo registro de temperaturas??");
				System.out.println("Escriba 'si' o 'no'");
				String opcion = sc.nextLine();
				while (!opcion.equals("si") && !opcion.equals("no")) {
					opcion= sc.nextLine();
				}
				if(opcion.equals("si")) {
					return true;
				}else if (opcion.equals("no")) {
					return false;
				}
			}
			if(i == registros.length-1 && !registros[i].equals(ciudad)) {
				System.out.print("El registro esta completo");
				return false;
			}
		}
		return true;
	}
	
	public static void registrar_temperaturas(String ciudad, String[] lista_ciudades, int[][] temperaturas ) {
		int x;
		for (int i = 0; i < lista_ciudades.length; i++) {
			if(ciudad.equals(lista_ciudades[i])) {
				x = i;
				for(int j = 0; j < temperaturas.length; j++) {
					System.out.println("Introduce la temperatura "+(j+1)+" de "+ciudad);
					temperaturas[x][j] = sc.nextInt();
				}
			}
		}	
	}
	
	public static void mostrar_registros(String[] lista_ciudades, int[][] temperaturas) {
		
		boolean aux = true;
		
		if(lista_ciudades[0].equals("_")) {
			System.out.println("No hay ciudades registradas");
			aux = false;
		}
		
		if(aux == true) {
			for(int i = 0; i < lista_ciudades.length; i++) {
				if(!lista_ciudades[i].equals("_")) {
					System.out.println(lista_ciudades[i]+" tiene registradas las siguientes temperaturas:");
					for(int j = 0; j < temperaturas.length; j++) {
						if(j <3 ) {
							System.out.print(temperaturas[i][j]+", ");
						}else {
							System.out.print(temperaturas[i][j] + "\n");
						}
					}
				}
			}
		}
	}
}
