package Tr1.UD2;

import java.util.Scanner;

public class ejer18 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	
		System.out.println("Introduce los MB de los que obtener su equivalencia");
		
		int mb = input.nextInt();
		input.nextLine();
		
		int kb = mb*1024;
		int b = kb*1024;
		int gb = mb/1024;
		int tb = gb/1024;
		
		System.out.println("MB" + "\t\t\t" + "B" + "\t\t\t\t" + "KB" + "\t\t\t\t" + "GB" + "\t\t\t\t" + "TB" );
		System.out.println(mb + "\t\t\t" + b + "\t\t\t" + kb + "\t\t\t" + gb + "\t\t\t\t" +tb );
	}

}
									