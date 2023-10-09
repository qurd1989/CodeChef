package begginerLevel;

import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            int n = sc .nextInt();

            int sum = 0;
            int maxSum = 0;
            int arr[] = new int[n];
            for (int i = 0; i <n;i++) {
                arr[i] =sc.nextInt();
            }
            for (int i= 0; i < n-1 ; i++){
                sum = arr[i] + arr[i +1];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
            int lastandfirstElemtn = arr[0] + arr[n-1];
            if (lastandfirstElemtn > maxSum) {
                System.out.println(lastandfirstElemtn);
            }else
                System.out.println(maxSum);
        };
    }
}
