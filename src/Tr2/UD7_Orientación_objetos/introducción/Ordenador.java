package Tr2.UD7_Orientación_objetos.introducción;

public class Ordenador {

    private String procesador;
    private int ram;
    private int disco;

    public void encender_ordenador() {
        //sout
        //souf
        System.out.println("Encendemos el ordenador con procesador: "+procesador+" y memoria: "+ram+" Gb y disco de: "+disco+"Gb");
    }

    public void navegar_internet() {
        System.out.println("Navego por internet");
    }

    public void apagar_ordenador() {
        System.out.println("Apago el ordenador");
    }

    public Ordenador(String proc_entrada, int ram_entrada, int disco_entrada){
        procesador = proc_entrada;
        ram = ram_entrada;
        disco = disco_entrada;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setDisco(int disco) {
        this.disco = disco;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
}
