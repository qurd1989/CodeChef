package begginerLevel;

import java.util.Scanner;

public class HiidenNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of testcases

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); // Input number

            // Find A and B such that A * B = n
            int a = 1, b = n;
            for (int j = 2; j <= n; j++) {
                if (n % j == 0) {
                    a = j;
                    b = n / j;
                    break;
                }
            }

            System.out.println(a + " " + b);
        }
    }
}






