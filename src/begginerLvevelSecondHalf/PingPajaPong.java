package begginerLvevelSecondHalf;

import java.util.Scanner;

public class PingPajaPong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int k = sc.nextInt();
            int totalScoreUntilNow = x + y;
            int ans = (int)Math.floor(totalScoreUntilNow /k);
            if (ans % 2 == 0) {
                System.out.println("Chef");
            }else
                System.out.println("Pojo");
        }
    }
}
