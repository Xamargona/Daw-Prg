package Tr1.UD2;

public class ejer5 {

enum semana{
		Lunes,Martes,Miercoles,Jueves,Viernes,Sabado,Domingo;
	}
	public static void main(String[] args) {

		System.out.println("Odio los " + semana.Lunes +".");
		System.out.println("Los " + semana.Martes + " paso de la fase de negación a la fase de aceptación.");
		System.out.println("Cuando es " + semana.Miercoles + " pienso que ya vamos por la mitad de la semana.");
		System.out.println("El previo del Viernes, el " + semana.Jueves + ", es mi día favorito de la semana.");
		System.out.println("El " + semana.Viernes +" suelo quedar con mis amigos para cenar.");
		System.out.println("Los " + semana.Sabado +" me levanto tarde y siempre desayuno tortitas.");
		System.out.println("Me deprimen los " + semana.Domingo + " porque pienso que mañana es " + semana.Lunes +".");
	}
}
