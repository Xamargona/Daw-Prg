package Tr1.UD4;

import java.util.Scanner;

public class ejer69 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String email;
		
		System.out.println("Introduzca su e-mail siguiendo el formato < identificador1 + @ + identificador2 + .com | .es | .org | .gov   >:");
		email = sc.nextLine();
		
		if(email.indexOf("@") == -1) {
			System.out.println("ERROR1: No existe una @");

		}else if(email.indexOf("@") == 0) {
			System.out.println("ERROR2: La direccion empieza por una @");

		}else if(email.indexOf("@") < 4){
			System.out.println("ERROR3: El identificador1 no llega a 4 caracteres");

		}else if(email.indexOf(".") == -1){	
			System.out.println("ERROR4: Después de la @ no hay un punto");

		}else if((email.indexOf(".") - email.indexOf("@")) <= 3){	
			System.out.println("ERROR5: El identificador2 no llega a 3 caracteres");

		}else if(email.indexOf(".com") == -1 && email.indexOf(".es") == -1 && email.indexOf(".org") == -1 && email.indexOf(".gov") == -1) {
			System.out.println("ERROR6: Dominio distinto a .com, .es, .org y .gov");
		}
		
		
	/* 	EN BUCLE
	
	
		Boolean bucle = true;
		do {	
			if(email.indexOf("@") == -1) {
				System.out.println("ERROR1: No existe una @");
				System.out.println("Introduzca su e-mail:");
				email = sc.nextLine();
				System.out.println();
				continue;
				
			}else if(email.indexOf("@") == 0) {
				
				System.out.println("ERROR2: La direccion empieza por una @");
				System.out.println("Introduzca su e-mail:");
				System.out.println();
				email = sc.nextLine();
				continue;

			}else if(email.indexOf("@") < 4){
				
				System.out.println("ERROR3: El identificador1 no llega a 4 caracteres");
				System.out.println("Introduzca su e-mail:");
				System.out.println();
				email = sc.nextLine();
				continue;

			}else if(email.indexOf(".") == -1){	
				System.out.println("ERROR4: Después de la @ no hay un punto");
				System.out.println("Introduzca su e-mail:");
				System.out.println();
				email = sc.nextLine();
				continue;

			}else if((email.indexOf(".") - email.indexOf("@")) <= 3){	
				System.out.println("ERROR5: El identificador2 no llega a 3 caracteres");
				System.out.println("Introduzca su e-mail:");
				System.out.println();
				email = sc.nextLine();
				continue;

			}else if(email.indexOf(".com") == -1 && email.indexOf(".es") == -1 && email.indexOf(".org") == -1 && email.indexOf(".gov") == -1) {
				System.out.println("ERROR6: Dominio distinto a .com, .es, .org y .gov");
				System.out.println("Introduzca su e-mail:");
				System.out.println();
				email = sc.nextLine();
				continue;
			}
			
			bucle = false;
		}
		while (bucle == true);
		
		*/
		
		
		/*
		Boolean bucle = true;

		 do{
		 		System.out.println("Introduzca su e-mail:");
				System.out.println();
				email = sc.nextLine();
		 
		if(email.indexOf("@") == -1) {
			System.out.println("ERROR1: No existe una @");
				continue;

		}else if(email.indexOf("@") == 0) {
			System.out.println("ERROR2: La direccion empieza por una @");
				continue;

		}else if(email.indexOf("@") < 4){
			System.out.println("ERROR3: El identificador1 no llega a 4 caracteres");
				continue;

		}else if(email.indexOf(".") == -1){	
			System.out.println("ERROR4: Después de la @ no hay un punto");
				continue;

		}else if((email.indexOf(".") - email.indexOf("@")) <= 3){	
			System.out.println("ERROR5: El identificador2 no llega a 3 caracteres");
				continue;

		}else if(email.indexOf(".com") == -1 && email.indexOf(".es") == -1 && email.indexOf(".org") == -1 && email.indexOf(".gov") == -1) {
			System.out.println("ERROR6: Dominio distinto a .com, .es, .org y .gov");
				continue;
		}
		bucle == false
		}
		while(bucle==true);
		  */
		
		System.out.println("Enhorabuena! Mail correcto!");
		
		
		
	}
}
