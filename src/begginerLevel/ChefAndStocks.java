package begginerLevel;

import java.util.Scanner;

public class ChefAndStocks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int  arr[] = new int[n];
            for (int i =0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            int sum = arr[0];
            int min = arr[0];
            for (int i = 1; i < n; i++){
                if (arr[i] < min) {
                    min = arr[i];
                }
                sum = sum + arr[i];
            }

            System.out.println(sum - min);
        }
    }
}
