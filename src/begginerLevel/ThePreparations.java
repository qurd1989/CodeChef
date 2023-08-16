package begginerLevel;

import java.util.Scanner;

public class ThePreparations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {

            int m = sc.nextInt();
            int n = sc.nextInt();
            int k = sc.nextInt();

            int watchTime = n * k;
            if (m > watchTime) {
                System.out.println("Yes");
            }else
                System.out.println("NO");
        }
    }
}
