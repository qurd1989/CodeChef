package begginerLevel;

import java.util.Scanner;

public class TheBlockGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int orginalValue = n;

            if (n > 10) {
                System.out.println("Wins");
            }
            int rversed_n = 0, r = 0;
            while (n> 0) {
                rversed_n = rversed_n * 10 + n % 10;

                n = n /10;

            }

           if (orginalValue == rversed_n) {
               System.out.println("Wins");
           }else
               System.out.println("Loses");
        }

    }
}

