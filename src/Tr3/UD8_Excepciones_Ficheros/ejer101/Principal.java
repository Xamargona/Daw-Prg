package Tr3.UD8_Excepciones_Ficheros.ejer101;

import java.util.*;


/*
*
*  INTRODUCCIÓN A LOS TRY CATCH / EXCEPTION
*
*  Antes tratabamos las excepciones y posibles fallos identificando la variable,
*  ahora cuando se cumplan estos casos LANZAMOS UNA EXCEPCION
*
*  Por ejemplo, al dar de alta si se da valor erróneo utilizamos excepciones
*  pero al mostrar la lista no es necesario ya que no hay posible fallo
*
* */


public class Principal {
    static final Scanner sc = new Scanner(System.in);
    static final ArrayList<Animal> lista_animales = new ArrayList<Animal>();

    public static void main(String[] args) {
        int opcion = -1;
        while (opcion != 5) {
            try {
                opcion = menu();
                sc.nextLine();
                switch (opcion) {
                    case 1: alta_animal(); break;
                    case 2: baja_animal(); break;
                    case 3: modificar_peso(); break;
                    case 4: mostrar_animales(); break;
                    case 5: System.out.println("Gracias por utilizar este Zoo.");
                            System.out.println("Y acuerdate que tigres y leones, todos quieren ser los campeones.");
                            break;
                }
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static int menu() throws Exception{

        int opcion = -1;
        boolean letras = false;
        System.out.println("Bienvenido al Zoo Tigres & Leones");
        System.out.println("---------------------------------");
        System.out.println("1-Dar de alta animal");
        System.out.println("2-Dar de baja animal");
        System.out.println("3-Modificar peso");
        System.out.println("4-Listado animales");
        System.out.println("5-Salir");

        try {
            opcion = sc.nextInt();
            if (opcion < 1 || opcion > 5) {
                throw new Exception("ERROR: Opción incorrecta");
            }
        }
        catch (InputMismatchException e) {
            System.out.println("ERROR: Debes ingresar valores enteros");
        }
        catch (Exception e) {
            System.out.println("ERROR: Opción incorrecta");
        }
        return opcion;
    }

    public static void alta_animal() {

        System.out.println("Introduce el tipo de animal (l-leon, t-tigre):");
        char letra;
        boolean validar;
        try {
            letra = sc.nextLine().charAt(0);
            if (letra != 't' && letra != 'l') {
                throw new Exception("ERROR: Esto no es ni un tigre ni un leon!");
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }

        if (letra == 't') {
            validar = true;
        } else {
            validar = false;
        }

        System.out.println("Introduzca el nombre del animal (Sin incluir numeros!):");
        String nombre;
        try {
            nombre = sc.nextLine();
            if (nombre.contains("1")||
                nombre.contains("2")||
                nombre.contains("3")||
                nombre.contains("4")||
                nombre.contains("5")||
                nombre.contains("6")||
                nombre.contains("7")||
                nombre.contains("8")||
                nombre.contains("9")||
                nombre.contains("0")) {
                throw new Exception("El nombre contiene numeros");
            }
        }
        catch (Exception e) {
                System.out.println(e.getMessage());
                return;
        }

        System.out.println("Introduzca el peso del animal:");
        int peso;
        try {
            peso = sc.nextInt();
            sc.nextLine();
        }
        catch (InputMismatchException e) {
            System.out.println("Error: Valor no numerico");
            return;
        }
        try {
            if (peso < 1) {
                throw new Exception("Un animal n puede tener peso negativo");
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        lista_animales.add(new Animal(validar, nombre, peso));

    }

    public static void baja_animal() {
        System.out.println("Introduzca el nombre del animal a dar de baja");
        String buscar = sc.nextLine();
        try {
            boolean aux = false;
            int  x = 0;
            for (Animal animal: lista_animales ) {
                if (animal.getNombre().equalsIgnoreCase(buscar)) {
                    System.out.println("Dando de baja al animal "+animal.getNombre());
                    aux = true;
                    x = lista_animales.indexOf(animal);
                }
            }
            if (aux) {
                lista_animales.remove(x);
            }
            if (!aux) {
                throw new Exception("Animal no encontado");
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void modificar_peso() {
        System.out.println("Introduzca el nombre del animal a modificar el peso");
        String buscar = sc.nextLine();
        try {
            boolean aux = false;
            int  x = 0;
            for (Animal animal: lista_animales ) {
                if (animal.getNombre().equalsIgnoreCase(buscar)) {
                    aux = true;
                    x = lista_animales.indexOf(animal);
                }
            }
            if (aux) {
                System.out.println("Introduzca el peso del animal");
                int z = sc.nextInt();
                sc.nextLine();
                lista_animales.get(x).setPeso(z);
            }
            if (!aux) {
                throw new Exception("Animal no encontado");
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void mostrar_animales() {
        for (Animal animal : lista_animales) {
            System.out.println(animal.isTipo()+" "+animal.getNombre()+" "+animal.getPeso());
        }
    }

}
