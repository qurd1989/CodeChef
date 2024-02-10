package begginerLvevelSecondHalf;

import begginerLevel.MalivkaIsPeculiarAboutColorOfBallons;

import java.util.Scanner;

public class XorPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {

            int n = sc.nextInt();
            String s = sc.next();
            int count = 0;
            for (int i = 0; i < n/2; i++) {
                if (s.charAt(i) != s.charAt(n - i - 1)) {
                    count++;
                }
            }
            System.out.println((count+1)/2);
        }
    }
}
