package Tr1.UD2;

import java.util.Scanner;

public class ejer22 {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.println("Introduzca el número de estudiante:");
	
	int id_estudiante = input.nextInt();
	input.nextLine();
	
	System.out.println("Introduzca el nombre del alumno:");
	
	String nombre_estudiante = input.nextLine();
	
	System.out.println("Introduzca nota1:");
	
	double nota1 = input.nextDouble();
	input.nextLine();
	
	System.out.println("Introduzca nota2:");
	
	double nota2 = input.nextDouble();
	input.nextLine();
	
	System.out.println("Introduzca nota3:");
	
	double nota3 = input.nextDouble();
	input.nextLine();
	
	double nota_media = (nota1+nota2+nota3)/3;
	
	System.out.println("Alumno: " + id_estudiante + "-" + nombre_estudiante + "\t\t" + "ex.1" + "\t\t" + "ex.2" +"\t\t" + "ex.3" + "\t\t" + "media");
	System.out.println("Notas 1era evaluacion:" + "\t\t\t" + nota1 + "\t\t" + nota2 + "\t\t" + nota3 + "\t\t" + String.format("%.2f", nota_media));
	}
}
