package Tr2.Actividades_Evaluables.AE2_JavierMG;

import java.util.*;

public class eval02 {
	static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		leer_nombre();
		
		System.out.println("Introduzca numero de estantes:");
		int estantes = sc.nextInt();
		System.out.println("Introduzca numero de libros por estantes:");
		int librosxestante = sc.nextInt();
		String[][] estanteria = new String [estantes][librosxestante];
		for (String[] row : estanteria)
            Arrays.fill(row, "*");
	
		int x;
		do {
			x = pintar_menu();
			sc.nextLine();
			switch (x) {
			
			case 1: 
				colocar_libro(estanteria);
				break;
				
			case 2:
				quitar_libro(estanteria);
				break;
			
			case 3:
				pintar_estanteria(estanteria);
				break;
			case 4:
				System.out.println("¡Gracias por usar este software tan divertido!");
				break;
			}
		} while (x!=4);
		
	
	}
	
	public static String leer_nombre(){
		System.out.println("¿Cómo quieres llamar a tu estanteria?");
		String nombre = sc.nextLine();
		boolean aux = validar_nombre(nombre);
		while(aux == false) {
			System.out.println("ERROR!: Nombre incorrecto!, Introduzca el nombre de nuevo:");
			nombre = sc.nextLine();
			aux = validar_nombre(nombre);
		}
		return nombre;
	}
	
	public static boolean validar_nombre(String nombre) {
		nombre = nombre.toLowerCase();
		char[] aux_nombre = nombre.toCharArray();
		char[] vocales = {'a','e','i','o','u'};
		int contador = 0;
		for(int i = 0; i < nombre.length(); i++) {
			contador++;
			for(int j = 0; j < vocales.length; j++) {
				if(aux_nombre[i] == vocales[j]) {
					contador = 0;
				}
			}
			if(contador == 3) {
				return true;
			}
		}
		return false;
	}

	
	
	public static int pintar_menu() {
		System.out.println("------------------");
		System.out.println("1-Colocar libro");
		System.out.println("2-Quitar libro");
		System.out.println("3-Pintar estanteria");
		System.out.println("4-Salir");
		System.out.println("------------------");
		System.out.println("Introduzca opción:");
		int opcion = sc.nextInt();
		if (opcion < 1 || opcion > 4) {
			opcion = pintar_menu();
		}
		return opcion;	
	}
	
	public static void colocar_libro(String[][] estanteria){
		System.out.println("Introduce el titulo del nuevo libro:");
		String libro = sc.nextLine();
		System.out.println("Introduzca posicion para poner "+libro+":");
		int x = sc.nextInt();
		int y = sc.nextInt();
		boolean aux = validar_coordenadas(x, y, estanteria);
		while (aux == false) {
			System.out.println("Introduzca posicion para poner "+libro+":");
			x = sc.nextInt();
			y = sc.nextInt();
			aux= validar_coordenadas(x, y, estanteria);
		}
		estanteria[x][y] = libro;
		System.out.println("OK!: Colocamos "+libro+" en la posición ["+x+","+y+"]");
		sc.nextLine();
	}
	
	public static boolean validar_coordenadas(int x, int y , String[][] estanteria) {
		boolean aux = true;
		if (x >= estanteria[0].length || x < 0) {
			System.out.println("ERROR!: El valor de fil: " +x+ " no es correcto");
			aux = false; 
		}
		if (y >= estanteria.length || y < 0) {
			System.out.println("ERROR!: El valor de col: " +y+ " no es correcto");
			aux = false; 
		}
		if(aux == true) {
			if(!estanteria[x][y].equals("*")) {
				System.out.println("ERROR!: Esa posición ya está ocupada por "+estanteria[x][y]);
				aux = false; 
			}
		}
		return aux;	
	}
	
	public static void quitar_libro(String[][] estanteria){
		System.out.println("Introduce el titulo del libro a quitar: ");
		String nombre = sc.nextLine();
		boolean aux = false;
		for(int i = 0; i < estanteria.length; i++) {
			for (int j = 0; j < estanteria[0].length; j++) {
				if(estanteria[i][j].equals(nombre) ) {
					System.out.println("OK!: Quito "+nombre +" de la posición ["+i+","+j+"]");
					estanteria[i][j] = "*";
					aux = true;
				}
			}
		}
		
		if(aux== true) {
			return;
		}
		
		if(aux == false) {
			System.out.println("ERROR!: No puedo quitar a "+nombre+" porque no existe!");
			quitar_libro(estanteria);
		}
		
	}
	public static void pintar_estanteria(String[][] estanteria){
		for (int i = 0; i < estanteria.length; i++) {
			for (int j = 0; j < estanteria[0].length; j++) {
				System.out.print(estanteria[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
