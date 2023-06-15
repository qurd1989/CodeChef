package begginerLevel;

import java.util.Scanner;

public class MaximiseTheTastiness {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t  = sc.nextInt();

        while (t--> 0) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            int firstIngredients = Math.max(a, b);
            int secondIngredients = Math.max(c ,d);

            System.out.println(firstIngredients + secondIngredients);
        }
    }
}
