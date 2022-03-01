package Tr2.UD6_EstructurasDeDatosDinámicas;

import java.util.*;

public class pruebas {
	static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<String> lista_interesados = new ArrayList();
		
		HashMap<Integer, ArrayList<String>> grupos = new HashMap<Integer, ArrayList<String>>();
	
		grupos.put(1, lista_interesados);
		grupos.get(1).add("skere");
		System.out.println(grupos.get(1));
	
	}

}
