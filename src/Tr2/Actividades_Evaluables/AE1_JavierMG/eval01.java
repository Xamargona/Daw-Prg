package Tr2.Actividades_Evaluables.AE1_JavierMG;

import java.util.*;

public class eval01 {
	static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Bienvenido a 'Un partido con NoVac YoCovid'");
		String nombre = leer_nombre();
		int n_juegos = leer_numjuegos();
		String lugar = leer_lugar();
		
		int juego_actual = 0;
		int juegos_YoCovid = 0;
		int juegos_usuario = 0;
		
		while (juegos_YoCovid < n_juegos && juegos_usuario < n_juegos) {
			
			System.out.println("==============================================");
			System.out.println("RESULTADO: YoCovid "+juegos_YoCovid+" - "+nombre+" "+juegos_usuario);
			System.out.println("==============================================");
			
			if(proceso_juego(juego_actual, nombre)==true){
				juegos_YoCovid++;
			}else {
				juegos_usuario++;
			}
			juego_actual++;
		}
		
		System.out.println("==============================================");
		System.out.println("RESULTADO: YoCovid "+juegos_YoCovid+" - "+nombre+" "+juegos_usuario);
		System.out.println("==============================================");
		
		if(juegos_YoCovid > juegos_usuario) {
			System.out.println("Ganador del partido disputado en "+lugar+"...NoVac YoCovid!!");
		}else {
			System.out.println("Ganador del partido disputado en "+lugar+"..."+nombre+"!!");
		}
		
	}
	
	public static String leer_nombre() {
		System.out.println("Introduzca su nombre:");
		String nombre = sc.nextLine();
		while(nombre.isEmpty()) {
			System.out.println("ERROR! El nombre está vacio!");
			System.out.println("Introduzca su nombre:");
			nombre = sc.nextLine();
		}
		return nombre;
	}

	public static int leer_numjuegos(){
		System.out.println("¿Cuantos juegos se necesitan para ganar este partido?");
		int n_juegos = sc.nextInt();
		while(n_juegos < 1) {
			System.out.println("ERROR! Al menos deberian jugar 1 juego!");
			System.out.println("¿Cuantos juegos se necesitan para ganar este partido?");
			n_juegos = sc.nextInt();
		}
		sc.nextLine();
		return n_juegos;	
	}

	public static String leer_lugar() {
		System.out.println("¿Donde te gustaría jugar con NoVac?");
		String lugar = sc.nextLine();
		while(lugar.equals("Australia")) {
			System.out.println("ERROR! El Sr YoCovid prefiere no jugar en Australia!");
			System.out.println("¿Donde te gustaría jugar con NoVac?");
			lugar = sc.nextLine();
		}
		return lugar;
	}

	public static boolean proceso_juego(int aux_salida, String nombre) {
		
		Random r = new Random();
		
		int turno;
		int aciertos_YoCovid = 0;
		int aciertos_usuario = 0;
		
		String nombreYoCovid = "YoCovid";
		String muestra = "";
		
		while(aciertos_usuario < 4 || aciertos_YoCovid < 4) {
			
			if(aux_salida%2==0) {
				turno = 1; //turno de YoCovid 
			}else {
				turno = 2; //turno del usuario
			}
			
			int accion = -1;
			// accion 0 la devuelve
			// accion 1 se le cuela
			
			if(turno == 1) {
				System.out.println("Saca Yocovid");
				turno++;
				muestra = nombre;
			}else if(turno == 2) {
				System.out.println("Saca "+nombre);
				turno--;
				muestra = nombreYoCovid;
			}
			
			while (accion != 1) {
				accion = (int)(r.nextDouble()*2);
				
				if(accion == 0 && turno == 2) {
					System.out.println("devuelve la bola "+ muestra);
					muestra = nombreYoCovid;
					turno--;
				}else if(accion == 0 && turno == 1) {
					System.out.println("devuelve la bola "+ muestra);
					muestra = nombre;
					turno++;
				}else if(accion == 1 && turno == 2){
					muestra = nombreYoCovid;
					System.out.println("y punto de "+ muestra+"!");
					muestra = nombre;
					aciertos_YoCovid++;
					if(aciertos_YoCovid<4) {
						muestra_puntos(aciertos_YoCovid, aciertos_usuario, nombre);
					}
				}else if(accion == 1 && turno == 1){
					muestra = nombre;
					System.out.println("y punto de "+ muestra+"!");
					muestra = nombreYoCovid;
					aciertos_usuario++;
					if(aciertos_usuario<4) {
						muestra_puntos(aciertos_YoCovid, aciertos_usuario, nombre);
					}
				}
			}
			
			if(aciertos_usuario==4) {
				System.out.println("YocOvid: "+(aciertos_YoCovid*15)+" - "+nombre+": GANA EL JUEGO");
				return false;
			}
			if(aciertos_YoCovid==4) {
				System.out.println("YocOvid: GANA EL JUEGO - "+nombre+": "+(aciertos_usuario*15));
				return true;
			}
		}
		return true;
	}
	
	public static void muestra_puntos(int p_YoCovid, int p_usuario, String nombre) {
		System.out.println("YoCovid: "+(p_YoCovid*15)+" - "+nombre+": "+(p_usuario*15));
	}
}
