package Tr2.UD6_EstructurasDeDatosDinámicas;

import java.util.*;

public class ejer89 {
	static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		HashMap<String, String> diccionario = new HashMap<String, String>();
		
		diccionario.put("avion", "plane");
		diccionario.put("botella", "bottle");
		diccionario.put("arbol", "tree");
		diccionario.put("gato", "cat");
		diccionario.put("perro", "dog");

		boolean aux = true;
		
		while (aux) {
			System.out.println("Introduce una palabra en castellano para obtener su traducción si es posible \nSi desea salir escriba 'salir'");
			String x = sc.nextLine();
			if(diccionario.containsKey(x)) {
				System.out.println(diccionario.get(x));
			}
			if (x.equals("salir")) {
				aux=false;
			}
		}
		
	}

}
