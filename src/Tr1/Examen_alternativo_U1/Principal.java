package Tr1.Examen_alternativo_U1;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
       
        System.out.println("Introduzca el numero de jugadores:");
        int can_jugadores = sc.nextInt();
		int[] jugadores = new int [can_jugadores];
		for(int i = 0; i < can_jugadores; i++) {
			jugadores[i] = i+1;
		}

        System.out.println("Introduzca la longitud del puente:");
        int columnas = sc.nextInt();
        
        int filas = 2;
		String[][] puente = new String [filas][columnas];
		int random;
		int contador = 0;
		boolean verificador = true;
		for(int j = 0; j < columnas; j++) {
			random = (int)(r.nextDouble()*2+1);
			if(random == 1) {
				puente[0][j] = "N";
				puente[1][j] = "T";
			}
			if(random == 2) {
				puente[0][j] = "T";
				puente[1][j] = "N";
			}
		}
		System.out.println("Este es el puente que se ha construido:");
		
		while(verificador==true) {
				
			for(int i = 0; i < filas; i++) {
				for(int j = 0; j < columnas; j++) {
					System.out.print(puente[i][j] + " ");
				}
				System.out.println();
			}
			
			System.out.print("Jugadores: ");
			if(contador == can_jugadores) {
				System.out.print("NINGUNO");
			}
			for(int i = contador; i < can_jugadores; i++) {
				System.out.print(jugadores[i] + " ");
			}	
			if(contador==0){
				System.out.print("\nComienza el juego...");
			}
			System.out.println();
			System.out.println();

			if(contador==can_jugadores) {
				System.out.println("Ningun jugador ha llegado al otro lado\nGAME OVER");
				verificador = false;
				break;
			}
			System.out.println("Lo va a cruzar el jugador..." + jugadores[contador]);
			
			for(int i = 0; i < columnas; i++) {
				random = (int)(r.nextDouble()*2);
				System.out.println("El jugador "+ jugadores[contador]+" avanza a la casilla: ["+random+","+i+"]" );
				
				if(!puente[random][i].equals("N")&&i==columnas-1) {
					System.out.print("El jugador "+(contador+1)+" ha llegado al otro lado!");
					verificador = false;
					break;
				}
				if(!puente[random][i].equals("N")) {
					continue;
				}
				if(puente[random][i].equals("N")) {
					System.out.println("Ups, parece que ese cristal no era templado...\nJUGADOR "+jugadores[contador]+" ELIMINADO");
					puente[random][i] = "-";
					contador++;
				}
				break;
			}
			
		}
		
		
	}
}
