package Tr2.UD6_EstructurasDeDatosDinámicas;

import java.util.*;
public class ejer86 {

	public static void main(String[] args) {

		ArrayList<String> lista = new ArrayList();
		lista.add("Javier");
		lista.add("Ismael");
		lista.add("Marcos");
		lista.add("Marcos 2");
		lista.add("Adrián");
		lista.add("Adrián 2");
		
		for (String nombre : lista) {
			System.out.println(nombre);
		}
		
		System.out.println("--------");

		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println("--------");

		Iterator iter = lista.iterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
			
		}
		
		System.out.println("--------");
		
		lista.forEach(System.out::println);
		
	}

}
