package begginerLevel;

import java.util.Scanner;

public class ChefAndHisFruitSalad {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i =0; i < t; i++){

            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x / 2 > y) {
                System.out.println(x /2);
            }else
                System.out.println(x);
        }

    }
}
