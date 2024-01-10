package begginerLvevelSecondHalf;

import java.util.Scanner;

public class DecoratingChristmasTree {
    static boolean[][][] dp = new boolean[109][109][109];

    static boolean canDecorateTreeDP(int N, int X, int Y) {
        if (N == 0) {
            return true;  // Base case: all leaves decorated
        }

        if (dp[N][X][Y]) {
            return dp[N][X][Y];  // Already calculated
        }

        // Early termination for insufficient ornaments
        if (X < 2 && X * 3 + Y < 3 * N) {
            return false;  // Not enough ornaments for remaining leaves
        }

        // Try option 1: 1 large ornament and 3 small ornaments
        if (X >= 1 && Y >= 3 && canDecorateTreeDP(N - 1, X - 1, Y - 3)) {
            return dp[N][X][Y] = true;
        }

        // Try option 2: 2 large ornaments
        if (X >= 2 && canDecorateTreeDP(N - 1, X - 2, Y)) {
            return dp[N][X][Y] = true;
        }

        return dp[N][X][Y] = false;  // No solution found
    }

    public static void main(String[] args)

    {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            int N = scanner.nextInt();
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            if (canDecorateTreeDP(N, X, Y)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}