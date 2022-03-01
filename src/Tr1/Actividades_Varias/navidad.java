package Tr1.Actividades_Varias;

import java.util.*;

public class navidad {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int cant_fechas = sc.nextInt();
		sc.nextLine();
		String fecha;
		String parte1;
		String parte2;
		int dia;
		int mes;
		for(int i = 0; i < cant_fechas; i++) {
			fecha = sc.nextLine();
			String[] partes = fecha.split(" ");
			parte1 = partes[0];
			parte2 = partes[1];
			dia = Integer.parseInt(parte1);
			mes = Integer.parseInt(parte2);
			if(mes == 12 && dia == 25) {
				System.out.println("SI");
			}else {
				System.out.println("NO");
			}
		}
	}
}
/*
import java.util.*;

public class Tr1.Actividad.navidad {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int cant_fechas = sc.nextInt();
		sc.nextLine();
		String fecha;
		String parte1;
		String parte2;
		for(int i = 0; i < cant_fechas; i++) {
			fecha = sc.nextLine();
			String[] partes = fecha.split(" ");
			parte1 = partes[0];
			parte2 = partes[1];
			if(parte1.equals("25") && parte2.equals("12")) {
				System.out.println("SI");
			}else {
				System.out.println("NO");
			}
		}
	}
}
*/