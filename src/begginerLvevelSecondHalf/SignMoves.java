package begginerLvevelSecondHalf;

import java.util.Scanner;

public class SignMoves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int ans = n / 2;
            if (n % 2 == 1) {  // Check for odd numbers
                ans = -(n + 1) / 2;
            }
            System.out.println(ans);
        }
    }
}

