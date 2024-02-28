package begginerLvevelSecondHalf;

import java.util.Scanner;

public class FinalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();

            int sum = 0;

            // Read and sum elements
            for (int i = 0; i < n; i++) {
                sum += sc.nextInt();
            }

            // Handle queries
            for (int i = 0; i < q; i++) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                sum += (l - r + 1) & 1;  // Bitwise AND with 1 for parity check
            }

            System.out.println(sum);
        }

        sc.close();
    }
}
