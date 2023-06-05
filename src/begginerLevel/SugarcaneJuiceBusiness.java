package begginerLevel;

import java.util.Scanner;

public class SugarcaneJuiceBusiness {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        long t  = sc.nextInt();

        while (t-- > 0) {

            // 1 glass of juice for 50 coins
            //
            long n = sc.nextInt();

            long totalGlasses = 50 * n;

            long totalProfit = totalGlasses * (20 + 30 + 20)/100;

            System.out.println(totalGlasses - totalProfit);
        }
    }
}
