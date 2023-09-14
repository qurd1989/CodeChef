package begginerLevel;

import java.util.Scanner;

public class TotalExpenses {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            float quantity = sc.nextInt();
            float price  = sc.nextInt();

            if (quantity > 1000) {
                System.out.println(quantity * 0.9 * price);
            }else
                System.out.println(quantity * price);
        }
    }
}
