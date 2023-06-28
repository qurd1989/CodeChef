package begginerLevel;

import java.util.Scanner;

public class OnlineOrOffline {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();


        while (t-- > 0) {

            int n = sc.nextInt();   //
            int m = sc.nextInt();

            double onlineOrderAfetDiscunt = n- (n * (0.1));

            if (onlineOrderAfetDiscunt > m) {
                System.out.println("Dining");
            } else if (onlineOrderAfetDiscunt < m) {
                System.out.println("Online");
            }else
                System.out.println("Either");

        }
    }
}
