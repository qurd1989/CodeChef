package begginerLevel;

import java.util.Scanner;

public class MutatedMinions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int k = sc.nextInt();

            int count = 0;
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

                if ((arr[i] + k) % 7 == 0) {
                    count++;
                }

            }
            System.out.println(count);
        }
    }
}
