package Tr2.EXAMEN_JavierMG;

import java.util.*;

public class melomano {
	static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		ArrayList<String> lista_grupos = new ArrayList();
		ArrayList<String> lista_cd = new ArrayList();
		ArrayList<String> lista_vinilos = new ArrayList();
		ArrayList<String> lista_cassetes = new ArrayList();
		ArrayList<String> lista_dvds= new ArrayList();

		int x;
		do {
			x = mostrar_menu();
			sc.nextLine();
			switch (x) {
			
			case 1: 
				gestion_grupos_musicales(lista_grupos);
				break;
			case 2:
				gestion_cd(lista_grupos, lista_cd);
				break;
			case 3:
				gestion_vinilos(lista_grupos, lista_vinilos);
				break;
			case 4:
				gestion_cassetes(lista_grupos, lista_cassetes);
				break;
			case 5:
				gestion_dvd(lista_grupos, lista_dvds);
				break;
			case 6:
				listar_informacion(lista_grupos, lista_cd, lista_vinilos, lista_cassetes, lista_dvds);
				break;
			case 7:
				System.out.println("Gracias por utilizar este software!");
				break;
			}
		} while (x!=7);	
	}
	
	public static int mostrar_menu() {
		System.out.println("------------------");
		System.out.println("MENU DEL MELOMANO");
		System.out.println("------------------");
		System.out.println("1-Gestion grupos musicales");
		System.out.println("2-Gestion cds");
		System.out.println("3-Gestion vinilos");
		System.out.println("4-Gestion cassetes");
		System.out.println("5-Gestion dvds");
		System.out.println("6-Listar informacion de un grupo");
		System.out.println("7-Salir");
		int opcion = sc.nextInt();
		if (opcion < 1 || opcion > 7) {
			opcion = mostrar_menu();
		}
		return opcion;	
	}
	
	public static void imprimir_lista(ArrayList<String> lista) {
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("-"+lista.get(i));
		}
	}

	public static boolean validar_vacio(ArrayList<String> grupos) {
		if (grupos.isEmpty()) {
			System.out.println("Opción inválida, todavía no has añadido ningún grupo.");
			return true;
		}
		return false;
	}
	
	//----------------------------------------------------------------------------------
	//--------------------------------GESTION DE GRUPOS---------------------------------
	//----------------------------------------------------------------------------------

	public static void gestion_grupos_musicales(ArrayList<String> grupos) {
		String opcion;
		System.out.println("¡Vamos a gestionar los grupos!");
		System.out.println("¿Damos de alta o damos de baja grupos? (a/b):");
		opcion= sc.nextLine();
		while (!opcion.equals("a") && !opcion.equals("b")) {
			System.out.println("ERROR! opcion "+ opcion +" incorrecta!, solo se admiten valores a/b");
			opcion = sc.nextLine();
		}
		if (opcion.equals("a")) {
			insertar_grupo(grupos);
		}else if (opcion.equals("b")) {
			baja_grupo(grupos);
		}
		System.out.println("Lista de grupos actualizada");
		imprimir_lista(grupos);
	}
	
	public static void insertar_grupo(ArrayList<String> grupos) {
		System.out.println("Introduzca nombre del grupo a dar de alta:");
		String nombre = sc.nextLine();
		while (nombre.isEmpty() || grupos.contains(nombre)) {
			if (nombre.isEmpty()) {
				System.out.println("ERROR! nombre del grupo vacio!");
				System.out.println("Introduzca nombre del grupo a dar de alta:");
				nombre = sc.nextLine();
				continue;
			}else if (grupos.contains(nombre)) {
				System.out.println("ERROR! el grupo ya se encuentra registrado!");
				System.out.println("Introduzca nombre del grupo a dar de alta:");
				nombre = sc.nextLine();
				continue;
			}
		}
		grupos.add(nombre);
	}
	
	public static void baja_grupo(ArrayList<String> grupos) {
		boolean z = validar_vacio(grupos);
		if (z) {
			return;
		}
		System.out.println("Introduzca nombre del grupo a dar de baja:");
		String nombre = sc.nextLine();
		while (!grupos.contains(nombre)) {
				System.out.println("ERROR! el grupo no se encuentra registrado!");
				System.out.println("Introduzca nombre del grupo a dar de baja:");
				nombre = sc.nextLine();
		}
		grupos.remove(nombre);
	}
	
	//----------------------------------------------------------------------------------
	//----------------------------------GESTION DE CDS----------------------------------
	//----------------------------------------------------------------------------------

	public static void gestion_cd(ArrayList<String> grupos, ArrayList<String> lista) {
		boolean z = validar_vacio(grupos);
		if (z) {
			return;
		}
		String opcion;
		System.out.println("¡Vamos a gestionar los cds!");
		System.out.println("¿Damos de alta o damos de baja cds? (a/b):");
		opcion= sc.nextLine();
		while (!opcion.equals("a") && !opcion.equals("b")) {
			System.out.println("ERROR! opcion "+ opcion +" incorrecta!, solo se admiten valores a/b");
			opcion = sc.nextLine();
		}
		if (opcion.equals("a")) {
			insertar_cd(grupos, lista);
		}else if (opcion.equals("b")) {
			eliminar_cd(grupos, lista);
		}
		System.out.println("Lista de cds actualizada");
		imprimir_lista(lista);
	}
		
	public static void insertar_cd(ArrayList<String> grupos, ArrayList<String> lista) {
		String datos = "";
		String nombre_grupo;
		do {
			System.out.println("Introduzca datos del cd, (nombre del grupo:nombre del cd):");
			datos = sc.nextLine();
			if (!datos.contains(":")) {
				System.out.println("Formato incorrecto, faltan los 2 puntos (:)");
				continue;
			}
			String[] partes = datos.split(":");
			nombre_grupo = partes[0];
			if (!grupos.contains(nombre_grupo)) {
				System.out.println("ERROR! El grupo "+nombre_grupo+" no existe!");
				datos = "";
				continue;
			}
			lista.add(datos);
		} while (!datos.contains(":"));
	}
	
	public static void eliminar_cd(ArrayList<String> grupos, ArrayList<String> lista) {
		String datos = "";
		String nombre_grupo;
		do {
			System.out.println("Introduzca datos del cd, (nombre del grupo:nombre del cd):");
			datos = sc.nextLine();
			if (!datos.contains(":")) {
				System.out.println("Formato incorrecto, faltan los 2 puntos (:)");
				continue;
			}
			String[] partes = datos.split(":");
			nombre_grupo = partes[0];
			if (!grupos.contains(nombre_grupo)) {
				System.out.println("ERROR! El grupo "+nombre_grupo+" no existe!");
				datos = "";
				continue;
			}
			String info = partes[1];
			if (lista.contains(datos)) {
				lista.remove(datos);
			}else {
				return;
			}
		} while (!datos.contains(":"));
	}

	//----------------------------------------------------------------------------------
	//------------------------------GESTION DE VINILOS----------------------------------
	//----------------------------------------------------------------------------------

	public static void gestion_vinilos(ArrayList<String> grupos, ArrayList<String> lista) {
		boolean z = validar_vacio(grupos);
		if (z) {
			return;
		}
		String opcion;
		System.out.println("¡Vamos a gestionar los vinilos!");
		System.out.println("¿Damos de alta o damos de baja vinilos? (a/b):");
		opcion= sc.nextLine();
		while (!opcion.equals("a") && !opcion.equals("b")) {
			System.out.println("ERROR! opcion "+ opcion +" incorrecta!, solo se admiten valores a/b");
			opcion = sc.nextLine();
		}
		if (opcion.equals("a")) {
			insertar_vinilos(grupos, lista);
		}else if (opcion.equals("b")) {
			eliminar_vinilos(grupos, lista);
		}
		System.out.println("Lista de vinilos actualizada");
		imprimir_lista(lista);
	}
		
	public static void insertar_vinilos(ArrayList<String> grupos, ArrayList<String> lista) {
		String datos = "";
		String nombre_grupo;
		do {
			System.out.println("Introduzca datos del vinilos, (nombre del grupo:nombre del vinilo):");
			datos = sc.nextLine();
			if (!datos.contains(":")) {
				System.out.println("Formato incorrecto, faltan los 2 puntos (:)");
				continue;
			}
			String[] partes = datos.split(":");
			nombre_grupo = partes[0];
			if (!grupos.contains(nombre_grupo)) {
				System.out.println("ERROR! El grupo "+nombre_grupo+" no existe!");
				datos = "";
				continue;
			}
			lista.add(datos);
		} while (!datos.contains(":"));
	}
	
	public static void eliminar_vinilos(ArrayList<String> grupos, ArrayList<String> lista) {
		String datos = "";
		String nombre_grupo;
		do {
			System.out.println("Introduzca datos del vinilo, (nombre del grupo:nombre del vinilo):");
			datos = sc.nextLine();
			if (!datos.contains(":")) {
				System.out.println("Formato incorrecto, faltan los 2 puntos (:)");
				continue;
			}
			String[] partes = datos.split(":");
			nombre_grupo = partes[0];
			if (!grupos.contains(nombre_grupo)) {
				System.out.println("ERROR! El grupo "+nombre_grupo+" no existe!");
				datos = "";
				continue;
			}
			String info = partes[1];
			if (lista.contains(datos)) {
				lista.remove(datos);
			}else {
				return;
			}
		} while (!datos.contains(":"));
	}
	
	
	//----------------------------------------------------------------------------------
	//------------------------------GESTION DE CASSETES---------------------------------
	//----------------------------------------------------------------------------------
	
	public static void gestion_cassetes(ArrayList<String> grupos, ArrayList<String> lista) {
		boolean z = validar_vacio(grupos);
		if (z) {
			return;
		}
		String opcion;
		System.out.println("¡Vamos a gestionar los cassetes!");
		System.out.println("¿Damos de alta o damos de baja cassetes? (a/b):");
		opcion= sc.nextLine();
		while (!opcion.equals("a") && !opcion.equals("b")) {
			System.out.println("ERROR! opcion "+ opcion +" incorrecta!, solo se admiten valores a/b");
			opcion = sc.nextLine();
		}
		if (opcion.equals("a")) {
			insertar_cassetes(grupos, lista);
		}else if (opcion.equals("b")) {
			eliminar_cassetes(grupos, lista);
		}
		System.out.println("Lista de cassetes actualizada");
		imprimir_lista(lista);

	}
		
	public static void insertar_cassetes(ArrayList<String> grupos, ArrayList<String> lista) {
		String datos = "";
		String nombre_grupo;
		do {
			System.out.println("Introduzca datos del cassete, (nombre del grupo:nombre del cassete):");
			datos = sc.nextLine();
			if (!datos.contains(":")) {
				System.out.println("Formato incorrecto, faltan los 2 puntos (:)");
				continue;
			}
			String[] partes = datos.split(":");
			nombre_grupo = partes[0];
			if (!grupos.contains(nombre_grupo)) {
				System.out.println("ERROR! El grupo "+nombre_grupo+" no existe!");
				datos = "";
				continue;
			}
			lista.add(datos);
		} while (!datos.contains(":"));
	}
	
	public static void eliminar_cassetes(ArrayList<String> grupos, ArrayList<String> lista) {
		String datos = "";
		String nombre_grupo;
		do {
			System.out.println("Introduzca datos del cassete, (nombre del grupo:nombre del cassete):");
			datos = sc.nextLine();
			if (!datos.contains(":")) {
				System.out.println("Formato incorrecto, faltan los 2 puntos (:)");
				continue;
			}
			String[] partes = datos.split(":");
			nombre_grupo = partes[0];
			if (!grupos.contains(nombre_grupo)) {
				System.out.println("ERROR! El grupo "+nombre_grupo+" no existe!");
				datos = "";
				continue;
			}
			String info = partes[1];
			if (lista.contains(datos)) {
				lista.remove(datos);
			}else {
				return;
			}
		} while (!datos.contains(":"));
	}
	
	//----------------------------------------------------------------------------------
	//------------------------------GESTION DE DVDS-------------------------------------
	//----------------------------------------------------------------------------------

	public static void gestion_dvd(ArrayList<String> grupos, ArrayList<String> lista) {
		boolean z = validar_vacio(grupos);
		if (z) {
			return;
		}
		String opcion;
		System.out.println("¡Vamos a gestionar los dvds!");
		System.out.println("¿Damos de alta o damos de baja dvd? (a/b):");
		opcion= sc.nextLine();
		while (!opcion.equals("a") && !opcion.equals("b")) {
			System.out.println("ERROR! opcion "+ opcion +" incorrecta!, solo se admiten valores a/b");
			opcion = sc.nextLine();
		}
		if (opcion.equals("a")) {
			insertar_dvd(grupos, lista);
		}else if (opcion.equals("b")) {
			eliminar_dvd(grupos, lista);
		}
		System.out.println("Lista de DVDs actualizada");
		imprimir_lista(lista);
	}
		
	public static void insertar_dvd(ArrayList<String> grupos, ArrayList<String> lista) {
		String datos = "";
		String nombre_grupo;
		do {
			System.out.println("Introduzca datos del dvd, (nombre del grupo:nombre del dvd):");
			datos = sc.nextLine();
			if (!datos.contains(":")) {
				System.out.println("Formato incorrecto, faltan los 2 puntos (:)");
				continue;
			}
			String[] partes = datos.split(":");
			nombre_grupo = partes[0];
			if (!grupos.contains(nombre_grupo)) {
				System.out.println("ERROR! El grupo "+nombre_grupo+" no existe!");
				datos = "";
				continue;
			}
			lista.add(datos);
		} while (!datos.contains(":"));
	}
	
	public static void eliminar_dvd(ArrayList<String> grupos, ArrayList<String> lista) {
		String datos = "";
		String nombre_grupo;
		do {
			System.out.println("Introduzca datos del dvd, (nombre del grupo:nombre del dvd):");
			datos = sc.nextLine();
			if (!datos.contains(":")) {
				System.out.println("Formato incorrecto, faltan los 2 puntos (:)");
				continue;
			}
			String[] partes = datos.split(":");
			nombre_grupo = partes[0];
			if (!grupos.contains(nombre_grupo)) {
				System.out.println("ERROR! El grupo "+nombre_grupo+" no existe!");
				datos = "";
				continue;
			}
			String info = partes[1];
			if (lista.contains(datos)) {
				lista.remove(datos);
			}else {
				return;
			}
		} while (!datos.contains(":"));
	}
	
	//----------------------------------------------------------------------------------
	//------------------------------Listar informacion----------------------------------
	//----------------------------------------------------------------------------------
	
	public static void listar_informacion(ArrayList<String> grupos, ArrayList<String> cd, ArrayList<String> vinilos, ArrayList<String> cassetes, ArrayList<String> dvd) {
		boolean z = validar_vacio(grupos);
		if (z) {
			return;
		}
		System.out.println("Introduzca nombre del grupo:");
		String nombre = sc.nextLine();
		while (!grupos.contains(nombre)) {
				System.out.println("ERROR! el grupo no se encuentra registrado!");
				System.out.println("Introduzca nombre del grupo:");
				nombre = sc.nextLine();	
		}
		System.out.println("Esto es lo que tengo de "+nombre);
		System.out.println("-CDs:");
		listas_imprimir(nombre, cd);
		System.out.println("-Vinilos:");
		listas_imprimir(nombre, vinilos);
		System.out.println("-Cassetes:");
		listas_imprimir(nombre, cassetes);
		System.out.println("-DVDs:");
		listas_imprimir(nombre, dvd);

		
	}
	
	public static void listas_imprimir(String nombre, ArrayList<String> lista) {
		boolean aux = false;
		for (int i = 0; i < lista.size(); i++) {
			String partes[] = lista.get(i).split(":");
			String parte1 = partes[0];
			String parte2 = partes[1];
			if (parte1.equals(nombre)) {
				System.out.println("    -"+parte2);
				aux= true;
			}
		}
		if (!aux) {
			System.out.println("    Nada");
		}
	}
	
	
}
