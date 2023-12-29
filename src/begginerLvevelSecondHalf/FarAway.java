package begginerLvevelSecondHalf;

import java.util.Scanner;

public class FarAway {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int  t = sc.nextInt();
        while(t--> 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            long res = 0L;
            for(int i : arr){
                res += Math.max(i-1, m -1);
            }
            System.out.println(res);
        }
    }
}
