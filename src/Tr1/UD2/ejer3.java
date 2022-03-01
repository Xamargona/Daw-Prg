package Tr1.UD2;

import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		
	    Scanner input = new Scanner(System.in);
	    
	    System.out.println("Introduce el nombre del alumno.");
	    String nombre = input.nextLine();
		
		System.out.println("Introduce el NIF del alumno.");
		String nif = input.nextLine();
		
		System.out.println("Introduce la fecha de nacimiento del alumno DDMMYYYY");
		int fnac = input.nextInt();
		input.nextLine();
		
		System.out.println("Introduce la dirección de residencia del alumno");
		String dir = input.nextLine();
		
		System.out.println("Introduce el código postal");
		int cp = input.nextInt();
		input.nextLine();

		System.out.println("Introduce la población");
		String pbl = input.nextLine();
		
		System.out.println("Introduce un teléfono fijo");
		int tlf_fijo = input.nextInt();
		input.nextLine();

		System.out.println("Introduce un teléfono móvil");
		int tlf_movil = input.nextInt();
		input.nextLine();

		
		/*
		String nombre = "Juan"; 
		String dir = "plaça Germans Iborra";
		String pbl = "Torrent";
		String nif = "128754385A";
		long fnac = 27031998;
		int cp = 42427;
		long tlf_fijo = 648254978; 
		long tlf_movil = 668874198;	
		*/
		
		
		System.out.println("El alumno " + nombre +  " de NIF " + nif + ", nació el " + fnac + " y reside actualmente en " + dir + ", " + cp +", " + pbl + ". Sus teléfonos de contactos son:" + tlf_fijo + " y " + tlf_movil);
		}
}
