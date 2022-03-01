package Tr1.UD4;

import java.util.*;

public class ejer62 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String password;
        int minus;
        int mayus;
        int num;
        boolean verificador = true;
        System.out.println("El password ha de tener las siguientes restricciones:");
        System.out.println("1-Al menos 8 caracteres");
        System.out.println("2-Al menos la mitad del password ha de estar en minúsculas");
        System.out.println("3-Al menos 2 mayúsculas");
        System.out.println("4-Al menos 3 números");
        System.out.println("5-No incluir el caracter '@'");
        
    	System.out.println("Introduzca su password:");
        password = sc.nextLine();
        
        while(verificador) {
            
        	verificador = false;
        	minus = 0;
        	mayus = 0;
        	num = 0;

            if(password.length() < 8 ) {
            	System.out.println("El tamaño del password ha de ser de, al menos, 8 caracteres, y el suyo es de " + password.length());
            	verificador = true;
            }
            for(int i = 0; i < password.length(); i++) {
            	if(Character.isLowerCase(password.charAt(i))) {
            		minus ++;
            	}
            	if(Character.isUpperCase(password.charAt(i))) {
            		mayus ++;
            	}
            	if(Character.isDigit(password.charAt(i))) {
            		num ++;
            	}
            }
            if(password.length()/2 > minus) {
            	System.out.println("La mitad del password no está en minúsculas. Deberia contener " + password.length()/2 + " y solo contiene " + minus);
            	verificador = true;
            }
            if(mayus < 2) {
            	System.out.println("Deben existir, al menos, 2 mayúsculas y solo tienes " + mayus);
            	verificador = true;
            }
            if(num < 3) {
            	System.out.println("Deben existir, al menos, 3 números y solo tienes " + num);
            	verificador = true;
            }
            if(password.indexOf("@") != -1) {
            	System.out.println("El password no puede contener el caracter '@'");
            	verificador = true;
            }
            if(!verificador){
                System.out.println("El password cumple todas las restricciones. Enhorabuena!");
                continue;
            }
            System.out.println("-------------------");
        	System.out.println("Intentelo de nuevo:");
            password = sc.nextLine();
        }

	}
}
