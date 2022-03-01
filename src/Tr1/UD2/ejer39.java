package Tr1.UD2;

import java.util.Scanner;

public class ejer39 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		// PEDIR VARIABLES POR CONSOLA
		
		System.out.println("CÁLCULO DE SALARIO SEMANAL");
		System.out.println();
		
		System.out.println("¿Cuantás horas són las trabajadas a la semana?");
		
		int horas_totales = input.nextInt();
		input.nextLine();
		
		System.out.println("¿Cuánto es el pago por hora?");

		float pago_hora = input.nextFloat();
		input.nextLine();
		
		double salario = 0;
		
		int horas_extra = 0;
		
		if(horas_totales <= 40) {
			
			salario = (horas_totales*pago_hora);
			
			System.out.println("El sueldo semanal es: " + salario + "€");
			
		}else{
			
			horas_extra = horas_totales - 40;
			salario = (40*pago_hora + horas_extra*pago_hora*1.5);
			System.out.println("El sueldo semanal es: " + salario + "€");
		}
		
	}
}
