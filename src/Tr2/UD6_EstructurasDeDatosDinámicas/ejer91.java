package Tr2.UD6_EstructurasDeDatosDinámicas;

import java.util.*;

public class ejer91 {
	//	SE PONE EL SCANNER DE ESTA MANERA PARA PONERLO UNA UNICA VEZ EN TODO EL PROGRAMA JUSTO DESPUÉS DE PUBLIC CLASS EJER91
	static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		// Creo el Arraylist vacio donde guardare los grupos
		
		ArrayList<String> grupos = new ArrayList();
		
		// Defino una x para poder inicializar y salir del siguiente bucle
		
		int x;
		
		/* 
		 * Creo un DO WHILE, este bucle tiene un switch que cambia la variable por la opción que he escogido
		 * Es decir, en MOSTRAR_MENU le pido al usuario una opción y luego la paso al SWITCH
		 * Si la opción va del 1 - 6 ejecuta una funcion, si es la 7 termina y si es otra la vuelve a pedir
		*/
		do {
			x = mostrar_menu();
			sc.nextLine();
			switch (x) {
			
			case 1: 
				agregar_final(grupos);
				break;
				
			case 2:
				agregar_determinado(grupos);
				break;
			
			case 3:
				recuperar_grupo(grupos);
				break;
			case 4:
				modificar_grupo(grupos);
				break;
			case 5:
				pos_grupo(grupos);
				break;
			case 6:
				imprimir_lista(grupos);
				break;
			case 7:
				System.out.println("Gracias por utilizar este menú");
				break;
			}
		} while (x!=7);
	}

	/*
	 * MOSTRAR_MENU: Muestra por pantalla el menu y pide un numero del 1 al 7 
	 */
	public static int mostrar_menu() {
		System.out.println("-GRUPOS MUSICALES-");
		System.out.println("1-Agregar grupos al final de la lista");
		System.out.println("2-Agregar grupos en una posición concreta");
		System.out.println("3-Recuperar grupo en una posición determinada");
		System.out.println("4-Modifcar grupo en una posición determinada");
		System.out.println("5-Posición del grupo en la lista");
		System.out.println("6-Imprimir lista");
		System.out.println("7-Salir del programa");
		int opcion = sc.nextInt();
		if (opcion < 1 || opcion > 7) {
			opcion = mostrar_menu();
		}
		return opcion;	
	}
	/*
	 * VALIDAR_NOMBRE: Esta función se encarga de revisar si el nombre que me han dado esta o no en la lista
	 * con indexOf busco la palabra que me han dado en la lista, si devuelve -1 es que no esta en la lista 
	 */
	public static boolean validar_nombre(String palabra, ArrayList<String> grupos) {
		if(grupos.indexOf(palabra) != -1) {
			System.out.println("¡Este grupo ya esta en la lista!");
			return true;
		}else {
			return false;
		}
	}
	/*
	 * Hace lo mismo que el otro pero en vez de escribir si un grupo esta en la lista me avisa cuando NO esta
	 * no le tomes mucha atencion es IGUAL q el anterior 
	 */
	public static boolean validar_nombre_2(String palabra, ArrayList<String> grupos) {
		if(grupos.indexOf(palabra) != -1) {
			return true;
		}else {
			System.out.println("¡Este grupo no esta en la lista!");
			return false;
		}
	}
	/*
	 * Esta funcion revisa que la posicion que pide el usuario este en el Arraylist
	 * con GRUPOS.SIZE() obtengo la extensión del Array y le resto 1 por tema de q se empieza a contar en 0
	 * valido que el numero q me dan este entre 0 y el máximo de la exension del array
	 */
	public static boolean validar_pos(int pos, ArrayList<String> grupos) {
		if (pos < 0 || pos > grupos.size()-1) {
			System.out.println("Posición no válida");
			return true;
		}
		return false;
	}
	/*
	 * Esta funcion pide un nombre de grupo, después lo manda la función de antes de VALIDAR_NOMBRE y hasta que esta funcion
	 * no devuelva un TRUE (es decir q el nombre es válido) lo sigue pidiendo en un bucle WHILE(AUX) donde el aux es un true o false 
	 * que depende del validar nombre
	 * despues añade el nombre con grupo.add 
	 */
	public static void agregar_final(ArrayList<String> grupos) {
		System.out.println("Introduzca nombre del grupo que irá en la posición "+grupos.size());
		String nombre_grupo = sc.nextLine();
		boolean aux = validar_nombre(nombre_grupo, grupos);
		while (aux) {
			System.out.println("Introduzca nombre del grupo que irá en la posición "+grupos.size());
			nombre_grupo = sc.nextLine();
			aux = validar_nombre(nombre_grupo, grupos);		
		}
		grupos.add(nombre_grupo);
	}
	/*
	 * Esta función es similar a la anterior, pide un nombre, lo valida pero en vez de añadirlo al final te deja ponerlo donde quieras
	 * dentro del Array, por eso despues de pedir el nombre te pide una posición que se valida con la funcion VALIDAR_POS
	 */
	public static void agregar_determinado(ArrayList<String> grupos) {
		System.out.println("Introduzca nombre del grupo");
		String nombre_grupo = sc.nextLine();
		boolean aux = validar_nombre(nombre_grupo, grupos);
		while (aux) {
			System.out.println("Introduzca nombre del grupo");
			nombre_grupo = sc.nextLine();
			aux = validar_nombre(nombre_grupo, grupos);		
		}
		
		System.out.println("Introduzca posición del grupo ("+0+" - "+grupos.size()+") :");
		int pos = sc.nextInt();
		aux = validar_pos(pos, grupos);
		while (aux) {
			System.out.println("Introduzca posición del grupo ("+0+" - "+grupos.size()+") :");
			pos = sc.nextInt();
			aux = validar_pos(pos, grupos);		
		}
		sc.nextLine();
		grupos.add(pos,nombre_grupo);
	}
	/*
	 * Esta función recive un número del usuario, despuśe se valida que pueda estar entre 0 y el max
	 * del arraylist. A continuacion muestra al usuario el grupo q hay en esa posicion con grupo.get(pos)
	 * */
	public static void recuperar_grupo(ArrayList<String> grupos) {
		boolean z = validar_vacio(grupos);
		if (z) {
			return;
		}
		System.out.println("Introduzca posición del grupo a recuperar ("+0+" - "+grupos.size()+") :");
		int pos = sc.nextInt();
		boolean aux = validar_pos(pos, grupos);
		while (aux) {
			System.out.println("Introduzca posición del grupo a recuperar("+0+" - "+grupos.size()+") :");
			pos = sc.nextInt();
			aux = validar_pos(pos, grupos);		
		}
		sc.nextLine();
		System.out.println(grupos.get(pos));
	}
	/*
	 * Esta funcion enseña en pantalla la lista de grupos que tenemos.
	 * lo hace con un iterator pero puedes usar un for() como siempre de 0 a grupo.size,
	 * hay ejemplos en el pdf de paco
	 * */
	public static void imprimir_lista(ArrayList<String> grupos) {
		boolean z = validar_vacio(grupos);
		if (z) {
			return;
		}
		Iterator iter = grupos.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	/*
	 * Esta funcion recive el nombre de un grupo y comprueba q el grupo esta en la lista
	 * Si lo esta devuelve la posicion en la que se encuentra en la lista
	 * */
	public static void pos_grupo(ArrayList<String> grupos) {
		boolean z = validar_vacio(grupos);
		if (z) {
			return;
		}
		System.out.println("Introduzca nombre del grupo a buscar");
		String nombre_grupo = sc.nextLine();
		boolean aux = validar_nombre_2(nombre_grupo, grupos);
		while (!aux) {
			System.out.println("Introduzca nombre del grupo a buscar");
			nombre_grupo = sc.nextLine();
			aux = validar_nombre_2(nombre_grupo, grupos);		
		}
		System.out.println(grupos.indexOf(nombre_grupo));
	}
	/*
	 * Esta funcion sirve para cambiar el nombre de un grupo a otro
	 * Se pide al usuario la posición del grupo que queremos mover
	 * Se comprueba q la posicion es valida
	 * Se pide la posicion a la que queremos mover el grupo
	 * Se comprueba q la posicion es valida
	 * Con la función grupos.set(posicion, nombre del grupo) cambiamos el nombre del grupo
	 * */
	public static void modificar_grupo(ArrayList<String> grupos) {
		boolean z = validar_vacio(grupos);
		if (z) {
			return;
		}
		System.out.println("Introduzca posición del grupo a modificar: ("+0+" - "+grupos.size()+") :");
		int pos = sc.nextInt();
		boolean aux = validar_pos(pos, grupos);
		while (aux) {
			System.out.println("Introduzca posición del grupo a modificar("+0+" - "+grupos.size()+") :");
			pos = sc.nextInt();
			aux = validar_pos(pos, grupos);		
		}
		sc.nextLine();
		System.out.println("El grupo de la posición "+pos+" es: "+grupos.get(pos)+". ¿Cuál quieres que sea ahora?");	
		String nombre_grupo = sc.nextLine();
		aux = validar_nombre(nombre_grupo, grupos);
		while (aux) {
			System.out.println("¿Cuál quieres que sea ahora?");
			nombre_grupo = sc.nextLine();
			aux = validar_nombre(nombre_grupo, grupos);		
		}		
		grupos.set(pos,nombre_grupo);
	}
	/*
	 * Esta funcion comprueba si la lista de grupos que tenemos tiene algún grupo o no
	 * la uso para terminar funciones con un return cuando esas funciones necesitan si o si
	 * que hayan grupos y así evito que se creen bucles infinitos
	 * */
	private static boolean validar_vacio(ArrayList<String> grupos) {
		if (grupos.isEmpty()) {
			System.out.println("Opción inválida, todavía no has añadido ningún grupo.");
			return true;
		}
		return false;
	}
		
}
