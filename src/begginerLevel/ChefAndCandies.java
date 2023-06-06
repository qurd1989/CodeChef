package begginerLevel;

import java.util.Map;
import java.util.Scanner;

public class ChefAndCandies {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        int t = sc.nextInt();
        while (t-- > 0) {

            // N i number of children
            // X candies  chef has

            int n = sc.nextInt();
            int x = sc.nextInt();

            int totalCandies = (n - x);

            if (totalCandies % 4 != 0) {

                System.out.println((n - x) / 4);
            }else

                System.out.println((n - x) / 4 +1);

        }
    }
}
