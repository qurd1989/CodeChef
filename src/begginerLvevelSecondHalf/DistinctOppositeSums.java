package begginerLvevelSecondHalf;

import java.util.Scanner;

public class DistinctOppositeSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n / 2; i++) {
                arr[i] = i + 1;
            }
            for (int i = n / 2; i < n; i++) {
                arr[i] = n - (i - n/2);
            }
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

    }
}