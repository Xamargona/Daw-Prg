package Tr3.Actividades_Evaluables.AE3_JavierMG;

import java.net.CacheResponse;
import java.util.*;
public class Principal {

    public static void main(String[] args) {

        System.out.println("P1-CREACION DE ARAGORN, LE ARMAMOS Y LE DAMOS EL ANILLO");
        System.out.println("-------------------------------------------------------");

        Hombre p1 = new Hombre("Aragorn",30,90);
        p1.presentarse();
        p1.dar_arma("espada");
        p1.dar_arma("daga");
        p1.presentarse();
        p1.dar_o_quitar_anillo("dar");

        System.out.println();
        System.out.println("P2-CREACION DE BOROMIR Y LE DAMOS EL ANILLO");
        System.out.println("-------------------------------------------");

        Hombre p2 = new Hombre("Boromir",35,95);
        p2.dar_o_quitar_anillo("quitar");
        p1.dar_o_quitar_anillo("quitar");
        p2.dar_o_quitar_anillo("dar");

        System.out.println();
        System.out.println("P3-CREAMOS A GALADRIEL Y LA EMPAREJAMOS CON BOROMIR");
        System.out.println("---------------------------------------------------");

        Elfo p3 = new Elfo("Galadriel", 150, "oscuro");
        p3.presentarse();
        p3.emparejar(p2);
        p3.presentarse();

        System.out.println();
        System.out.println("P4-INTENTAMOS EMPAREJAR A ARWEN Y LEGOLAS Y SALE MAL. LUEGO CON ARAGORN OK.");
        System.out.println("--------------------------------------------------------------------------");

        Elfo p41 = new Elfo("Legolas", 25, "blanco");
        Elfo p42 = new Elfo("Arwen", 24, "blanco");

        p42.emparejar(p41);
        p42.emparejar(p1);
        p42.presentarse();

        System.out.println();
        System.out.println("P5-CREO UN ORCO NORMAL Y UN ORCO TEMIBLE.");
        System.out.println("----------------------------------------");

        Orco p51 = new Orco("orquito1",100, true);
        p51.armar("espada");
        Orco p52 = new Orco("orquito2",100, true);
        p52.armar("hacha");
        p51.presentarse();
        p52.presentarse();

        System.out.println();
        System.out.println("P6-CREO 3 HOBBITS, LE DAMOS EL ANILLO A SMEAGOL Y LO TRANSFORMAMOS EN GOLLUM.");
        System.out.println("----------------------------------------------------------------------------");

        Hobbit p61 = new Hobbit("Frodo",30,8);
        Hobbit p62 = new Hobbit("Sam",32,7);
        Hobbit p63 = new Hobbit("Smeagol",40,10);
        p61.presentarse();
        p62.presentarse();
        p63.presentarse();
        p2.dar_o_quitar_anillo("quitar");
        p63.dar_o_quitar_anillo("dar");
        p63.presentarse();

        System.out.println();
        System.out.println("P7-CREO A SMAUG Y LE AÑADO UN JINETE TEMIBLE");
        System.out.println("-------------------------------------------");

        CriaturaAlada p7 = new CriaturaAlada("Smaug", true);
        p7.presentarse();
        p7.anyadir_jinete(p51);
        p7.anyadir_jinete(p52);
        p7.presentarse();




    }
}
