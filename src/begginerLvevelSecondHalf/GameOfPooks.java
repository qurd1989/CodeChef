package begginerLvevelSecondHalf;

import java.util.Scanner;

public class GameOfPooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n == 1) {
                System.out.println(1);
            } else if (n < 4) {
                System.out.println(n - 1);
            } else {
                System.out.println(n);
            }
        }
    }
}

