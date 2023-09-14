package begginerLevel;

import java.util.Scanner;

public class ConstructN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();

            if (n < 7 && n % 2 != 0) {
                System.out.println("No");
            }else
                System.out.println("Yes");
        }
    }
}
