package begginerLevel;

import java.util.Scanner;

public class AOrB {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int a = sc.nextInt();   //
            int b = sc.nextInt();   //

            // A is 500 points
            // B is 1000 points

            int problemA = 500 - (a * 2) + (1000 - (4 * (a + b)));
            int problemB = 1000 - (b * 4) + (500 - (2 * (a + b)));

            int max = Math.max(problemB, problemA);
            System.out.println(max);

        }

    }
}
