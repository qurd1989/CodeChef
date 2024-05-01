package begginerLvevelSecondHalf;

import java.util.Scanner;

public class HungryChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int n = sc.nextInt();
            int r = sc.nextInt();
            int minCostNormal = x * n;
            if (r < minCostNormal) {
                System.out.println(-1);
            } else {
                // Calculate the maximum number of premium burgers Chef can buy
                int maxPremiumBurgers = (r - (n * x)) / (y - x);
                maxPremiumBurgers = Math.min(maxPremiumBurgers, n); // Ensure y ≤ N
                System.out.println(n-maxPremiumBurgers+" "+maxPremiumBurgers);
            }
        }
    }
}