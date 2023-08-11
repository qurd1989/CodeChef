package begginerLevel;

import java.util.Scanner;

public class HardestProblemBet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a < b && a < c) {
            System.out.println("Alice");
        }else if (a > b && b < c) {
            System.out.println("Bob");
        }else
            System.out.println("Draw");
    }
}
