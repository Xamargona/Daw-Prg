package Tr2.UD6_EstructurasDeDatosDinámicas;

import java.util.*;
public class ejer88 {
	static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		HashMap<String, Integer> acceso = new HashMap<String, Integer>();
		
		acceso.put("user", 1234);
		
		boolean aux = true;
		int intentos = 0; 
		while(aux==true) {
			System.out.println("Introduce usuario y contraseña");
			String x = sc.nextLine();
			int y = sc.nextInt();
			sc.nextLine();
			if(acceso.containsKey(x) && acceso.get("user") == y) {
				System.out.println("Ha accedido al area restringida");
				aux = false;
			}else {
				System.out.println("Datos erróneos");
				intentos ++;
			}
			if(intentos == 3) {
				System.out.println("Lo siento, no tienes acceso al área restringida");
				aux = false;
			}
		}
				
	}

}
