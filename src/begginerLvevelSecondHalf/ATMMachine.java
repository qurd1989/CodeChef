package begginerLvevelSecondHalf;

import java.util.Scanner;

public class ATMMachine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            // ATM contains total k amount of money
            // Number want to withdraw money
            int k = sc.nextInt();

            int arr[] = new int[n];
            int result[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++){
                if (arr[i] <= k) {
                   k -= arr[i];
                   result[i] =1;
                }else
                    result[i] = 0;
            }
            for (int i = 0; i < n; i++) {
                System.out.print(result[i]);
            }
            System.out.println();
        }

    }
}

