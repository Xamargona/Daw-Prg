package Tr2.UD5_Programacion_modular;

import java.util.*;

public class hundirlaflota {
	static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
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
