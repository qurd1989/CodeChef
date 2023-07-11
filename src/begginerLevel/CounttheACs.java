package begginerLevel;

import java.util.Scanner;

public class CounttheACs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int p = sc.nextInt();

            if ((p/ 100) + (p % 100) <= 10) {

                System.out.println((p/ 100) + (p % 100));
            }
            else
                System.out.println(-1);

        }
    }
}