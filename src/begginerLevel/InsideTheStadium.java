package begginerLevel;

import java.util.Arrays;
import java.util.Scanner;

import static begginerLevel.Sample.solve;

public class InsideTheStadium {
    public static int calculateStrikeRate(int N, int[] A) {
        int totalRuns = 0;
        int count = 0;

        for (int i = 0; i < N; i++) {
            totalRuns += A[i];
            double currentStrikeRate = ((double) totalRuns / (i + 1)) * 100;

            if (currentStrikeRate == 100.0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();  // Number of test cases

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();  // Total number of balls played
            int[] A = new int[N];  // Array to store runs scored on each ball

            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }

            int count = calculateStrikeRate(N, A);
            System.out.println(count);
        }
    }
    }