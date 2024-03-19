package begginerLvevelSecondHalf;

import java.util.Scanner;

public class MiniumumXOR {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while (t--> 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            int res = 0;
            for (int  i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                res ^= arr[i];
            }

            int ans = res;

            for (int value : arr){
                ans = Math.min(res^value, ans);
            }

            System.out.println(ans);
        }
    }
}
