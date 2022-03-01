package Tr2.UD6_EstructurasDeDatosDinámicas;

import java.util.*;

public class ejer87 {

	public static void main(String[] args) {
		Random r = new Random();
		int veces = (int)(r.nextDouble()*11+10);
		ArrayList<Integer> lista = new ArrayList();

		System.out.println("LISTA");
		System.out.println("-------------");
		for (int i = 0; i < veces; i++) {
			int valor = (int)(r.nextDouble()*101);
			lista.add(valor);
		}
		lista.forEach(System.out::println);
		Iterator iter = lista.iterator();
		Iterator iter2 = lista.iterator();

		System.out.println("-------------");
		
		System.out.println("SUMA");
		System.out.println("-------------");
		int suma = 0;
		for (int i = 0; i < lista.size(); i++) {
			suma = suma + lista.get(i);
		}
		System.out.println(suma);
		System.out.println("-------------");
		System.out.println("MEDIA");
		System.out.println("-------------");	
		int media = suma / veces;
		System.out.println(media);
		System.out.println("-------------");		
		System.out.println("MÁXIMO");
		System.out.println("-------------");
		//Puedes utilizar x = (int) iter.next ---> max = x
		// Si no utilizas x cada vex q escribes el ITER.NEXT apunta al siguiente y puede dar una excepción por sobrepasar en 1 el array
		int max = lista.get(0);
		while (iter.hasNext()) {
			int x = (int) iter.next();
			if(max < x) {
				max = x;
			}
		}
		System.out.println(max);
		System.out.println("-------------");	
		System.out.println("MÍNIMO");
		System.out.println("-------------");
		int min = lista.get(0);
		while (iter2.hasNext()) {
			int x = (int) iter2.next();
			if(min > x) {
				min = x;
			}
		}
		System.out.println(min);
		System.out.println("-------------");
	}

}
