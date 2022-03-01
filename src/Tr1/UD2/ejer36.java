package Tr1.UD2;

public class ejer36 {

	public static void main(String[] args) {
				
		for(int i = 1; i <= 8; i ++) {
			
			for(int j = 1; j <= 10; j ++){
				
				System.out.print("Capítulo " + i + "x" + j);
				
					if( i == 3 && j == 9) {
					
						System.out.print(": La boda roja");
					}
					
					if( i == 6 && j == 10) {
						
						System.out.print(": Vientos de invierno");
					}
				
				if(j==10) {
					System.out.println();
					System.out.println("...");
				}else{
					System.out.println();
				}
				
			}
		}
		
	}

}
