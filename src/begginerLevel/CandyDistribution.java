package begginerLevel;

import java.util.Scanner;

public class CandyDistribution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t--> 0) {

            int n = sc.nextInt(); // N is number of Candies
            int m = sc.nextInt(); // M is number of Friends candies should be distributed.

            if (n % m== 0 && n % 2==0) {
                System.out.println("Yes");

            }else
                System.out.println("No");
        }
    }
}
