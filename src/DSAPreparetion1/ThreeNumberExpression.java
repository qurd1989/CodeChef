package DSAPreparetion1;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class ThreeNumberExpression {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            if ((a + b) == c || (a + c) == b || (b + c) == a) {
                System.out.println("Yes");
            }else
                System.out.println("No");
        }
    }
}
