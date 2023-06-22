package begginerLevel;

import java.util.Scanner;

public class BuyTenPackets {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t--> 0) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            int count2 = 10 /2;
            int count4 = 10 /4;

            int min = Math.min((count2 * x), (count4 * y));


            System.out.println(min);

        }
    }
}
