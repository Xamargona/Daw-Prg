package Tr2.UD6_EstructurasDeDatosDinámicas;

import java.util.*;

public class ejer93 {
	static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Queue<String> cola = new LinkedList<String>();
				
		boolean verificador = true;
		
		do {
			verificador = entrada_cola(cola);
			if (!verificador) {
				continue;
			}
			System.out.println("Estado de la cola después de ENTRAR");
			muestra_cola(cola);
			salida_cola(cola);
			System.out.println("Estado de la cola después de SALIR");
			muestra_cola(cola);
		} while (verificador);
	
	}

	public static boolean entrada_cola(Queue<String> cola) {
		System.out.println("Introduzca nombres para ENTRAR separados por @, 'nadie' para que no entre nadie o 'salir' para finalizar el programa:");
		String entrada = sc.nextLine();
		if(entrada.equalsIgnoreCase("nadie")) {
			return true;
		}
		if (entrada.equalsIgnoreCase("salir")) {
			return false;
		}
		while (entrada.contains("@")) {
			String[] parts = entrada.split("@",2);
			String parte1 = parts[0];
			String parte2 = parts[1];
			entrada = parte2;
			cola.add(parte1);
		}
		cola.add(entrada);
		return true;
	}
	
	public static void salida_cola(Queue<String> cola) {
		System.out.println("Introduzca numero de personas para SALIR de la cola");
		int n = sc.nextInt();
		while (n > cola.size()||n < 0) {
			if (n > cola.size()) {
				System.out.println("No pueden salir "+n+" personas porque en la cola solo hay "+cola.size()+" personas");
			}
			if (n < 0) {
				System.out.println("Introduce un valor válido");
			}
			n = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			System.out.println("Sale de la cola "+cola.element());
			cola.remove();
		}
		sc.nextLine();
	}
	public static void muestra_cola(Queue<String> cola) {
		Iterator iter = cola.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
