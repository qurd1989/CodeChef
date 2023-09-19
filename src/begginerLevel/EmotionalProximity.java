package begginerLevel;

import java.util.Scanner;

public class EmotionalProximity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0 ){
            long p = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();
            long z = sc.nextLong();

            double ans = p;

            if( z == 0 ){

                ans -= (p * x) / 100.0;
            }
            else{

                ans += (p * y) / 100.0;

            }

            System.out.println( ans );

        }
    }
}

