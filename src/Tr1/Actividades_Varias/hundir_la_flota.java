package Tr1.Actividades_Varias;

import java.util.*;

public class hundir_la_flota {
	
	static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Escoge modo de juego:\n1 - Predefinido\n2 - Aleatorio");
		int n = sc.nextInt();
		if (n == 1) {
			predefinido();
		}else {
			aleatorio();
		}
	}
	
	public static void aleatorio() {
		
		// tablero 10x10 barco de 4 x1 barco de 3 x2 barco de 2 x3 barco de 1x4
		// 0 casilla vacia 1 casilla con barco 2 casilla descubierta vacia 3 casilla descubierta tocada

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int tam = 10;
		int[][] tablero = new int [tam][tam];
		int can_barcos1 = 4;
		int can_barcos2 = 3;
		int can_barcos3 = 2;
		int can_barcos4 = 1;
		int valor1;
		int valor2;
		int valor3;
		Boolean aux = false;
		
		System.out.println("BIENVENIDO A HUNDIR LA FLOTA");
		
		// Genero tablero 
		for (int i = 0; i < tam; i++) {
			for (int j = 0; j < tam; j++) {
				tablero[i][j] = 0;
			}
		}

		// Creo 4 casillas aleatorias con un barco de una casilla
		for (int i = 0; i < can_barcos1;){
			valor1 =  (int)(r.nextDouble()*9);
			valor2 =  (int)(r.nextDouble()*9);
			if(tablero[valor1][valor2] == 1) {
				continue;
			}
			tablero[valor1][valor2] = 1;
			i++;
		}
		
		// Crea un registro para los barcos de 2 casillas
		for (int i = 0; i < can_barcos2;){
			valor1 = (int)(r.nextDouble()*9);
			valor2 = (int)(r.nextDouble()*9);
			if(tablero[valor1][valor2] == 1 || tablero[valor1][valor2] == 2){
				continue;
			}else{
				//generar barcos de 2
			tablero[valor1][valor2] = 2;
			valor3 = (int)(r.nextDouble()*4+1);
				while(aux == false) {
					switch(valor3) {
					case 1: //izquierda
						if(valor2 > 0 && tablero[valor1][valor2-1] == 0) {
							tablero[valor1][valor2-1] = 2;
							aux = true;
							break;
						}else{
							valor3 = 2;
						}
					case 2: //arriba
						if(valor1 > 0 && tablero[valor1-1][valor2] == 0) {
							tablero[valor1-1][valor2] = 2;
							aux = true;
							break;
						}else{
							valor3 = 3;
						}
					case 3: //derecha
						if(valor2 < 9 && tablero[valor1][valor2+1] == 0) {
							tablero[valor1][valor2+1] = 2;
							aux = true;
							break;
						}else{
							valor3 = 4;
						}
					case 4: //abajo
						if(valor1 < 9 && tablero[valor1+1][valor2] == 0) {
							tablero[valor1+1][valor2] = 2;
							aux = true;
							break;
						}else{
							valor3 = 1;
						}
					}
				}
				aux = false;
			}
			i++;
		}
		
		// barcos de 3
		for (int i = 0; i < can_barcos3;){
			valor1 = (int)(r.nextDouble()*9);
			valor2 = (int)(r.nextDouble()*9);
			if(tablero[valor1][valor2] != 0){
				continue;
			}else{
				//generar barcos de 3
			valor3 = (int)(r.nextDouble()*4+1);
				while(aux == false) {
					switch(valor3) {
					case 1: //izquierda
						if(valor2 > 1 && tablero[valor1][valor2-1] == 0 && tablero[valor1][valor2-2] == 0){
							tablero[valor1][valor2] = 3;
							tablero[valor1][valor2-1] = 3;
							tablero[valor1][valor2-2] = 3;
							aux = true;
							break;
						}else{
							valor3 = 2;
						}
					case 2: //arriba
						if(valor1 > 1 && tablero[valor1-1][valor2] == 0 && tablero[valor1-2][valor2] == 0){
							tablero[valor1][valor2] = 3;
							tablero[valor1-1][valor2] = 3;
							tablero[valor1-2][valor2] = 3;
							aux = true;
							break;
						}else{
							valor3 = 3;
						}					
					case 3: //derecha
						if(valor2 < 8 && tablero[valor1][valor2+1] == 0 && tablero[valor1][valor2+2] == 0){
							tablero[valor1][valor2] = 3;
							tablero[valor1][valor2+1] = 3;
							tablero[valor1][valor2+2] = 3;
							aux = true;
							break;
						}else{
							valor3 = 4;
						}				
					case 4: //abajo
						if(valor1 < 8 && tablero[valor1+1][valor2] == 0 && tablero[valor1+2][valor2] == 0){
							tablero[valor1][valor2] = 3;
							tablero[valor1+1][valor2] = 3;
							tablero[valor1+2][valor2] = 3;
							aux = true;
							break;
						}else{
							valor3 = 1;
						}
					}
				}
				aux = false;
			}
			i++;
		}
		
		// barcos de 4
		for (int i = 0; i < can_barcos4;){
			valor1 = (int)(r.nextDouble()*9);
			valor2 = (int)(r.nextDouble()*9);
			if(tablero[valor1][valor2] != 0){
				continue;
			}else{
				//generar barcos de 4
			valor3 = (int)(r.nextDouble()*4+1);
				while(aux == false) {
					switch(valor3) {
					case 1: //izquierda
						if(valor2 > 2 && tablero[valor1][valor2-1] == 0 && tablero[valor1][valor2-2] == 0 && tablero[valor1][valor2-3] == 0){
							tablero[valor1][valor2] = 4;
							tablero[valor1][valor2-1] = 4;
							tablero[valor1][valor2-2] = 4;
							tablero[valor1][valor2-3] = 4;
							aux = true;
							break;
						}else{
							valor3 = 2;
						}
					case 2: //arriba
						if(valor1 > 2 && tablero[valor1-1][valor2] == 0 && tablero[valor1-2][valor2] == 0 && tablero[valor1-3][valor2] == 0){
							tablero[valor1][valor2] = 4;
							tablero[valor1-1][valor2] = 4;
							tablero[valor1-2][valor2] = 4;
							tablero[valor1-3][valor2] = 4;
							aux = true;
							break;
						}else{
							valor3 = 3;
						}
					case 3: //derecha
						if(valor2 < 7 && tablero[valor1][valor2+1] == 0 && tablero[valor1][valor2+2] == 0 && tablero[valor1][valor2+3] == 0){
							tablero[valor1][valor2] = 4;
							tablero[valor1][valor2+1] = 4;
							tablero[valor1][valor2+2] = 4;
							tablero[valor1][valor2+3] = 4;
							aux = true;
							break;
						}else{
							valor3 = 4;
						}
					case 4: //abajo
						if(valor1 < 7 && tablero[valor1+1][valor2] == 0 && tablero[valor1+2][valor2] == 0 && tablero[valor1+3][valor2] == 0){
							tablero[valor1][valor2] = 4;
							tablero[valor1+1][valor2] = 4;
							tablero[valor1+2][valor2] = 4;
							tablero[valor1+3][valor2] = 4;
							aux = true;
							break;
						}else{
							valor3 = 1;
						}
					}
				}
				aux = false;
			}
			i++;
		}
			
		while(aux == false) {
			aux = true;
			System.out.println("¡Escoge una casilla para disparar! ([0-9][0-9])");

			System.out.print("   ");
			for (int i = 0; i < 10; i++) {
				System.out.print(" "+i+" ");
			}
			System.out.println();
			for (int i = 0; i < tam; i++) {
				System.out.print(" "+i+" ");
				for (int j = 0; j < tam; j++) {
					if(tablero[i][j] < 5){
						System.out.print("[ ]");
					}else if(tablero[i][j] == 5){
						System.out.print("[O]");
					}else if(tablero[i][j] == 6){
						System.out.print("[X]");
					}
				}
				System.out.println();
			}
			valor1 = sc.nextInt();
			valor2 = sc.nextInt();
			while(valor1 < 0 || valor1 > 9 || valor2 < 0 || valor2 > 9) {
				System.out.println("ERROR: Escoge unas coordenadas validas");
				System.out.println("¡Escoge una casilla a disparar! ([0-9][0-9])");
				valor1 = sc.nextInt();
				valor2 = sc.nextInt();
			}
			System.out.println();
			
			switch(tablero[valor1][valor2]) {
			case 0:
				System.out.println("¡Agua!");
				tablero[valor1][valor2] = 5;
				break;
			case 1:
				System.out.println("Le has dado a un barco de una posición ¡Tocado y hundido!");
				tablero[valor1][valor2] = 6;
				break;
			case 2:
				System.out.println("Le has dado a un barco de dos posiciones ¡Tocado!");
				tablero[valor1][valor2] = 6;
				break;
			case 3:
				System.out.println("Le has dado a un barco de tres posiciones ¡Tocado!");
				tablero[valor1][valor2] = 6;
				break;
			case 4:
				System.out.println("Le has dado a un barco de cuatro posiciones ¡Tocado!");
				tablero[valor1][valor2] = 6;
				break;
			case 5:
				System.out.println("Estas coordenadas ya las habías usado ¡Agua!");
				break;
			case 6:
				System.out.println("Estas coordenadas ya las habías usado ¡Tocado!");
				break;
			}
			System.out.println();
			
			
			for (int i = 0; i < tam; i++) {
				for (int j = 0; j < tam; j++) {
					if(tablero[i][j] >= 0 && tablero[i][j] < 5) {
						aux = false;
						break;
					}
				}
			}
		}

	}
	
	public static void predefinido() {
		
		// Creación de tablero 

		int tam = 6;
		String[][] tablero = new String [tam][tam];
		for (int i = 0; i < tam; i++) {
			for (int j = 0; j < tam; j++) {
				tablero[i][j] = "_";
			}
		}
		
		// Nombre jugador
		
		System.out.println("Bienvenido al juego de hundir la flota 6x6, introduzca su nombre:");
		String nombre = sc.nextLine();
		
		// Fase de colocación
		
		System.out.println("Hola, Capitan "+nombre+". Déjeme que le ayude a configurar su flota.");
		colocacion(tablero, 4, nombre);
		System.out.println("Capitan "+nombre+" aquí estan sus transatlanticos...");
		muestra(tablero);
		colocacion(tablero, 3, nombre);
		System.out.println("Capitan "+nombre+" aquí estan sus transatlanticos y sus cargueros...");
		muestra(tablero);
		colocacion(tablero, 1, nombre);
		System.out.println("Capitan "+nombre+" aquí estan sus transatlanticos, sus cargueros y sus lanchas...");
		muestra(tablero);
		
		// Contador
		int t = 0;
		int c = 0; 
		int l = 0;
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6 ; j++) {
				if(tablero[i][j].equals("T")) {
					t++;
				}
				if(tablero[i][j].equals("C")) {
					c++;
				}
				if(tablero[i][j].equals("L")) {
					l++;
				}
			}
		}
		t = t/4;
		c = c/3;
		
		juegacion(tablero, t, c, l);
		
		
	}
	
	public static void colocacion(String[][] tablero, int n, String nombre) {
		String x;
		String y;
		String barcos = "";
		int can_barcos;
		int longitud;
		String letra;
		if(n == 4) {
			barcos = "transatlántico";
			can_barcos = 3;
			longitud = 4;
			letra = "T";
		}else if(n == 3){
			barcos = "cargueros";
			can_barcos = 3;
			longitud = 3;
			letra = "C";
		}else{
			barcos = "lanchas";
			can_barcos = 5;
			longitud = 1;
			letra = "L";
		}
		
		for(int i = 1; i <= can_barcos;) {
			int n1 = -1;
			int n2 = -1;
			System.out.println("Introduzca la posición de su "+barcos+" numero "+i+" de "+can_barcos+" o 'stop' para dejar de introducir datos:");
			
			while(n1 < 0 || n1 > 5 || n2 < 0 || n2 > 5) {
				x = sc.nextLine();
				if(x.equals("stop")) {
					return;
				}
				y = sc.nextLine();
				if(y.equals("stop")) {
					return;
				}
				n1= Integer.parseInt(x);
				n2 = Integer.parseInt(y);
				if(n1 < 0 || n1 > 5 || n2 < 0 || n2 > 5) {
					System.out.println("No la puedo ubicar en el tablero, Capitan "+nombre+". Acuérdese que el tablero es 6x6\nSe lo vuelvo a preguntar..." );
					break;
				}

				// Revisar si pisa de izq a der y si cabe

				if(longitud == 4) {
					int z = 0;
					for(int j = n2; j < 5; j++) {
						if(!tablero[n1][j].equals("_")) {
							System.out.println("No puedo ubicar el transatlantico ahí, Capitan "+nombre+". Se solapa con algo.\nSe lo vuelvo a preguntar...");
							z = 1;
							break;
						}
					}
					if(z == 1) {
						continue;
					}
					if(n2 > 2) {
						System.out.println("No puedo ubicar el transatlantico ahí, Capitan "+nombre+". Se sale del tablero.\nSe lo vuelvo a preguntar...");
						continue;
					}
				}
				
				// Revisar si pisa de arriba abajo y si cabe
				
				if(longitud == 3) {
					int z = 0;
					for(int j = n1; j < 3; j++) {
						if(!tablero[j][n2].equals("_")) {
							System.out.println("No puedo ubicar el carguero ahí, Capitan "+nombre+". Se solapa con algo.\nSe lo vuelvo a preguntar...");
							z = 1;
							break;
						}
					}
					if(z == 1) {
						continue;
					}
					if(n1 > 3) {
						System.out.println("No puedo ubicar el carguero ahí, Capitan "+nombre+". Se sale del tablero.\nSe lo vuelvo a preguntar...");
						continue;
					}
				}
				
				// Revisar que no solape
				
				if(longitud == 1) {
					if(!tablero[n1][n2].equals("_")) {
						System.out.println("No puedo ubicar el carguero ahí, Capitan "+nombre+". Se solapa con algo.\nSe lo vuelvo a preguntar...");
						break;
					}
				}
				i++;
				coloca(tablero, n1, n2, longitud, letra);
			}
		}
	}
	
	public static void muestra(String tablero[][]) {
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				System.out.print(tablero[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void coloca(String tablero[][], int x, int y, int l, String letra) {
		
		if(l == 1) {
			tablero[x][y] = letra;
		}else if(l == 4) {
			for(int i = y; i < y+4; i++) {
				tablero[x][i] = letra;
			}
		}else if(l == 3) {
			for(int i = x; i < x+3; i++) {
				tablero[i][y] = letra;
			}
		}
	}
	
	public static void juegacion(String tablero[][], int t, int c, int l) {
		
		System.out.println("Ahora es el momento de jugar, grumete!, has de hacer frente a "+t+" transatlánticos, "+c+" cargueros y "+l+" lanchas.\n Acuérdate que puedes hacer agua solo en 5 ocasiones!");
		int tam = 6;
		String[][] aux = new String [tam][tam];
		for (int i = 0; i < tam; i++) {
			for (int j = 0; j < tam; j++) {
				aux[i][j] = "_";
			}
		}
		
		int agua = 0;
		int tiros = 1;
		int aciertos = 0;
		
		while(agua < 5) {
			muestra(aux);
			System.out.println("¿Cuál será tu disparo número "+tiros+"?");
			tiros++;
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(!tablero[x][y].equals("_")){
				System.out.println("IMPACTO!, parece que le hemos dado a algo!");
				aux[x][y] = tablero[x][y];
				aciertos++;
			}else {
				agua++;
				System.out.println("AGUA!, y llevas "+agua);
			}
			if(aciertos == ((t*4)+(c*3)+l)) {
				System.out.println("¡Enhorabuena grumete! Has ganado la partida en solo"+tiros+ "tiradas.\nGAME OVER");
				break;
			}
		}
	}
}

