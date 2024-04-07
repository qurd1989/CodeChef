package begginerLvevelSecondHalf;

import java.util.Scanner;

public class MixingExtraordinaire {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
             long drinks[] = new long[n];
             long sum = 0;
             for (int i = 0; i < n; i++){
                 drinks[i] = sc.nextInt();
             }
             for (int i = 0; i < n; i++){
                 long combination = 0;
                 for (int j = i + 1; j < n; j++){
                     combination= drinks[i] * drinks[j];
                     sum += combination;
                 }
             }
            System.out.println(sum);
        }
    }
}
