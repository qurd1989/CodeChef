package begginerLevel;

import java.util.Scanner;

public class MakeAAndBEqual {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a < b) {
                while (a < b) {
                    a *= 2;
                }
            } else if (a > b) {
                while (a > b) {
                    b *= 2;
                }
            }
            if (a == b) {
                System.out.println("Yes");
            } else
                System.out.println("No");
        }
    }
}

