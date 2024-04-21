package begginerLvevelSecondHalf;

import java.util.Scanner;

public class ABalancedContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            int n = sc.nextInt();
            int p = sc.nextInt();
            int participants[] = new int[n];
            for (int i = 0; i < n; i++){
                participants[i] = sc.nextInt();
            }
            int cakeWalk = 0;
            int hard = 0;
            for (int i =0; i < n; i++){
                if ((p/ 10 ) >= participants[i]){
                    hard++;
                }
                if ((p/2) <= participants[i]){
                    cakeWalk++;
                }
            }
            if (cakeWalk ==1 & hard == 2){
                System.out.println("Yes");
            }else
                System.out.println("No");
        }
    }
}
