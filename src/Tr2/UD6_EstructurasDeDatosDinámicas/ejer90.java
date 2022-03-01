package Tr2.UD6_EstructurasDeDatosDinámicas;

import java.util.*;

public class ejer90 {
	static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Random r = new Random();

		HashMap<String, String> diccionario = new HashMap<String, String>();
		
		diccionario.put("avion", "plane");
		diccionario.put("botella", "bottle");
		diccionario.put("arbol", "tree");
		diccionario.put("gato", "cat");
		diccionario.put("perro", "dog");
				
		
		// Lista con los VALUES (para key usar keyset)
		ArrayList<String> listaAux = new ArrayList(diccionario.keySet());
		// Para obtener valor aleatorio de get a partir de la lista, algo lioso
		// diccionario.get(listaAux.get((int)(r.nextDouble()*listaAux.size())));
		
		int aciertos = 0;
		int fallos = 0;
		String entrada;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Escribe la traducción de las siguientes palabras:");
			
			String palabra =  listaAux.get((int)(r.nextDouble()*listaAux.size()));
			while (palabra.equals("_")) {
				palabra =  listaAux.get((int)(r.nextDouble()*listaAux.size()));
			}
			System.out.println(palabra);

			listaAux.set(listaAux.indexOf(palabra),"_");
			
			entrada = sc.nextLine();
			
			if(entrada.equals(diccionario.get(palabra))) {
				aciertos ++;
			}else {
				fallos ++;
			}
		}
		
		System.out.println("Aciertos: "+aciertos+"\nFallos: "+fallos);
	
	}
}
