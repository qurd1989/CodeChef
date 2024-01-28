package begginerLvevelSecondHalf;

import java.util.Scanner;

public class LazyJem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            long n = sc.nextLong();
            long b = sc.nextLong();
            long m = sc.nextLong();
            long totalTime = 0;
            while (n != 0) {
                if (n % 2 == 0) {
                    totalTime += (n / 2) * m;
                    n = n / 2;
                } else {
                    totalTime += ((n + 1) / 2) * m;
                    n = n - ((n + 1) / 2);
                }
                if (n != 0) {
                    totalTime += b;
                    m = 2 * m;
                }
            }
                System.out.println(totalTime);
            }

        }
}