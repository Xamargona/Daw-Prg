package Tr3.UD7_Orientación_objetos.ejer99;

import java.util.LinkedList;
import java.util.Queue;

public class Sala {

    private int n_sala;
    private Queue<Cliente> colasala = new LinkedList<Cliente>();

    public Sala (int n_sala){
        this.n_sala = n_sala;
    }

    public void addCliente(Cliente cliente){
        colasala.add(cliente);
    }

    public int getN_sala() {
        return n_sala;
    }

    public Queue<Cliente> getColasala() {
        return colasala;
    }
}
