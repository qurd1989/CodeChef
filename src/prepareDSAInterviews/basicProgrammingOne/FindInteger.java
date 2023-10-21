package basicProgrammingOne;

import java.util.Scanner;

public class FindInteger {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            int k = sc.nextInt();

            //  Length of candy is N
            // Each bite is K
            // First case: if N is less than k return  0
            // Second case:  t = n - k if t < k return -1
            if (n % k == 0) {
                System.out.println(n / k);
            } else
                System.out.println(-1);
        }
    }

}