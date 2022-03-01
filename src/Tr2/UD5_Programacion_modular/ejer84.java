package Tr2.UD5_Programacion_modular;

import java.util.*;

public class ejer84 {
	static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("¿Qué tipo de área quieres calcular?\n1- Cuadrado\n2- Rectángulo\n3- Paralelogramo\n4- Triágulo\n5- Trapecio\n6- Círculo");
		int n = sc.nextInt();
		int n1;
		int n2;
		int n3;
		switch (n) {
		case 1:
			System.out.println("Introduce el lado");
			n1 = sc.nextInt();
			System.out.println(area(n1, n1));break;
		case 2:
			System.out.println("Introduce el primer lado");
			n1 = sc.nextInt();
			System.out.println("Introduce el segundo lado");
			n2 = sc.nextInt();
			System.out.println(area(n1, n2));break;
		case 3:
			System.out.println("Introduce el lado");
			n1 = sc.nextInt();
			System.out.println("Introduce la altura");
			n2 = sc.nextInt();
			System.out.println(area(n1, n2));break;
		case 4:
			System.out.println("Introduce el lado");
			n1 = sc.nextInt();
			System.out.println("Introduce la altura");
			n2 = sc.nextInt();
			System.out.println(area(n1, n2, 1));break;
		case 5:
			System.out.println("Introduce el lado");
			n1 = sc.nextInt();
			System.out.println("Introduce el segundo lado");
			n2 = sc.nextInt();
			System.out.println("Introduce la altura");
			n3 = sc.nextInt();
			System.out.println(area(n1, n2, n3));break;
		case 6:
			System.out.println("Introduce el radio");
			n1 = sc.nextInt();
			System.out.println(area(n1));break;
		default:
			break;
		}
	}
	public static int area(int lado1, int lado2 ) {
		return (lado1*lado2);
	}
	public static float area(int lado1, int lado2, int altura) {
		float x = ((lado1+lado2)/2)*altura;
		return x;
	}
	public static float area(float radio) {
		return (float) ((radio*radio)*3.14);
	}
}
