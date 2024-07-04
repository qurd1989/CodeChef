package begginerLvevelSecondHalf;

import java.util.Arrays;
import java.util.Scanner;

public class DoubledDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            if (canBeReordered(arr)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
    public static boolean canBeReordered(int[] arr) {
        Arrays.sort(arr);

        // Check differences after sorting
        int[] diffs = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            diffs[i] = arr[i + 1] - arr[i];
        }

        // Check the given conditions for diffs
        for (int i = 1; i < diffs.length; i++) {
            if (diffs[i] != 2 * diffs[i - 1] && 2 * diffs[i] != diffs[i - 1]) {
                return false;
            }
        }
        return true;
    }
}