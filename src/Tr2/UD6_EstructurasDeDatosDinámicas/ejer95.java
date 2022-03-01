package Tr2.UD6_EstructurasDeDatosDinámicas;

import java.util.*;
public class ejer95 {
	static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		String[] nombre_molon1 = {"Big","Small","The","Perfect","Extraordinary"};
		String[] nombre_molon2 = {"Fighter","Neo","Paco"};
		
		String nombre_yt = selecionar_nombre(nombre_molon1, nombre_molon2);
		ArrayList<Integer> followers = new ArrayList();
		anyadir_followers(followers);
		muestra_followes(nombre_yt, followers);
	}

	public static String selecionar_nombre(String[] nombre_molon1, String[] nombre_molon2) {
		Random r = new Random();
		String nombre_final = "";
		String respuesta;
		boolean confirmacion = false;
		while (!confirmacion) {
			int select1 = (int)(r.nextDouble() * 4);
			int select2 = (int)(r.nextDouble() * 2);
			nombre_final = nombre_molon1[select1]+" "+nombre_molon2[select2];
			System.out.println("Vamos a generar de forma aleatoria tu nombre de youtuber:");
			System.out.println("Por ejemplo..."+nombre_final);
			System.out.println("¿Te gusta (S/N)?");
			respuesta = sc.nextLine();
			if (respuesta.equalsIgnoreCase("S")) {
				confirmacion = true;
			}else {
				confirmacion = false;
			}
		}
		return nombre_final;
	}
	public static void anyadir_followers(ArrayList<Integer> followers) {
		int lectura = 0;
		
		while (lectura != -1 || followers.size()<2) {
			System.out.println("Introduzca lectura "+ (1+followers.size()) +" :");
			lectura = sc.nextInt();
			//comprobante de salida antes de tiempo
			if (lectura == -1 && followers.size() < 2) {
				System.out.println("necesitamos, al menos, 2 lecturas de followers!");
				continue;
			}else if (lectura == -1) {
				continue;
			}
			//anti lecturas negativas
			else if (lectura < -1) {
				System.out.println("Dato erróneo. Recuerda, las lecturas son solo ascendentes y sin valores negativos!");
				continue;
			}
			//verificador de lectura correcta
			else if(followers.isEmpty() == false){
				if (followers.get(followers.size()-1) >= lectura) {
					System.out.println("Dato erróneo. Recuerda, las lecturas son solo ascendentes!");
					continue;
				}else {
					followers.add(lectura);
					System.out.println("Lectura "+followers.size()+" correcta!");
					continue;
				}
			}else {
				followers.add(lectura);
				System.out.println("Lectura "+followers.size()+" correcta!");
			}
		}
	}
	
	public static void muestra_followes(String nombre, ArrayList<Integer>followers) {
		System.out.println("Se ha dado de alta al youtuber "+nombre+" con la evolución siguiente:");
		Iterator iter = followers.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next()+" ");
			
		}
	}
	
	
}