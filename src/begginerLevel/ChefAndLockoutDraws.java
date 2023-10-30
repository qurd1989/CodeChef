package begginerLevel;

import java.util.Arrays;
import java.util.Scanner;

public class ChefAndLockoutDraws {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        for(int i=0; i<t; i++) {
            int n = read.nextInt();
            int arr[] = new int[n-1];
            for (int k = 0; k < n; k++) {
                arr[k] = read.nextInt();
            }
            if (n >= 3) {
                Arrays.sort(arr);

                if (arr[0] + arr[1] == arr[2]) {
                    System.out.println("Yes");
                } else
                    System.out.println("No");
            }else
                System.out.println("No");

        }
    }
}
