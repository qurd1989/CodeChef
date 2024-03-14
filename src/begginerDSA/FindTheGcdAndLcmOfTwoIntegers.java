package begginerDSA;

import java.util.Scanner;

public class FindTheGcdAndLcmOfTwoIntegers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int a = sc.nextInt();
            int  b =sc.nextInt();

            int gcd = (a * b) /gcd(b,a);
            System.out.println(gcd(b, a)+ " " + gcd);

        }

    }
    public static int gcd(int b, int a){
        if (b == 0){
            return a;
        }

        while(b != 0){
            int n = b;
            b = a%b;
            a = n;
        }
        return a;
    }
}
