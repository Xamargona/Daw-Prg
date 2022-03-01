package Tr2.UD5_Programacion_modular;

import java.util.*;

public class ejer72 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1;
		int n2;
		while (true) {
			System.out.println("1.- Sumar");
			System.out.println("2.- Restar");
			System.out.println("3.- Multiplicar");
			System.out.println("4.- Dividir");
			System.out.println("5.- Potencia");
			System.out.println("6.- Raíz cuadrada");
			System.out.println("9.- Salir");

			int opcion = sc.nextInt();
			switch(opcion) {
			case 1: System.out.println("Introduce 2 números a sumar");
			 n1 = sc.nextInt();
			 n2 = sc.nextInt();
			System.out.println(sumar(n1,n2));
				break;
			case 2: System.out.println("Introduce 2 números a restar");
			 n1 = sc.nextInt();
			 n2 = sc.nextInt();
			System.out.println(restar(n1,n2));
				break;
			case 3: System.out.println("Introduce 2 números a multiplicar");
			 n1 = sc.nextInt();
			 n2 = sc.nextInt();
			System.out.println(multiplicar(n1,n2));
				break;
			case 4: System.out.println("Introduce 2 números a dividir");
			 n1 = sc.nextInt();
			 n2 = sc.nextInt();
			System.out.println(dividir(n1,n2));
				break;
			case 5: System.out.println("Introduce 2 números a calcular la potencia");
			 n1 = sc.nextInt();
			 n2 = sc.nextInt();
			System.out.println(potencia(n1,n2));
				break;
			case 6: System.out.println("Introduce 1 número para calcular su raiz cuadrada");
			 n1 = sc.nextInt();
			System.out.println(raiz(n1));
				break;
			case 9: 
				break;
			default: 
				break;
			}
			if (opcion == 9) {
				break;
			}
		}	
	}
	
	public static int sumar(int a, int b) {
		return(a+b);
	}
	public static int restar(int a, int b) {
		return(a-b);
	}
	public static int multiplicar(int a, int b) {
		return(a*b);
	}
	public static double dividir(double a, double b) {
		return(a/b);
	}
	public static int potencia(int a, int b) {
		return (int) (Math.pow(a, b));
	}
	public static int raiz(int a) {
		return(a*a);
	}
}
