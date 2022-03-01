package Tr1.UD2;

import java.util.Scanner;

public class ejer21 {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	// INTRODUCCIÓN DE DATOS Y CÁLCULO DEL IMPORTE
	
	// ========================================================================================
	
	System.out.println("Introduzca el nombre del cliente:");
	String nombre = input.nextLine();

	// ---------------------------------------------------------------------------------------
	
	System.out.println("Introduzca el NIF:");
	int nif = input.nextInt();
	input.nextLine();
	
	// ---------------------------------------------------------------------------------------

	
	System.out.println("Introduzca el domicilio:");
	String domicilio = input.nextLine();

	// ---------------------------------------------------------------------------------------

	
	System.out.println("Introduzca los datos correspondientes al primer concepto:");
	
		System.out.println("Cantidad:");
		int cantidad1 = input.nextInt();
		input.nextLine();
		
		System.out.println("Concepto:");
		String concepto1 = input.nextLine();
		
		System.out.println("Precio:");
		int precio1 = input.nextInt();
		input.nextLine();
	
	// ---------------------------------------------------------------------------------------

	System.out.println("Introduzca los datos correspondientes al segundo concepto:");
	
		System.out.println("Cantidad:");
		int cantidad2 = input.nextInt();
		input.nextLine();
		
		System.out.println("Concepto:");
		String concepto2 = input.nextLine();
		
		System.out.println("Precio:");
		int precio2 = input.nextInt();
		input.nextLine();

	// ---------------------------------------------------------------------------------------

	System.out.println("Introduzca los datos correspondientes al tercer concepto:");
	
		System.out.println("Cantidad:");
		int cantidad3 = input.nextInt();
		input.nextLine();
		
		System.out.println("Concepto:");
		String concepto3 = input.nextLine();
		
		System.out.println("Precio:");
		int precio3 = input.nextInt();
		input.nextLine();
	
		// ---------------------------------------------------------------------------------------
	
	System.out.println("Introduzca los datos correspondientes al cuarto concepto:");

		System.out.println("Cantidad:");
		int cantidad4 = input.nextInt();
		input.nextLine();
		
		System.out.println("Concepto:");
		String concepto4 = input.nextLine();
		
		System.out.println("Precio:");
		int precio4 = input.nextInt();
		input.nextLine();

		// ---------------------------------------------------------------------------------------
		
	System.out.println("Introduzca los datos correspondientes al quinto concepto:");

		System.out.println("Cantidad:");
		int cantidad5 = input.nextInt();
		input.nextLine();
		
		System.out.println("Concepto:");
		String concepto5 = input.nextLine();
		
		System.out.println("Precio:");
		int precio5 = input.nextInt();
		input.nextLine();

		// ---------------------------------------------------------------------------------------
	
	System.out.println("Introduce el porcentaje de decuento:");
		
		int descuento = input.nextInt();
		input.nextLine();
	
		// ---------------------------------------------------------------------------------------
		
		double importe1 = precio1-(precio1*descuento/100);
		double importe2 = precio1-(precio2*descuento/100);
		double importe3 = precio1-(precio3*descuento/100);
		double importe4 = precio1-(precio4*descuento/100);
		double importe5 = precio1-(precio5*descuento/100);
		
		int total_bruto = precio1+precio2+precio3+precio4+precio5;
		double importe_total = importe1+importe2+importe3+importe4+importe5;
		// ========================================================================================

		// MUESTRA POR CONSOLA
		
		// ========================================================================================

		System.out.println("==================================================================================");
		System.out.printf("%-15s" + "%-40s" +"%-5s" + "%-20d" + "%s"  + "%n", "| CLIENTE:", nombre, "NIF: ", nif, "|");
		System.out.printf("%-15s" + "%-65s" + "%s" + "%n","| DOMICILIO: ",domicilio, "|");
		System.out.println("==================================================================================");
		System.out.printf("%-14s" + "%-43s" + "%-12s" + "%-13s" + "%n","|  CANTIDAD  |" , "           CONCEPTO - REFERENCIA           " , "|  PRECIO  |" , "  IMPORTE  |" );   	
		System.out.println("==================================================================================");
		System.out.printf("%s" + "   %-9d" + "%s" + "     %-38s" + "%s" + " %-9d" + "%s"+ " %-11.2f" +"%s" + "%n", "|", cantidad1 , "|", concepto1,"|", precio1 ,"|", importe1,"|");
		System.out.printf("%s" + "   %-9d" + "%s" + "     %-38s" + "%s" + " %-9d" + "%s"+ " %-11.2f" +"%s" + "%n", "|", cantidad2 , "|", concepto2,"|", precio2 ,"|", importe2,"|");
		System.out.printf("%s" + "   %-9d" + "%s" + "     %-38s" + "%s" + " %-9d" + "%s"+ " %-11.2f" +"%s" + "%n", "|", cantidad3 , "|", concepto3,"|", precio3 ,"|", importe3,"|");
		System.out.printf("%s" + "   %-9d" + "%s" + "     %-38s" + "%s" + " %-9d" + "%s"+ " %-11.2f" +"%s" + "%n", "|", cantidad4 , "|", concepto4,"|", precio4 ,"|", importe4,"|");
		System.out.printf("%s" + "   %-9d" + "%s" + "     %-38s" + "%s" + " %-9d" + "%s"+ " %-11.2f" +"%s" + "%n", "|", cantidad5 , "|", concepto5,"|", precio5 ,"|", importe5,"|");
		System.out.println("==================================================================================");
		System.out.printf("%-39s" + "%s" + "%-15s" + "%s" + "%-13s" + "%s" + "%-11s" + "%s" + "%n", " " , "|" , "  TOTAL BRUTO  ", "|", "  DESCUENTO  ", "|", "   TOTAL   ", "|");
		System.out.printf("%-39s" + "%s" + "%n", " ","===========================================" );
		System.out.printf("%-39s" + "%s" + "     %-10d" + "%s" + "%7d" +"%s     " + "%s" + "  %-9f" + "%s" + "%n", " ","|", total_bruto, "|", descuento, "%", "|", importe_total,"|"  );
		System.out.printf("%-39s" + "%s" + "%n", " ","===========================================" );
	}
}
