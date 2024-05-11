package begginerLvevelSecondHalf;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumAlternatingSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int firstHalf = 0;
            int secondHalf = 0;
            int x = n/2;
            for (int i = 0; i < x; i++){
                firstHalf += arr[i];
            }
            for (int i = x; i < n; i++){
                secondHalf += arr[i];
            }
            System.out.println(secondHalf -firstHalf);
        }
    }
}
