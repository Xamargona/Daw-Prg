package Tr2.UD7_Orientación_objetos.ejer97;

public class Fraccion {

    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public Fraccion invertir() {
        int aux = denominador;
        denominador = numerador;
        numerador = aux;
        return new Fraccion(numerador, denominador);
    }

    public void escribir_fraccion() {
        System.out.println(numerador+"/"+denominador);
    }

    public Fraccion multiplicar(Fraccion f){
        return new Fraccion(this.numerador*f.numerador, this.denominador*f.denominador);
    }

    public Fraccion dividir(Fraccion f){
        return new Fraccion(this.numerador*f.denominador, this.denominador*f.numerador);
    }

}
