package begginerLvevelSecondHalf;

import java.util.Arrays;
import java.util.Scanner;

public class PoweredParameters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr); // Sort the array
            long operations = 0;
            boolean possible = true;

            for (int i = 0; i < n; i++) {
                if (arr[i] > i + 1) {
                    possible = false; // It's impossible if any element is greater than its target
                    break;
                }
                operations += (i + 1) - arr[i]; // Calculate the number of increments needed
            }

            if (possible) {
                System.out.println(operations);
            } else {
                System.out.println(-1);
            }
        }
    }
}