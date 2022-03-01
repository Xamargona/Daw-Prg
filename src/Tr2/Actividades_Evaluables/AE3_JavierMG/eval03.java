package Tr2.Actividades_Evaluables.AE3_JavierMG;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class eval03 {
	static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		ArrayList<String> lista_interesados = new ArrayList();
		HashMap<Integer, String> entradas_asiganadas = new HashMap<Integer, String>();
		
		System.out.println("¡Bienvenidos al concierto de Kiko Rivera!");
		
		int capacidad = capacidad_sala();		
		int x;
		do {
			x = mostrar_menu();
			sc.nextLine();
			switch (x) {
			
			case 1: 
				lista_espera(lista_interesados, capacidad, entradas_asiganadas);
				break;
			case 2:
				comprar_entrada(lista_interesados, capacidad, entradas_asiganadas);
				break;
			
			case 3:
				mostrar_sala(lista_interesados, capacidad, entradas_asiganadas);
				break;
			case 4:
				System.out.println("Gracias por utilizar este menú");
				break;
			}
		} while (x!=4);	
		
		
	}

	public static int capacidad_sala() {
		System.out.println("Introduzca la capacidad de la sala de conciertos:");
		int x = sc.nextInt();
		while (x < 0) {
			System.out.println("Introduzca la capacidad de la sala de conciertos:");
			x = sc.nextInt();
		}
		return x;
	}
	
	public static int mostrar_menu() {
		System.out.println("---- TICKETEA -----");
		System.out.println("1-Añadir nombre a lista de interesados");
		System.out.println("2-Comprar entradas");
		System.out.println("3-Mostrar sala");
		System.out.println("4-Salir");
		int opcion = sc.nextInt();
		if (opcion < 1 || opcion > 4) {
			opcion = mostrar_menu();
		}
		return opcion;	
	}
	
	public static void lista_espera(ArrayList<String> lista, int capacidad,HashMap<Integer, String>entradas) {
		boolean z = validar_espacio(capacidad, entradas);
		if (z) {
			return;
		}
		System.out.println("Introduzca su nombre:");
		String nombre = sc.nextLine();
		lista.add(nombre);
		System.out.println(nombre + ", estas en la posicion "+lista.size()+" de la lista de interesados");
		System.out.println("Tenemos libres "+(capacidad-entradas.size()+" butacas para el concierto"));
	}
	
	public static void comprar_entrada(ArrayList<String> lista, int capacidad,HashMap<Integer, String>entradas) {
		boolean z = validar_espacio(capacidad, entradas);
		if (z) {
			return;
		}
		if (lista.isEmpty()) {
			System.out.println("ERROR!No existen personas interesadas!");
			return;
		}
		String nombre = lista.get(0);
		System.out.println(nombre+" va a comprar su entrada, ¿que butaca quiere comprar?");
		int butaca = sc.nextInt();
		boolean aux = validar_entrada(capacidad, entradas, butaca);
		while (aux) {
			butaca = sc.nextInt();
			aux = validar_entrada(capacidad, entradas, butaca);
		}
		System.out.println("Butaca "+butaca+" asignada a "+nombre);
		entradas.put(butaca, nombre);
		lista.remove(0);
	}
	
	public static boolean validar_entrada(int capacidad,HashMap<Integer, String>entradas, int butaca) {
		if (butaca > capacidad || butaca < 0) {
			System.out.println("Esa butaca no existe, introduzca otro numero:");
			return true;
		}
		if(entradas.containsKey(butaca)) {
			System.out.println("Esa butaca ya se encuentra asignada, introduzca otro numero:");
			return true;
		}
		return false;
	}

	public static void mostrar_sala(ArrayList<String> lista, int capacidad,HashMap<Integer, String>entradas) {
		for (int i = 0; i < capacidad; i++) {
			if (i > 9) {
				System.out.print(" "+i+"");			
			}else {
				System.out.print(" "+i+" ");
			}
		}		
		System.out.println();
		for (int i = 0; i < capacidad; i++) {
			if (entradas.containsKey(i)) {
				System.out.print("[X]");			
			}else {
				System.out.print("[L]");			
			}
		}
		System.out.println();
	}
	
	public static boolean validar_espacio(int capacidad,HashMap<Integer, String>entradas) {
		if (entradas.size()==capacidad) {
			System.out.println("SOLD OUT! No hay más tickets");
			return true;
		}
		return false;
	}
	
}