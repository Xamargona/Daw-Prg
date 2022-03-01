package Tr1.Actividades_Varias;

import java.util.*;

public class suma_matriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("Tamaño de la matriz");
		int tam = sc.nextInt();
		System.out.println();
		
		int[][] matriz1 = new int [tam][tam];
		int[][] matriz2 = new int [tam][tam];
		int[][] matriz3 = new int [tam][tam];
		
		int valor1;
		int valor2;
		
		for (int i = 0; i < tam; i++) {
			for (int j = 0; j < tam; j++) {
				valor1 =  (int)(r.nextDouble()*100+1);
				valor2 =  (int)(r.nextDouble()*100+1);
				matriz1[i][j] = valor1;
				matriz2[i][j] = valor2;
				matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}
		
		for (int i = 0; i < tam; i ++) {
				
			for (int j = 0; j < tam; j++) {
				if(j == 0) {
					System.out.print("| "+matriz1[i][j]+"\t");
				}else if(j > 0 && j < tam-1) {
					System.out.print(matriz1[i][j]+"\t");
				}else if(j == tam-1 && matriz1[i][j]<10) {
					System.out.print(matriz1[i][j]+"  |\t");
				}else if(j == tam-1) {
					System.out.print(matriz1[i][j]+" |\t");
				}
			}
			
			if(tam%2 != 0 && i == ((tam-1)/2)){
				System.out.print("  +\t ");
			}else if(tam%2 == 0 && i == tam/2){
				System.out.print("  +\t ");
			}else if(tam%2 == 0 && i == (tam/2)-1){
				System.out.print("  +\t ");
			}else{
				System.out.print("\t ");
			}
			
			for (int j = 0; j < tam; j++) {
				if(j == 0) {
					System.out.print("| "+matriz2[i][j]+"\t");
				}else if(j > 0 && j < tam-1) {
					System.out.print(matriz2[i][j]+"\t");
				}else if(j == tam-1 && matriz2[i][j]<10) {
					System.out.print(matriz2[i][j]+"  |\t");
				}else if(j == tam-1) {
					System.out.print(matriz2[i][j]+" |\t");
				}
			}
			
			if(tam%2 != 0 && i == ((tam-1)/2)){
				System.out.print("  =\t ");
			}else if(tam%2 == 0 && i == tam/2){
				System.out.print("  =\t ");
			}else if(tam%2 == 0 && i == (tam/2) -1){
				System.out.print("  =\t ");
			}else{
				System.out.print("\t ");
			}
			
			for (int j = 0; j < tam; j++) {
				if(j == 0) {
					System.out.print("| "+matriz3[i][j]+"\t");
				}else if(j > 0 && j < tam-1) {
					System.out.print(matriz3[i][j]+"\t");
				}else if(j == tam-1 && matriz3[i][j]<10) {
					System.out.print(matriz3[i][j]+"  |\t");
				}else if(j == tam-1 && matriz3[i][j]<100) {
					System.out.print(matriz3[i][j]+"  |\t");
				}else if(j == tam-1) {
					System.out.print(matriz3[i][j]+" |\t");
				}
			}
			System.out.println();
		}
	}
}

	
