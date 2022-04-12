package AceptaElReto.AR535;

import java.util.ArrayList;
import java.util.Scanner;

public class AR535 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = -1;
        while (true){

            x = sc.nextInt();

            if (x == 0){
                break;
            }
            int[] z = new int [x];
            for (int i = 0; i < x; i++) {
                z[i] = sc.nextInt();
            }
            int y = 0;
            for (int i = 0; i < z.length-1; i++) {
                y = y + (z[z.length-1] - z[i]);
            }
            System.out.println(y);
        }
    }
}
