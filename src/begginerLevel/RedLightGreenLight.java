package begginerLevel;

import java.util.Scanner;

public class RedLightGreenLight {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int arr[] = new int[n];
            int count =0;
            for (int i= 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] > k) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
