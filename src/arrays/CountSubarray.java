package arrays;

import java.util.Scanner;

public class CountSubarray {
    public static int countSubarrays(int[] arr, int N, int K) {
        // Write your code here
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int K = scanner.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // Calculate and store the count
        int count = countSubarrays(arr, N, K);
        System.out.println(count);

        // Close scanner (optional)
        scanner.close();
    }
}

