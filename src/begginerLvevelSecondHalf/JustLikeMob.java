package begginerLvevelSecondHalf;

import java.util.Scanner;

public class JustLikeMob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();
            int lot = ((k-1) *n) + (n +m);
            int times = (x + lot -1) /lot;
            if ((x-1) < (lot * times)- (n + m)){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
