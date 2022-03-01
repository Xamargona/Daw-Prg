package Tr1.UD2;

import java.util.Scanner;

public class ejer33 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int contador = 0;
		
		for(int i = 0; i<12; i++) {
		
			switch (i){
			
				case 0: System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
			
				boolean respuesta = input.nextBoolean();
				input.nextLine();
				
					if(respuesta == true) {
						contador = contador + 3;
					}
				break;	
				
				case 1: System.out.println("2. Ha aumentado sus gastos de vestuario.");
				
				respuesta = input.nextBoolean();
				input.nextLine();
				
					if(respuesta == true) {
						contador = contador + 3;
					}
				break;
				
				case 2: System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti.");
				
				respuesta = input.nextBoolean();
				input.nextLine();
				
					if(respuesta == true) {
						contador = contador + 3;
					}
				break;
				
				case 3: System.out.println("4. Ahora se asea con más frecuencia.");
				
				respuesta = input.nextBoolean();
				input.nextLine();
				
					if(respuesta == true) {
						contador = contador + 3;
					}
				break;
				
				case 4: System.out.println("5. No te deja que mires la agenda de su teléfono móvil.");
				
				respuesta = input.nextBoolean();
				input.nextLine();
				
					if(respuesta == true) {
						contador = contador + 3;
					}
				break;
				
				case 5: System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante.");
				
				respuesta = input.nextBoolean();
				input.nextLine();
				
					if(respuesta == true) {
						contador = contador + 3;
					}
				break;
				
				case 6: System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.");
				
				respuesta = input.nextBoolean();
				input.nextLine();
				
					if(respuesta == true) {
						contador = contador + 3;
					}
				break;
				
				case 7: System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.");
				
				respuesta = input.nextBoolean();
				input.nextLine();
				
					if(respuesta == true) {
						contador = contador + 3;
					}
				break;
				
				case 8: System.out.println("9. Has notado que últimamente se perfuma más.");
				
				respuesta = input.nextBoolean();
				input.nextLine();
				
					if(respuesta == true) {
						contador = contador + 3;
					}
				break;
				
				case 9: System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.");
				
				respuesta = input.nextBoolean();
				input.nextLine();
				
					if(respuesta == true) {
						contador = contador + 3;
					}
				break;
			}
		
		}
	
		if(contador >= 0 && contador <= 10){
			
			System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
			
		}else if(contador > 10 && contador <= 22){
			
			System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
			
		}else if(contador > 22 && contador <= 30){
			
			System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
		}
		
	}

}
