package Tr1.UD4;

public class ejer52 {

	public static void main(String[] args) {

		int[] lista = new int [100]; 
		int suma = 0;
		for(int i = 0; i<100;i++) {
			 lista [i] = i+1;
			 suma = suma + lista[i];
			 System.out.println(lista[i]);
		}
		int media = suma/lista.length;
		System.out.println("total = " + suma);
		System.out.println("media = " + media);

	}
}
