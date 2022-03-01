package Tr1.EXAMEN_JavierMG;

import java.util.*;

public class examen2 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        
        int tam;
        int n_eliminados;
        int eliminados;
        System.out.println("Introduzca un numero de jugadores para el juego:");
        tam = sc.nextInt();
        while(tam < 20) {
        	System.out.println("Numero de jugadores insuficiente (minimo 20)");
            System.out.println("Introduzca un numero de jugadores para el juego:");
            tam = sc.nextInt();
        }
		int[] jugadores = new int[tam];
		for(int i = 0; i < tam; i++) {
			jugadores[i] = i+1;
		}
		int restantes = tam;

		for(int i = 0; i < 5 ; i++) {
			System.out.println("-------------------");
			n_eliminados = (int)(r.nextDouble()*restantes+1);
			
			System.out.print("Ronda numero: " + (i+1) + "\nLuz verde\nya puedes correr..\ny parar!\nDe "+restantes+" vamos a eliminar a " + n_eliminados + " concursantes.\n");
			for(int j = 0; j < n_eliminados;) {
				eliminados = (int)(r.nextDouble()*jugadores.length);
				if(jugadores[eliminados] == 0) {
					continue;
				}
				System.out.println("Jugador " + jugadores[eliminados] + ": ELIMINADO");
				jugadores[eliminados] = 0;
				restantes = restantes-1;
				j++;
			}
			if (restantes > 0) {
				System.out.print("Quedan vivos " + restantes + " concursantes: ");
				for(int j = 0; j < jugadores.length; j++) {
					if(jugadores[j] != 0) {
						System.out.print(jugadores[j] + " ");
					}
				}
				System.out.println();
				if(i==4) {
					System.out.println();
					System.out.println("GAME OVER");
				}
			}else {
				System.out.println("El juego ya ha finalizado. No hay más concursantes a eliminar.");
				System.out.println();
				System.out.println("GAME OVER");
				break;
			}
		}
	}
}
