package begginerLevel;

import java.util.Scanner;

public class CyclicQuadrilateral {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int a = sc.nextInt();   //
            int b = sc.nextInt();   //
            int c = sc.nextInt();   //
            int d = sc.nextInt();   //


            int oppsiteAngles = a + c;
            int oppsiteAngles1 = b + d;

            if (oppsiteAngles1 == 180 && oppsiteAngles == 180) {
                System.out.println("Yes");
            }else
                System.out.println("No");

        }

    }
}
