package AceptaElReto;
import java.util.*;
public class AE149 {
    static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (sc.hasNext()){
            int n_toros = sc.nextInt();
            int vel = 0;
            int entrada = 0;
            for (int i = 0; i < n_toros; i++){
                entrada = sc.nextInt();
                if (vel < entrada){
                    vel = entrada;
                }
            }
            System.out.println(vel);
        }
    }
}
