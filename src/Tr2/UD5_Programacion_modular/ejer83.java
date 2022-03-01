package Tr2.UD5_Programacion_modular;

import java.util.*;

public class ejer83 {
	static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int fallos = 0;
		for(int i = 1; i <= 5;) {
		System.out.println(elegir_frase_maquina(i));
		String a = elegir_opcion_humano();
			if(validar(elegir_frase_maquina(i), a)==true) {
				System.out.println("Punto para mi!");
				i++;
			}else{
				fallos++;
				System.out.println("Fallo "+fallos+" de 3! Ne han hecho pupita! Intentalo de nuevo!");
			}
			if (fallos == 3) {
				System.out.println("PERDISTE");
				break;
			}else if(i == 6) {
				System.out.println("VICTORIA");
				break;
			}
		}
	}
	public static String elegir_frase_maquina (int n) {
		String a = "1-Eres tan repulsivo como una mona marrana";
		String b = "2-Mis ataques han dejado islas enteras sin poblados";
		String c = "3-Tu cara haría vomitar hasta el cerdo menos aseado";
		String d = "4-Mis habilidades con la espada son muy veneradas";
		String e = "5-Piedad, te lo ruego, no mas insultos por favor";
		switch (n) {
		case 1: return a; 
		case 2: return b; 
		case 3: return c; 
		case 4: return d; 
		case 5: return e; 

		default:
			break;
		} 
		return a;
	}
	public static String elegir_opcion_humano() {
		String a ="a) Que pena que todas esten inventadas";
		String b = "b) Y eso sin contar a las otras con las que te has citado";
		String c = "c) Tu olor y tu cara me recuerdan a un queso sin frescor";
		String d = "d) Eso es porque me parezco mucho a tu hermana";
		String e = "e) Con tu aliento, seguro que todos fueron asfixiados";
		System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+e);
		String x = sc.nextLine();
		switch (x) {
		case "a": return a; 
		case "b": return b; 
		case "c": return c; 
		case "d": return d; 
		case "e": return e; 

		default:
			break;
		} 
		return a;
	}
	public static boolean validar(String a, String b) {
		int n1 = a.length();
		int n2 = b.length();
		if(a.charAt(n1-1) == b.charAt(n2-1) && a.charAt(n1-2) == b.charAt(n2-2)) {
			return true;
		}
		return false;
	}
}
