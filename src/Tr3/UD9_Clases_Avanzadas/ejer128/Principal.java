package Tr3.UD9_Clases_Avanzadas.ejer128;

public class Principal {
    public static void main(String[] args){
        Vehiculo[] lista = new Vehiculo[4];
        lista[0] = new Camion("uwuES");
        lista[1] = new Coche("notUwU12", 4);
        lista[2] = new Camion("generica32");
        lista[3] = new Coche("generica512",8);
        ((Camion)lista[0]).ponRemolque(new Remolque(5000));
        ((Camion)lista[2]).ponRemolque(new Remolque(5000));
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i].toString());
        }
        try{
            lista[0].acelerar(90);
            lista[1].acelerar(120);
            lista[2].acelerar(90);
            lista[3].acelerar(120);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        ((Camion)lista[2]).quitaRemolque();
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i].toString());
        }
        try{
            lista[0].acelerar(30);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
