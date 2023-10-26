package begginerLevel;

import java.util.Scanner;

public class TheSquidGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t--> 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int min = Integer.MAX_VALUE;
            int sum = 0;
//            for (int i = 0; i < n; i++) {
//                arr[i] = sc.nextInt();
//            }
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] < min) {
                    min = arr[i];
                }
                sum += arr[i];
            }
            int total = sum - min;
            System.out.println(total);
        }
    }
}
