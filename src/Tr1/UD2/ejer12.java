package Tr1.UD2;

public class ejer12 {

	public static void main(String[] args) {
		
		int votos_psoe = 30;
		int votos_vox = 10;
		int votos_podemos = 30;
		int votos_pp = 5;
		int votos_ciudadanos = 1;
		
		int grupo_izquierda = votos_psoe + votos_podemos;
		int grupo_derechas = votos_vox + votos_pp + votos_ciudadanos;
		int total = grupo_izquierda + grupo_derechas;
		
		int porcentaje_izquierda = (grupo_izquierda*100)/total; 
		int porcentaje_derechas = (grupo_derechas*100)/total; 

		System.out.println("Los votos de la izquierda son " + grupo_izquierda + " que constituyen el " + porcentaje_izquierda + "% del total y los votos de la derecha son " + grupo_derechas + " que constituyen el " + porcentaje_derechas + "% del total");
	}

}
