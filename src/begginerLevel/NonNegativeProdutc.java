package begginerLevel;

import java.util.Scanner;

public class NonNegativeProdutc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t--> 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
           int negativeNumber = 0;
           int zeroes = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 0) {
                   zeroes++;
                }
                if (arr[i] < 0) {
                    negativeNumber++;
                }
            }

            if (zeroes >= 1 ||negativeNumber % 2 ==  0) {
                System.out.println(0);
            } else
                System.out.println(1);
        }
    }
}
