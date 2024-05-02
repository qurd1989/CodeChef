package begginerLvevelSecondHalf;

import java.util.Scanner;

public class ChefAndNumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
            int negativeCount = 0;
            int participants[] = new int[n];
            for (int i = 0; i < n; i++){
               participants[i] = sc.nextInt();
               if (participants[i] < 0){
                   negativeCount++;
               }
            }
            if (negativeCount == 0 || negativeCount == n){
                System.out.println(n +  " "  + n);
            } else if (negativeCount > Math.abs(n - negativeCount)) {
                System.out.println(n + " "  + (n - negativeCount));
            }else
                System.out.println((n - negativeCount) + " " + negativeCount);
        }
    }
}
