package begginerLevel;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.AbstractMap;
import java.util.Scanner;

public class Tekken {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int BandCScore = Math.max(b, c) - Math.min(b,c);
            if (BandCScore >= a){
                System.out.println("No");

            }else
                System.out.println("Yes");
        }
    }
}
