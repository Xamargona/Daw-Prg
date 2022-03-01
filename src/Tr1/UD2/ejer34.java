package Tr1.UD2;

import java.util.Scanner;

public class ejer34 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
	// INICIALIZAR VARIABLES 

		int cargo = 0;
		
		int dias = 0;
		
		int estado_civil = 0;
		
		double sueldo_base = 0;
		
		double extra = 0;
		
		double sueldo_bruto = 0;
		
		int irpf = 0;
		
		double retencion = 0;
		
		double sueldo_neto = 0;

	// SE PIDEN VALORES POR CONSOLA
		
		System.out.println("Introduzca el cargo del empleado: 1 - Prog. junior, 2 - Prog. Senior, 3 - Jefe de proyecto");
		
		cargo = input.nextInt();
		input.nextLine();
		
		while(cargo < 1 || cargo > 3) {
			
			System.out.println("Introduce un valor válido:");
			
			cargo = input.nextInt();
			input.nextLine();
		}
		
		System.out.println("¿Cuántos días ha estado de viaje visitando clientes?");
		
		dias = input.nextInt();
		input.nextLine();
		
		while(dias <= 0) {
			
			System.out.println("Introduce un valor válido:");
				
			dias = input.nextInt();
			input.nextLine();
		
		}
		
		System.out.println("Introduzca su estado civil: 1 - Soltero, 2 - Casado");
		
		estado_civil = input.nextInt();
		input.nextLine();
		
		while(estado_civil < 1 || estado_civil > 2) {
					
				System.out.println("Introduce un valor válido:");
					
				estado_civil = input.nextInt();
				input.nextLine();
		}
		
	// SE OBTIENEN LOS VALORES EN FUNCIÓN DE LOS DATOS INTRODUCIDOS
		
		if(cargo == 1) {
			
			sueldo_base  = 950;
			
		}else if(cargo == 2){
			
			sueldo_base  = 1200;
			
		}else if(cargo == 3) {
			
			sueldo_base  = 1600;
			
		}
		
		//------------------------------------
		
		extra = 30*dias;
		
		//------------------------------------

		sueldo_bruto = sueldo_base + extra;

		//------------------------------------

		if(estado_civil == 1){
			
			irpf = 25;
			
		}else if(estado_civil == 2) {
			
			irpf = 20;
			
		}
		
		//------------------------------------
		
		retencion = sueldo_bruto/100*irpf;
		
		int retencion1 = (int) retencion;
		
		//------------------------------------

		
		sueldo_neto = sueldo_bruto - retencion ;
		
	// MUESTRA DE DAOTS POR CONSOLA
		
		System.out.println("==============================");
		System.out.println(" Sueldo base            " + sueldo_base);
		System.out.println(" Dietas ( " + dias + " viajes)      " + extra);
		System.out.println("==============================");
		System.out.println(" Sueldo bruto           " + sueldo_bruto);
		System.out.println(" Retención IRPF (" + irpf + "%)   " + retencion1+".0");
		System.out.println("==============================");
		System.out.println(" Sueldo neto            " + sueldo_neto);
		System.out.println("==============================");

		
		
	}

}
