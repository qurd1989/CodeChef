package begginerLvevelSecondHalf;

import java.util.Scanner;

public class EvenSumSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            int sum = 0;
            for (int i = 0; i < n; i++){
                for (int j = i; j < n; j++){
                    int sum1 = 0;
                    for (int k = i; k <= j; k++){
                        sum1 += arr[k];
                    }
                    if (sum1 % 2 == 0){
                        sum++;
                    }
                }
            }
            System.out.println(sum);
        }
    }
}
