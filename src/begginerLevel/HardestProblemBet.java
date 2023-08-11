package begginerLevel;

import java.util.Scanner;

public class HardestProblemBet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a < b && a < c) {
                System.out.println("Draw");
            } else if (a > b && b < c) {
                System.out.println("Bob");
            } else
                System.out.println("Alice");
        }
    }
}
