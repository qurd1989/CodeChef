package begginerLevel;

import java.util.Scanner;

public class CostOfGroceries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt(); // Number of items
            int x = sc.nextInt(); // Minimium freshness value an item should have
            int a[] = new int[n];
            int b[] = new int[n];

            int cost = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int j = 0; j < n; j++) {
                 b[j] = sc.nextInt();
            }
            for (int k =0; k < n; k++) {
                if (a[k] >= x) {
                    cost += b[k];
                }
            }
            System.out.println(cost);
        }
    }
}
