package begginerLevel;

import java.util.Scanner;

public class CredCoins {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int t  = sc.nextInt();

        while (t-- > 0) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            // i earn X CRED coins
            // a bag is worth 100 CRED coins
            //  Chefv pays Y numbers of bills using CRED.

            int total = (x * y)/100;

            System.out.println(total);
        }

    }
}
