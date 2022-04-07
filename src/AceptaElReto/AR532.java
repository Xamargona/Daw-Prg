package AceptaElReto;
import java.util.*;
public class AR532 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            int y = sc.nextInt();
            int z = sc.nextInt();
            System.out.println(z-y);
        }
    }
}
