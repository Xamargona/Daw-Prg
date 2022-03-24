package Tr3.UD7_Orientación_objetos.ejer98;

public class Luchador {

    private String nombre;
    private int vida;

    public Luchador(String nombre){
        this.nombre = nombre;
        this.vida = 100;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public void recibir_golpe(int dmg) {
        this.vida = this.vida-dmg;
    }

    public void curar(){
        this.vida = 100;
    }
}
