package begginerLvevelSecondHalf;

import java.util.Scanner;

public class DiceDeception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases
        while (T-- > 0) {
            int N = scanner.nextInt(); // Number of dice
            int K = scanner.nextInt(); // Maximum number of flips
            int[] dice = new int[N];

            for (int i = 0; i < N; i++) {
                dice[i] = scanner.nextInt();
            }
            System.out.println(maximizeDiceSum(N, K, dice));
        }
        scanner.close();
    }
    private static int maximizeDiceSum(int N, int K, int[] dice) {
        int[] count = new int[7]; // To count occurrences of each number from 1 to 6
        // Count occurrences of each face
        for (int i = 0; i < N; i++) {
            count[dice[i]]++;
        }
        // Calculate maximum sum
        int sum = 0;
        for (int i = 1; i <= 6; i++) {
            sum += i * count[i];
        }
        // Apply flips
        int flips = K;
        int[] gains = {0, 5, 3, 1}; // Gain from flipping 1 -> 6, 2 -> 5, 3 -> 4
        for (int i = 1; i <= 3; i++) {
            while (flips > 0 && count[i] > 0) {
                sum += gains[i];
                count[i]--;
                flips--;
            }
        }
        return sum;
    }
}