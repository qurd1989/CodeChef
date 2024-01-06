package begginerLvevelSecondHalf;

import java.util.Arrays;
import java.util.Scanner;

public class MakeMoney {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       while (t--> 0) {
           int n = sc.nextInt();
           int x = sc.nextInt();
           int c = sc.nextInt();
           int bags[] = new int[n];
           for (int i =0; i<n; i++){
               bags[i] = sc.nextInt();
           }
           int totalCost = 0;
           int totalCoins = 0;
           Arrays.sort(bags);
           for (int i = 0; i < n; i++){
               int gain = x - bags[i];
               if(gain >= c) {
                   bags[i] = x;
                   totalCoins +=x;
                   totalCost +=c;
               }else
                   totalCoins += bags[i];

           }
           System.out.println(totalCoins - totalCost);
       }
    }
}
