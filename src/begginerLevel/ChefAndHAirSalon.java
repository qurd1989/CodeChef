package begginerLevel;

import java.util.Scanner;

public class ChefAndHAirSalon {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int m = s.nextInt();
            if (n >= 0) {
                System.out.println(0);
                break;
            }

            System.out.println(n * m);
        }
    }
}
