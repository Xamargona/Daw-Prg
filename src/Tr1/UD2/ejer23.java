package Tr1.UD2;

import java.util.Scanner;

public class ejer23 {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.println("Introduzca decha de nacimiento en formato AAAA MM DD:");
	
	int ano = input.nextInt();
	int mes = input.nextInt();
	int dia = input.nextInt();
	
	System.out.println("Introduzca NIF:");
	
	int nif = input.nextInt();
	input.nextLine();

	System.out.println("Introduzca nombre");
	
	String nombre = input.nextLine();
	
	System.out.println("Introduzca dirección:");
	
	String dir = input.nextLine();
	
	System.out.println("Introduzca salario:");
	
	double salario = input.nextDouble();
	
	System.out.println("Introduzca retención:");
	
	int ret = input.nextInt();
	input.nextLine();
	
	System.out.println();
	System.out.println("INFORME DEL TRABAJADOR");
	System.out.println("--------------------------------------------------------");
	System.out.println("Nombre..........................:  " + nombre);
	System.out.println("Dirección.......................:  " + dir);
	System.out.println();
	System.out.println("NIF.............................:  " + nif);
	System.out.println("Fecha de nacimiento.............:  " + dia + " del mes " + mes + " del año ");
	System.out.println();
	System.out.println("Salario bruto...................:  " + salario);
	System.out.println("Retencion.......................:  " + ret + "%");
	System.out.println("Salario neto....................:  " + String.format("%.2f",(salario - (salario/100*16)) ));

	System.out.println("--------------------------------------------------------");

			
	}

}
