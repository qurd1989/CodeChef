package basicProgrammingOne;

import java.util.Scanner;

public class NumberOfRectangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            long n = sc.nextInt();
            long  m = sc.nextInt();

            long ans = n * m * ( n + 1 ) * ( m + 1 ) / 4 - n * m;
            System.out.println(ans);
        }
    }
}
