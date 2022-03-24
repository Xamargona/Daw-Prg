package Tr3.Actividades_Evaluables.AE1_JavierMG;
import java.util.*;

public class Principal {
    static final Scanner sc = new Scanner(System.in);
    static ArrayList<Director> lista_directores = new ArrayList<>();
    static ArrayList<Productor> lista_productores = new ArrayList<>();
    static ArrayList<Actor> lista_actores = new ArrayList<>();
    static ArrayList<Pelicula> lista_peliculas = new ArrayList<>();

    public static void main(String[] args) {

        int opcion;
        do {
            opcion = menu();
            switch (opcion){
                case 1: alta_director(); break;
                case 2: alta_actor(); break;
                case 3: alta_productor(); break;
                case 4: alta_pelicula();break;
                case 5: muestra_peliculas();break;
                case 6: System.out.println("Gracias por utilizar nuestro Videoclub");break;
            }
        }while(opcion != 6);
    }

    public static int menu(){
        int opcion;
        do {
            System.out.println("--VIDEOCLUB BE KIND - REWIND --");
            System.out.println("1-Dar de alta un Director");
            System.out.println("2-Dar de alta un Actor");
            System.out.println("3-Dar de alta un Productor");
            System.out.println("4-Dar de alta una pelicula");
            System.out.println("5-Listado de peliculas");
            System.out.println("6-Salir");
            opcion = sc.nextInt();
        }while(opcion < 1 || opcion > 6);
        sc.nextLine();
        return opcion;
    }
    public static void alta_director(){
        System.out.println("Vamos a dar de alta un Director:");
        String nombre;
        do {
            System.out.println("Introduzca nombre:");
            nombre = sc.nextLine();
        }while(nombre.isEmpty());
        int edad;
        do {
            System.out.println("Introduzca la edad de "+nombre+":");
            edad = sc.nextInt();
            if (edad < 0){
                System.out.println("Error edad negativa.");
            }
        }while (edad < 0);
        int n_oscar;
        do {
            System.out.println("Introduzca el numero de oscars que ha ganado "+nombre+":");
            n_oscar = sc.nextInt();
        }while (n_oscar < 0);
        sc.nextLine();
        lista_directores.add(new Director(nombre, edad, n_oscar));
        System.out.println("Director numero "+lista_directores.size()+" dado de alta!");
    }

    public static void alta_productor(){
        System.out.println("Vamos a dar de alta un Productor:");
        String nombre;
        do {
            System.out.println("Introduzca nombre:");
            nombre = sc.nextLine();
        }while(nombre.isEmpty());
        int edad;
        do {
            System.out.println("Introduzca la edad de "+nombre+":");
            edad = sc.nextInt();
            if (edad < 0){
                System.out.println("Error edad negativa.");
            }
        }while (edad < 0);
        int n_oscar;
        do {
            System.out.println("Introduzca el numero de oscars que ha ganado "+nombre+":");
            n_oscar = sc.nextInt();
        }while (n_oscar < 0);
        sc.nextLine();
        lista_productores.add(new Productor(nombre, edad, n_oscar));
        System.out.println("Productor numero "+lista_productores.size()+" dado de alta!");
    }

    public static void alta_actor(){
        System.out.println("Vamos a dar de alta un Actor:");
        String nombre;
        do {
            System.out.println("Introduzca nombre:");
            nombre = sc.nextLine();
        }while(nombre.isEmpty());
        int edad;
        do {
            System.out.println("Introduzca la edad de "+nombre+":");
            edad = sc.nextInt();
            if (edad < 0){
                System.out.println("Error edad negativa.");
            }
        }while (edad < 0);
        int n_oscar;
        do {
            System.out.println("Introduzca el numero de oscars que ha ganado "+nombre+":");
            n_oscar = sc.nextInt();
        }while (n_oscar < 0);
        sc.nextLine();
        lista_actores.add(new Actor(nombre, edad, n_oscar));
        System.out.println("Actor numero "+lista_actores.size()+" dado de alta!");
    }

    public static void alta_pelicula(){
        String nombre;
        boolean validador = false;
        do {
            System.out.println("Introduzca el titulo de la nueva pelicula:");
            nombre = sc.nextLine();
        }while(nombre.isEmpty());

        String director;
        int pos_director = 0;
        do {
            System.out.println("Introduzca el director de "+nombre+":");
            director = sc.nextLine();
            for (Director directorEnLista : lista_directores){
                if (directorEnLista.getNombre().equalsIgnoreCase(director)){
                    validador = true;
                    pos_director = lista_directores.indexOf(directorEnLista);
                }
            }
        }while (!validador);

        String productor;
        int pos_productor = 0;
        validador = false;
        do {
            System.out.println("Introduzca el productor de "+nombre+":");
            productor = sc.nextLine();
            for (Productor productorEnLista : lista_productores){
                if (productorEnLista.getNombre().equalsIgnoreCase(productor)){
                    validador = true;
                    pos_productor = lista_productores.indexOf(productorEnLista);
                }
            }
        }while (!validador);

        lista_peliculas.add(new Pelicula(nombre, lista_directores.get(pos_director), lista_productores.get(pos_productor)));

        int pos_pelicula = 0;

        for (Pelicula peliculaEnLista : lista_peliculas){
            if (peliculaEnLista.getTitulo().equalsIgnoreCase(nombre)){
                pos_pelicula = lista_peliculas.indexOf(peliculaEnLista);
            }
        }

        System.out.println("Ahora vamos a introducir los actores de "+nombre+", pulse en cualquier momento salir para dejar de introducirlos:");

        String entrada;
        int n_actores = 1;
        do {
            System.out.println("Introduzca datos del actor "+n_actores);
            entrada = sc.nextLine();
            if (entrada.equalsIgnoreCase("salir")){
                break;
            }else {
                for (Actor actorEnLista : lista_actores){
                    if (actorEnLista.getNombre().equalsIgnoreCase(entrada)){
                        lista_peliculas.get(pos_pelicula).add_actor(actorEnLista);
                        n_actores++;
                    }
                }
            }
        }while(!entrada.equalsIgnoreCase("salir"));
    }

    public static void muestra_peliculas(){
        System.out.println("Peliculas:"+lista_peliculas.size());
        System.out.println("Directores"+lista_directores.size());
        System.out.println("Productores:"+lista_productores.size());
        System.out.println("Actores:"+lista_actores.size());

        for (Pelicula peli : lista_peliculas){
            int n_oscar = 0;
            System.out.println("--");
            System.out.println("+ '"+peli.getTitulo()+"' dirigida por : "+peli.getDirector().getNombre()+" producida por : "+peli.getProductor().getNombre()+" e interpretada por:");
            for (Actor actor : peli.getLista_actores()){
                System.out.println("\t- "+actor.getNombre());
                n_oscar = n_oscar+actor.getN_oscar();
            }
            n_oscar = n_oscar+peli.getProductor().getN_oscar()+peli.getDirector().getN_oscar();
            System.out.println("Entre el director, productor y actores, "+peli.getTitulo()+" tiene "+n_oscar+ " oscars.");
            System.out.println("--");
        }
    }

}
