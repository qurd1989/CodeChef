package begginerLvevelSecondHalf;

import java.util.Scanner;

public class DividingStamps {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        long nSum = (long)n * (n + 1) /2;
        long sum = 0;
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        if (nSum == sum){
            System.out.println("YES");
        }else
            System.out.println("NO");
    }
}
