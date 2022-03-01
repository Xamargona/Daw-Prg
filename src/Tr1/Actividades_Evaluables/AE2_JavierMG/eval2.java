package Tr1.Actividades_Evaluables.AE2_JavierMG;

import java.util.*;

public class eval2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Random r = new Random();

		// Paso 1 : Introducción de asignaturas

		System.out.println("PASO 1: Introduzca numero de asignaturas");
		
		int can_asignaturas = sc.nextInt();
		sc.nextLine();
		
		String[] asignaturas = new String [can_asignaturas];
		
		String asignatura;
		
		for (int i = 0; i < can_asignaturas; i++) {
			
			System.out.println("Introduzca nombre de la asignatura " + (i+1) + "/" + can_asignaturas + " :");
			
			asignatura = sc.nextLine();
			
			asignaturas[i] = asignatura;
			
			for (int j = 0; j < can_asignaturas; j++ ) {
				
				while(asignaturas[i].equals(asignaturas[j]) && j != i) {
					
					System.out.println(asignatura + " ya estaba dada de alta!");
					
					System.out.println("Introduzca nombre de la asignatura " + (i+1) + "/" + can_asignaturas + " :");
					
					asignatura = sc.nextLine();
					
					asignaturas[i] = asignatura;
				}
			}
		}
		
		System.out.println("Se han dado de alta las asignaturas siguientes:");
		
		for(int i = 0; i < can_asignaturas; i ++) {
			System.out.print(asignaturas[i] + " ");
		}
		
		System.out.println();

		// Paso 2 : Introduzca numero de alumnos
		
		System.out.println("PASO 2: Introduzca numero de alumnos");
		
		int can_alumnos = sc.nextInt();
		sc.nextLine();
		
		String[] alumnos = new String [can_alumnos];
		
		String[] emails = new String [can_alumnos];
		
		String alumno;
		
		String email;
		
		int[] nia = new int [can_alumnos];
				
		for(int i = 0; i < can_alumnos; i ++) {
			
			System.out.println("Introduzca los datos del alumno " + (i+1) + "/" + can_alumnos + " :");
			
			System.out.println("Introduzca el nombre :");
			
			alumno = sc.nextLine();
			
			alumnos[i] = alumno;
			
			System.out.println("Introduzca el email:");
			email = sc.nextLine();
			
			do {	
				if(email.indexOf("@") == -1) {
					
					System.out.println("ERROR: El mail no contiene el caracter @");
					System.out.println("Introduzca el email:");
					email = sc.nextLine();
					
				}else if(email.indexOf("@") == 0) {
					
					System.out.println("ERROR: El mail no puede comenzar por el caracter @");
					System.out.println("Introduzca el email:");
					email = sc.nextLine();
					
				}else if(email.indexOf("@") < 4){
					
					System.out.println("ERROR: La parte anterior al @ ha de tener, al menos, 4 caracteres");
					System.out.println("Introduzca el email:");
					email = sc.nextLine();
					
				}else if(email.indexOf(".com") == -1 && email.indexOf(".es") == -1) {
					System.out.println("ERROR: El correo no tiene dominio .com ni .es");
					System.out.println("Introduzca el email:");
					email = sc.nextLine();
				}
			}
			while (email.indexOf("@") == 0 || email.indexOf("@") < 4 || email.indexOf("@") == -1 || (email.indexOf(".com") == -1 && email.indexOf(".es") == -1));
			
			emails[i] = email;
			
			nia[i] = (int)(r.nextDouble()*400+100);
		}
		
        Arrays.sort(nia);
		
		System.out.println("Se han dado de alta los alumnos siguientes:");
		
		for(int i = 0; i < can_alumnos; i++){
			System.out.println(nia[i] + ": " + alumnos[i] + ", email: " + emails[i]);
		}
		
		// Paso 3: Matricular alumnos
		
		System.out.println("PASO 3: Vamos a matricular a los alumnos");

		String[] matricula = new String [can_alumnos];
		
		for (int i = 0; i<can_alumnos;i++) {
			matricula[i] = "";
		}
		
		alumno = "";
		asignatura = "";
		
		System.out.println("Introduzca nombre del alumno o salir");
		alumno = sc.nextLine();
		int variante1 = 0;	
		int variante2 = 0;
		
		do{
			if(alumno.equals("salir")) {
				break;
			}
			
			for(int i = 0; i < can_alumnos; i++) {
				if(alumno.equals(alumnos[i])) {
					variante2 = 1;
					System.out.println("Introduzca el nombre de la asignatura");
					asignatura = sc.nextLine();
					for (int j = 0; j<can_asignaturas;j++){
						if(asignatura.equals(asignaturas[j])) {
							matricula[i] = matricula[i] + " " + asignaturas[j];
							variante1 = 1;
							System.out.println("Se ha matriculado a " + alumno + " en " + asignatura);
						}
					}
					while(variante1 == 0){
						System.out.println("La asignatura " + asignatura + " no existe!");
						System.out.println("Introduzca el nombre de la asignatura");
						asignatura = sc.nextLine();
						for (int k = 0; k<can_asignaturas;k++) {
							if(asignatura.equals(asignaturas[k])) {
								matricula[i] = matricula[i] + asignaturas[k];
								variante1 = 1;
								System.out.println("Se ha matriculado a " + alumno + " en " + asignatura);
							}
						}
					}
				}
			}
			variante1 = 0;
			if (variante2 ==0) {
			System.out.println("El alumno " + alumno + " no existe");
			}
			variante2 = 0;
			System.out.println("Introduzca nombre del alumno o salir");
			alumno = sc.nextLine();
		}
		while(!alumno.equals("salir")); 
		
		for(int i = 0; i < can_alumnos; i++) {
			System.out.println(nia[i] + ": " + alumnos[i] + ", email: " + emails[i] + " " + matricula[i]);
		}
	}
}
