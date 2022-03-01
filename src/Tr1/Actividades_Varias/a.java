package Tr1.Actividades_Varias;

import java.util.Scanner;

class a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int number1=0;
        for(int i = 0; i<number; i = i+10){
            number1 = number1 + 1;
        }
        System.out.println(number1);
    }
}
