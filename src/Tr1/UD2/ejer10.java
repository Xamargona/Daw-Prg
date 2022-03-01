package Tr1.UD2;

import java.util.Scanner;

public class ejer10 {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.println("Introduce el número de niños matriculados");
	
	int ninos = input.nextInt();
	input.nextLine();
	
	System.out.println("Introduce el número de niñas matriculados");
	
	int ninas = input.nextInt();
	input.nextLine();
	
	int total = ninos + ninas;
	
	float porcentaje_ninos = (float) (ninos*100)/total;
	float porcentaje_ninas = (float) (ninas*100)/total;
	
	System.out.println("El porcentaje de niños es del " +porcentaje_ninos+"% y el de niñas el " + porcentaje_ninas + "%");
	}

}
