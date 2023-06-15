package begginerLevel;

import java.util.Scanner;

public class GCDandLCM {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            long a = sc.nextInt();
            long b = sc.nextInt();

            long GCD = GCD(a, b);
            long LCD = LCM(a, b, GCD);

            System.out.println(GCD);
            System.out.println(LCD);
        }
    }

        public static  long GCD(long a, long b) {

        if (b == 0) {
            return a;

        }else
        return  GCD(b,a % b );
    }
    public static long LCM(long a, long b, long GCD){

        return (a * b) / GCD;
    }
}
