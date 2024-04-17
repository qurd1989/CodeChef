package begginerLvevelSecondHalf;

import java.util.Scanner;

public class TheProductMystery {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0){
            long b = sc.nextLong();
            long c = sc.nextLong();
            long x = gcd(b, c);
            long m = c/ x;
            System.out.println(m);
        }
    }

    public static  long gcd(long b , long c) {
        if (c == 0){
            return b;
        }
        return gcd(c, b % c);
    }
    public static int minA(int b, int c) {
        int remainder = b % c;
        if (remainder == 0) {
            return 1; // B is already divisible by C
        }
        return minA(c, c - remainder); // Minimum of C or C minus the remainder
    }
}
