package Tr3.Actividades_Evaluables.AE1_JavierMG;

import java.util.ArrayList;

public class Pelicula {

    private String titulo;
    private Director director;
    private Productor productor;
    private ArrayList<Actor> lista_actores = new ArrayList<Actor>();

    public  Pelicula (String titulo, Director director, Productor productor){
        this.titulo = titulo;
        this.director = director;
        this.productor = productor;
    }

    public void add_actor(Actor actor){
        lista_actores.add(actor);
    }

    public String getTitulo() {
        return titulo;
    }

    public Director getDirector() {
        return director;
    }

    public ArrayList<Actor> getLista_actores() {
        return lista_actores;
    }

    public Productor getProductor() {
        return productor;
    }
}
