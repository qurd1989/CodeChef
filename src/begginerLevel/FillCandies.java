package begginerLevel;

import java.util.Scanner;

public class FillCandies {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();// Chef has  N candies
            int k = sc.nextInt(); // A bag has K pockets
            int m = sc.nextInt();// Each pockets hold M candies

            int totalPockets = k * m;

            if (n % totalPockets == 0) {
                System.out.println(n/totalPockets);
            }else
                System.out.println(n/totalPockets+1);


        }
    }
}
