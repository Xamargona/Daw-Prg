package Tr3.UD7_Orientación_objetos.ejer98;
import java.util.*;
public class Principal {
    static final Scanner sc = new Scanner(System.in);
    static final Random r = new Random();
    static ArrayList<String> lista_luchadores = new ArrayList<>(Arrays.asList("El bromes", "Sir pingulot", "Lebron James", "Palitos", "Mantequillo", "Rodman", "Gotikk Qlonikk", "Pudge Demon", "Kerry Cabuela"));
    static ArrayList<String> lista_escenarios = new ArrayList<>(Arrays.asList("l'Hospitalet de Llobregat", "Casal España Arena de Valencia", "Mercadona Arena", "Rita Barberà Arena", "Plaça Hondures", "Campus de Burjassot"));;

    public static void main(String[] args) {
        System.out.println("-----------------------------\n|BIENVENIDO A STREET FIGHTER|\n-----------------------------");
        Luchador l1 = escoger_luchador();
        Luchador l2 = escoger_random();
        Escenario e1 = escoger_escenario(l1, l2);
        combate(e1);
    }

    public static Luchador escoger_luchador(){
        System.out.println("\nEscoge tu luchador\n------------------\n");
        int i = 1;
        for (String luchadores : lista_luchadores) {
            System.out.println(i+"-"+luchadores);
            i++;
        }
        System.out.println(i+"-Random");
        int entrada = -1;
        while(entrada<1||entrada>lista_luchadores.size() + 1){
            entrada = sc.nextInt();
        }
        if (entrada == lista_luchadores.size() + 1){
            return escoger_random();
        }
        System.out.println(lista_luchadores.get(entrada-1)+" seleccionado");
        return new Luchador(lista_luchadores.get(entrada-1));
    }

    public static Luchador escoger_random(){
        ArrayList<String> lista = lista_luchadores;
        int valor = r.nextInt(lista.size())+1;
        System.out.println(lista_luchadores.get(valor)+" seleccionado");
        return new Luchador(lista.get(valor));
    }

    public static Escenario escoger_escenario(Luchador l1, Luchador l2){
        System.out.println("\nSelecciona el escenario\n-----------------------\n");
        int i = 1;
        for (String escenarios : lista_escenarios) {
            System.out.println(i+"-"+escenarios);
            i++;
        }
        System.out.println(i+"-Random");
        int entrada = -1;
        while(entrada<1||entrada>lista_escenarios.size() + 1){
            entrada = sc.nextInt();
        }
        if (entrada == lista_escenarios.size() + 1){
            return escoger_randomEscenario(l1, l2);
        }
        System.out.println(lista_escenarios.get(entrada-1)+" seleccionado");
        return new Escenario(lista_escenarios.get(entrada-1), l1, l2);
    }

    public static Escenario escoger_randomEscenario(Luchador l1, Luchador l2){
        ArrayList<String> lista = lista_escenarios;
        int valor = r.nextInt(lista.size())+1;
        System.out.println(lista_escenarios.get(valor)+" seleccionado");
        return new Escenario(lista.get(valor), l1, l2);
    }

    public static void combate(Escenario e1){
        System.out.println("Comienza el combate entre "+e1.getLuchador1().getNombre()+" y "+e1.getLuchador2().getNombre()+" en "+e1.getNombre());

        while(e1.getLuchador1().getVida()>0 || e1.getLuchador2().getVida()>0){
            calcular_golpe(e1.getLuchador1());
            if (e1.getLuchador1().getVida()<1){
                System.out.println(e1.getLuchador1().getNombre()+" ha sido derrotado\nGANADOR: "+e1.getLuchador2().getNombre());
                break;
            }
            calcular_golpe(e1.getLuchador2());
            if (e1.getLuchador2().getVida()<1){
                System.out.println(e1.getLuchador2().getNombre()+" ha sido derrotado\nGANADOR: "+e1.getLuchador1().getNombre());
                break;
            }
        }
    }

    public static void calcular_golpe(Luchador luchador){
        int x = r.nextInt(50)+1;
        luchador.recibir_golpe(x);
    }
}
