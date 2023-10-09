package begginerLevel;

import java.util.Scanner;

public class nOtIMEtOwAIT {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int h = sc.nextInt();
            int x = sc.nextInt();

            int arr[] = new int[n];
            int ans = 0;
            for (int i = 0; i < n; i++) {
                arr[i] =sc.nextInt();
                if (arr[i] + x == h){
                    ans++;
                }
            }
            if (ans > 0) {
                System.out.println("Yes");
            }else
                System.out.println("No");
        }
    }
}
