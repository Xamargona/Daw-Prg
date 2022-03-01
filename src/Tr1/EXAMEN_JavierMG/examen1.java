package Tr1.EXAMEN_JavierMG;

import java.util.*;

public class examen1 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int x;
        int y;
        int contador = 0;
		String[] paco = {"P","a","c","o"};
		int p = 0;
		int a = 0;
		int c = 0;
		int o = 0;

        System.out.println("Introduzca dimensiones de la bandera de Paco (min. 4x4):");
        x = sc.nextInt();
        y = sc.nextInt();
        while(x < 4 || y < 4) {
        	if(x < 4) {
        		System.out.println("La dimensión x es inferior a 4.");
        	}
        	if(y < 4) {
        		System.out.println("La dimensión y es inferior a 4.");
        	}
            System.out.println("Introduzca dimensiones de la bandera de Paco (min. 4x4):");
            x = sc.nextInt();
            y = sc.nextInt();
        }
        
        for(int i = 0; i < y+1; i++) {
        	
        	if(i == 0) {
        		for(int k = 0; k < x+2; k++) {
        			System.out.print("@");
        		}
        		System.out.println();
        	}else {
            	System.out.print("@");
            	for(int j = 0; j < x; j++) {
            		if(contador==4) {
            			contador = 0;
            		}
            		System.out.print(paco[contador]);
            		if(paco[contador].equals("P")) {
            			p = p+1;
            		}
            		if(paco[contador].equals("a")) {
            			a = a+1;
            		}
            		if(paco[contador].equals("c")) {
            			c = c+1;
            		}
            		if(paco[contador].equals("o")) {
            			o = o+1;
            		}
            		contador = contador+1;
            	}
            	System.out.println("@");
        	}	
        }
        for(int k = 0; k < x+2; k++) {
			System.out.print("@");
		}
        System.out.println();
        System.out.println();
        int precio = p*10 + a*5 + c*5 + o*5;
        System.out.println("Imprimir esta bandera costaría: " + precio + "€ ya que hay que imprimir:");
        System.out.println("-"+ p + " letras P por valor de:" + (p*10) + "€");
        System.out.println("-"+ a + " letras a por valor de:" + (a*5) + "€");
        System.out.println("-"+ c + " letras c por valor de:" + (c*5) + "€");
        System.out.println("-"+ o + " letras o por valor de:" + (o*5) + "€");

        
	}
}
