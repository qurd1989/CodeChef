package begginerLvevelSecondHalf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AsymmetricSwaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[2*n];
            for (int i = 0; i < 2 * n; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int minValue = Integer.MAX_VALUE;
            for (int i = 2*n-1; i >= 0; i--){
                minValue = Math.min(minValue, ( arr[i]- arr[i - n+1]));
            }
            System.out.println(minValue);
        }
    }
}
