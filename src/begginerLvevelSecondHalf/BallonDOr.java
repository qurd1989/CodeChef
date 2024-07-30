package begginerLvevelSecondHalf;

import java.util.Scanner;

public class BallonDOr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int count = 0;
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                if (num == 2) {
                    count++;
                }
            }
            if (count % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
