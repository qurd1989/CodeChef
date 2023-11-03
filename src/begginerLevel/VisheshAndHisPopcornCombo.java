package begginerLevel;

import java.util.Scanner;

public class VisheshAndHisPopcornCombo {

    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int b1 = sc.nextInt();
            int b2 = sc.nextInt();
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            int s1 = a1 + a2;
            int s2 = b1 + b2;
            int s3 = c1 + c2;
            int max = Math.max(s1, Math.max(s3,s2));
            System.out.println(max);
        }
    }
}
