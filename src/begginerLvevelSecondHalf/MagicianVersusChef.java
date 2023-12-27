package begginerLvevelSecondHalf;

import java.util.Scanner;

public class MagicianVersusChef {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int coinPosition = sc.nextInt();  // Store coin's position separately
            int s = sc.nextInt();
            while (s-- > 0) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (coinPosition == a) {
                    coinPosition = b;  // Update coin's position if involved in swap
                } else if (coinPosition == b) {
                    coinPosition = a;  // Update coin's position if involved in swap
                }
            }
            System.out.println(coinPosition);
        }

    }
}
