package begginerLvevelSecondHalf;

import java.util.Arrays;
import java.util.Scanner;

public class TableStrength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            int ans = 0;
            for (int i = 0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            for (int i = 0; i < n / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[n - i - 1];
                arr[n - i - 1] = temp;
            }
            for (int i = 0; i < n; i++){
                ans = Math.max(ans, arr[i] *(i+1));
            }
            System.out.println(ans);
        }
    }
}
