package begginerLevel;

import java.util.Scanner;

public class NegativeProduct {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int t  = sc.nextInt();

        while (t--> 0) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if ((a * b) > 0 || (a * c) > 0 || (c * b) > 0) {
                System.out.println("No");
            }else
                System.out.println("Yes");
        }

    }
}
