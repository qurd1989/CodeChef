package begginerLevel;

import java.util.Scanner;

public class SpeedLimitTest {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();


        while (t-- > 0) {

            float a = sc.nextInt();   //
            float x = sc.nextInt();   //
            float b = sc.nextInt();   //
            float y = sc.nextInt();   //

             float aliceDistance =  (a / x);

             float  bobDistance =  b / y;

             if (aliceDistance > bobDistance) {

                 System.out.println("Alice");
             } else if (aliceDistance < bobDistance) {
                 System.out.println("Bob");
             }else
                 System.out.println("Equal");

        }

    }
}
