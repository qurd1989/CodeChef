package begginerLvevelSecondHalf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DifficultyRatingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t--> 0) {
            int n = scanner.nextInt();
            int[] d = new int[n];

            for (int i = 0; i < n; i++) {
                d[i] = scanner.nextInt();
            }
            boolean isIncreasing = false;
            for (int i = 0; i< n; i++){
                if (d[i] > d[i +1]){
                    isIncreasing = true;
                    break;
                }
            }
            if (isIncreasing){
                System.out.println("No");
            }else
                System.out.println("Yes");
        }
    }
}
