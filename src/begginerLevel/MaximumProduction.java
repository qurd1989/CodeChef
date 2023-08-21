package begginerLevel;

import java.util.Scanner;

public class MaximumProduction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t--> 0) {

            int d = sc.nextInt(); // d is number of days
            int x = sc.nextInt(); // x units of work
            int y = sc.nextInt(); // y is second way of units of work
            int z = sc.nextInt(); // z is third way of units of work

            if(7*x>=(d*y)+((7-d)*z))
                System.out.println(7*x);
            else
                System.out.println((d*y)+((7-d)*z));
        }
    }
}
