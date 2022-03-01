package Tr2.UD6_EstructurasDeDatosDinámicas;

import java.util.*;

public class ejer92 {
	static final Scanner sc = new Scanner(System.in);
	static final Random r = new Random();

	public static void main(String[] args) {

		HashMap<String, Integer> participantes = new HashMap<String, Integer>();

		System.out.println("¡Bienvenidos al festival de Eurovision!");
		String cadena = "";
		do {
			cadena = insertar_pais(participantes);
		} while (participantes.size() < 3 || !cadena.equals("salir"));
		
		mayor_puntuacion(participantes);
		boolean aux;
		do {
			aux = obtener_puntuacion(participantes);
		} while (aux);
		
	}
	
	public static String insertar_pais(HashMap<String, Integer> participantes) {
		System.out.println("Introduzca nombre del país "+participantes.size()+":");
		String cadena = sc.nextLine();
		if(cadena.toLowerCase().equals("salir")) {
			return "salir";
		}
		boolean aux = validar_pais(cadena, participantes);
		if(aux == false) {
			System.out.println("Este País ya se encuentra registrado");
		}else{
			int num = (int) (r.nextDouble() * 12 + 1);
			participantes.put(cadena, num);
		}
		return "";
	}
	
	public static boolean validar_pais(String cadena, HashMap<String, Integer> participantes) {
		if (participantes.containsKey(cadena)) {
			return false;
		}
		return true;
	}
	
	public static void mayor_puntuacion(HashMap<String, Integer> participantes) {
		int max = 0;
		String cadena = "";
		for(String Key: participantes.keySet()) {
			if(participantes.get(Key) > max) {
				max = participantes.get(Key);
				cadena = Key;
			}
		}
		System.out.println("Con las puntuaciones repartidas, el país ganador es: "+cadena+" con "+max+" puntos");
	}
	
	public static boolean obtener_puntuacion(HashMap<String, Integer> participantes) {
		System.out.println("Introduzca nombre de país para saber su puntuación:");
		String cadena = sc.nextLine();
		if (cadena.toLowerCase().equals("salir")) {
			return false;
		}
		if(participantes.containsKey(cadena)) {
			System.out.println(cadena+" ha recibido "+participantes.get(cadena)+" votos");
		}else {
			System.out.println(cadena + "no ha participado en el festival");
			obtener_puntuacion(participantes);
			return true;
		}
		return true;
	}
	
}
