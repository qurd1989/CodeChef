package begginerLevel;

import java.util.Scanner;

public class ChefAndWaterBottles {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt(); // Chef has N empty bottles
            int x = sc.nextInt(); // Each bottle capacity is X liters.
            int k = sc.nextInt(); // Water tank is having K liters of water

            if (x > x) {
                System.out.println(0);
            }else if (n * x > k) {

                System.out.println(k/x);
            }else
                System.out.println(n);


        }

    }
}
