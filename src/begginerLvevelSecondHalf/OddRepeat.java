package begginerLvevelSecondHalf;

import java.util.Scanner;

public class OddRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long s = sc.nextLong();

            long sum = (long) Math.pow(n, 2);
            long ans = 0, j = 1;
            for (int i = 0; i < n; i++) {
                if (((sum - j) + (k * j)) == s) {
                    ans = j;
                    break;
                }
                j = j + 2;
            }
            System.out.println(ans);
        }

    }
}
