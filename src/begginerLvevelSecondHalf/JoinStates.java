package begginerLvevelSecondHalf;

import java.util.Scanner;

public class JoinStates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int sum = 0;
            int ans = 0;
            for (int i = 0; i < n; i++){
                sum += arr[i];
                if (sum >= m){
                    ans++;
                    sum = 0;
                    continue;
                }
            }
            System.out.println(ans);
        }
    }
}
