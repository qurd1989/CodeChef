package begginerLvevelSecondHalf;

import java.util.Arrays;
import java.util.Scanner;

public class WeirdModuloProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0) {
            // your code goes here
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int ans=a[0]%a[1];
            for (int i = 2; i < n; i++) {
                int b = a[i];
                ans %= b;
            }
            System.out.println(ans);
        }
    }
}
