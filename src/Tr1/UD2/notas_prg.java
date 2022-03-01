package Tr1.UD2;

import java.util.Scanner;

public class notas_prg {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		// PEDIMOS NOTAS AL USUARIO
		
		System.out.println("Introduce la primera nota de programción:");
		
		float nota1 = input.nextFloat();
		input.nextLine();
		
			while(nota1 < 0 || nota1 > 10) {
				System.out.println("Introduce una nota válida");
				nota1 = input.nextFloat();
				input.nextLine();
			}
		
		System.out.println("Introduce la segunda nota de programción:");
		
		float nota2 = input.nextFloat();
		input.nextLine();
		
			while(nota2 < 0 || nota2 > 10) {
				System.out.println("Introduce una nota válida");
				nota2 = input.nextFloat();
				input.nextLine();
			}
		
		float media = (nota1 + nota2)/2;
		
		// MOSTRAR RESULTADOS POR CONSOLA
		
		if(media >= 5){
			
			System.out.println("Nota del primer control: " + nota1);
			System.out.println("Nota del segundo control: " + nota2);
			System.out.println("Tu nota de programación es: " + media);
			
		}else{
			
			System.out.println("Nota del primer control: " + nota1);
			System.out.println("Nota del segundo control: " + nota2);
			System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto):");
			String recu = input.nextLine();
			
			while(!recu.equals("apto") && !recu.equals("no apto")) {
				System.out.println("Introduce una respuesta válida: ");
				recu = input.nextLine();
			}
			
			if(recu.equals("apto")){
				System.out.println("Tu nota de programación es: 5");
			}
			if(recu.equals("no apto")){
				System.out.println("Tu nota de programación es: " + media);
			}
		}
		
	}

}
