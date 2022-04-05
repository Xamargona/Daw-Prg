package Tr3.UD8_Excepciones_Ficheros.ejer101;

import java.util.*;

public class Principal {

    static final Scanner sc = new Scanner(System.in);
    static final ArrayList<Animal> lista_animales = new ArrayList<Animal>();

    public static void main(String[] args) throws Exception{

        int opcion = 0;
        do {
            try {
                opcion = opcion_menu();
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }while(opcion != 5);

    }

    public static int opcion_menu() throws Exception{

        int opcion = 0;
        boolean comprobante_letras = false;
        System.out.println("Bienvenido al Zoo Tigres & Leones");
        System.out.println("---------------------------------");
        System.out.println("1-Dar de alta animal");
        System.out.println("2-Dar de baja animal");
        System.out.println("3-Modificar peso");
        System.out.println("4-Listado animales");
        System.out.println("5-Salir");

        try {
            opcion = sc.nextInt();
        }

        /*
        COMPROBAMOS QUE SEA UN NÚMERO EL VALOR QUE PEDIMOS
        SI ES UNA LETRA ACTIVAMOS EL COMPROBANTE PARA EL SIGUIENTE CATCH
        */

        // 1ª comprobación: números
        catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar valores enteros");
            comprobante_letras = true;
        }

        // 2ª comprobación: opción en rango o letras
        if (opcion < 1 && opcion > 5) {
            // utilidad????

            //Excepción letras
            if (!comprobante_letras) {
                throw new Exception("ERROR: Opción incorrecta");
            }
        }
        return opcion;
    }




}
