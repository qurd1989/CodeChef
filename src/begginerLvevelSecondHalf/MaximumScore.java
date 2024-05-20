package begginerLvevelSecondHalf;

import java.util.Scanner;

public class MaximumScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
            int binaryArray[] = new int[n];
            int score = 0;
            int zeroCount  =0;
            int min;
            for (int i = 0; i < n; i++){
                binaryArray[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++){
                if (binaryArray[i] == 0){
                    zeroCount++;
                }else
                    score++;
            }
            min = Math.min(zeroCount, score);
            System.out.println(min);
        }
    }
}
