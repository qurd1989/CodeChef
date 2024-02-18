package begginerLvevelSecondHalf;

import com.sun.jdi.ArrayReference;

import java.util.Arrays;
import java.util.Scanner;

public class ChefAndEid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        int n = sc.nextInt();
        int coins[] = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }

        Arrays.sort(coins);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n-1; i++) {
            int diff = coins[i + 1] - coins[i];
            if (diff < min) {
                min = diff;
            }
        }
            System.out.println(min);
        }
    }
}