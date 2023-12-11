package begginerLvevelSecondHalf;

import java.util.Scanner;

public class PrimeReversal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int nm = sc.nextInt();
            String a = sc.next();
            String b = sc.next();

            int aZeros = 0;
            int bZeros = 0;
            for (int i = 0; i < nm; i++) {
                if (a.charAt(i) == '0') {
                    aZeros++;
                }
            }
            for (int i = 0; i < nm; i++) {
                if (b.charAt(i) == '0') {
                    bZeros++;
                }
            }
                if (bZeros == aZeros) {
                    System.out.println("YES");
                } else
                    System.out.println("NO");

        }
    }
}
