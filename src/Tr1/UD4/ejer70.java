package Tr1.UD4;

import java.util.*;

public class ejer70 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int[][] tablero = new int [4][4];
        
        for(int i = 0; i < 4; i++) {
        	for(int j = 0; j < 4; j++) {
        		tablero[i][j] = 0;
        	}
        }
        
        tablero[0][0] = 3;
        tablero[0][2] = 1;
        tablero[1][0] = 1;
        tablero[2][2] = 1;
        tablero[2][3] = 1;
        tablero[3][0] = 1;
        
        boolean verificador = true;
        char movimiento;
        char arriba = 'w';
        char abajo = 's';
        char izquierda = 'a';
        char derecha = 'd';
        int fila = 0;
        int columna = 0;
        System.out.println("Bienvenido al laberinto de Paco!");
        System.out.println("Pulse W para arriba, S para abajo, A para la izquierda y D para la derecha");
        
        while(verificador) {
        	
            for(int i = 0; i < 4; i++) {
            	for(int j = 0; j < 4; j++) {
            		if(tablero[i][j] == 3){
            			System.out.println("Estas en la casilla "+i+", "+j+" . ¿Cuál es tu próximo movimiento?");
            		fila = i;
            		columna = j;
            		}
            	}
            } 
            movimiento = sc.next().charAt(0);
            movimiento = Character.toLowerCase(movimiento);
            
            if(movimiento == arriba) {
            	if(fila-1 < 0){
            		System.out.println("ERROR! Nos salimos del tablero!");
            		continue;
            	}
            	if(tablero[fila-1][columna] == 1) {
            		System.out.println("ERROR! En esa dirección hay una pared");
            		continue;
            	}
            	tablero[fila][columna] = 0;  
            	tablero[fila-1][columna] = 3;    
            	System.out.println("Has pulsado hacia arriba");
            }
            
            if(movimiento == abajo) {
            	if(fila+1 > 3){
            		System.out.println("ERROR! Nos salimos del tablero!");
            		continue;
            	}
            	if(tablero[fila+1][columna] == 1) {
            		System.out.println("ERROR! En esa dirección hay una pared");
            		continue;
            	}
            	tablero[fila][columna] = 0;  
            	tablero[fila+1][columna] = 3;    
            	System.out.println("Has pulsado hacia abajo");
            }
            
            if(movimiento == izquierda) {
            	if(columna-1 < 0){
            		System.out.println("ERROR! Nos salimos del tablero!");
            		continue;
            	}
            	if(tablero[fila][columna-1] == 1) {
            		System.out.println("ERROR! En esa dirección hay una pared");
            		continue;
            	}
            	tablero[fila][columna] = 0;  
            	tablero[fila][columna-1] = 3;    
            	System.out.println("Has pulsado hacia la izquierda");
            }
            
            if(movimiento == derecha) {
            	if(columna+1 > 3){
            		System.out.println("ERROR! Nos salimos del tablero!");
            		continue;
            	}
            	if(tablero[fila][columna+1] == 1) {
            		System.out.println("ERROR! En esa dirección hay una pared");
            		continue;
            	}
            	tablero[fila][columna] = 0;  
            	tablero[fila][columna+1] = 3;    
            	System.out.println("Has pulsado hacia la derecha");
            }
            
            if(tablero[3][3] == 3) {
            	System.out.println("Enhorabuena!, has llegado a la casilla 3,3 y por tanto has llegado al final del laberinto!");
            	verificador = false;
            }
            
        }
	}
}
