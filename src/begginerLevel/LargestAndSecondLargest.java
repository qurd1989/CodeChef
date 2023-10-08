package begginerLevel;

import java.util.Scanner;

public class LargestAndSecondLargest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t--> 0) {
            int n = sc.nextInt();

            int arr[] = new int[n];
            int max = Integer.MIN_VALUE;
            int secMax = Integer.MIN_VALUE;
            for (int i = 0; i <= n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] > max) {
                    secMax = max;
                    max = arr[i];
                }else if (secMax < arr[i] && max > arr[i]) {
                    secMax = arr[i];
                }
                }
            System.out.println(max + secMax);
            }
    }
}
