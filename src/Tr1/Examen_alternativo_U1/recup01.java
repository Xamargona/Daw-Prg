package Tr1.Examen_alternativo_U1;

import java.util.Arrays;
import java.util.Scanner;

public class recup01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String cadena = "";
		String[] agenda = new String[3];
		int opcion;
		int aux1 = 0;
		int n_agenda = 0;
		boolean verificador = true;
		String[] aux = new String[3]; 
		while(verificador){
			System.out.println("----------------------");
			System.out.println("1-Introduce un nombre");
			System.out.println("2-Agregar nombre en la agenda");
			System.out.println("3-Listar nombres de la agenda");
			System.out.println("4-Salir del programa");
			System.out.println("----------------------");
			opcion = sc.nextInt();
			sc.nextLine();
			
			switch(opcion){
			case 1:
				System.out.print("Introduzca nombre y 2 apellidos por favor:");
				cadena = sc.nextLine();
				String[] partes = cadena.split(" ");
				if(partes.length != 3) {
					System.out.println("Todavía no se ha tecleado ningún nombre.");
					break;
				}
				System.out.println("Nombre: " + partes[0]);
				System.out.println("Primer apellido: " + partes[1]);
				System.out.println("Segundo apellido: " + partes[2]);
				aux = Arrays.copyOf(partes, partes.length);
				aux1 = 1;
				break;
			case 2:
				if(n_agenda == 0) {
					System.out.println("La agenda no contiene ningún nombre");
				}
				else if(n_agenda == 3) {
					System.out.println("La agenda esta completa!");
				}else if(aux1 == 1) {
					System.out.println(aux[0]+" "+aux[1]+" "+aux[2]+" agregegado a la agenda en la posicion "+(n_agenda+1));
					agenda[n_agenda] = aux[0]+" "+aux[1]+" "+aux[2];
					n_agenda++;
				}
				break;
			case 3:
				for(int i = 0; i < n_agenda; i++) {
					System.out.println("Posición " + (i+1) + ":" + agenda[i]);
				}
				break;
			case 4: 
				verificador = false;
				break;
			default:
				break;
				
			}
		}

		
	}
}
