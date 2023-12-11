package begginerLvevelSecondHalf;

import java.util.Scanner;

public class CandyLove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            int n = sc.nextInt();
            int candyBar[] = new int[n];
            long  sum = 0;
            for (int i = 0; i < n; i++) {
                candyBar[i] = sc.nextInt();
                 sum += candyBar[i];
            }
            if (sum % 2 != 0){
                System.out.println("YES");
            }else
                System.out.println("NO");
        }
    }
}
