package begginerLevel;

import java.util.Scanner;

public class FarFromOrigin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int x1 = sc.nextInt();   //
            int y1 = sc.nextInt();   //
            int x2 = sc.nextInt();   //
            int y2 = sc.nextInt();   //


            double m1 = Math.sqrt(x1 * x1 + y1* y1);
            double m2 = Math.sqrt(x2 * x2 + y2 * y2);

            if (m1 == m2) {

                System.out.println("Equal");
            } else if (m1 > m2) {
                System.out.println("Alex");
            }else
                System.out.println("Bob");


        }

    }
}
