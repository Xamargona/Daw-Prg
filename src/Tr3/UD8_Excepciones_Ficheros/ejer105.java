package Tr3.UD8_Excepciones_Ficheros;
import java.util.*;
public class ejer105 {
    static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Bienvenido al chat con Paco");
        String nombre = verificar_usuario();
        boolean vete = false;
        while (!vete) {
            vete = PacoRespuesta(nombre);
        }
    }
    public static String verificar_usuario() {
        System.out.println("Paco: Hola que tal, cómo te llamas?");
        String nombre = sc.nextLine();
        while(nombre.isEmpty()) {
            System.out.println("Paco: Oye que te he preguntado como te llamas!");
            nombre = sc.nextLine();
        }
        System.out.println("Paco: Hola "+ nombre +", ¿como estas hoy?");
        return nombre;
    }

    public static boolean PacoRespuesta(String nombre) {
        String usuario = sc.nextLine();
        if (usuario.contains("vete")) {
            System.out.println("Paco: nos vemos "+nombre+"!");
            return true;
        }
        char[] entrada = usuario.toCharArray();
        int contador = 0;
        char [] vocales = {'a','e','i','o','u','A','E','I','O','U'};
        for (int i = 0; i < entrada.length; i++) {
            for (int j = 0; j < vocales.length; j++) {
                if (entrada[i] == vocales[j]) {
                    contador++;
                }
            }
        }
        if (contador%2==0) {
            System.out.println("Paco: Qué interesante...cuentame más...");
        } else {
            System.out.println("Paco: No me interesa nada, cuentame otra cosa");
        }
        return false;
    }
}
