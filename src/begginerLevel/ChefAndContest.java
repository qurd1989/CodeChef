package begginerLevel;

import java.util.Scanner;

public class ChefAndContest {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int p = sc.nextInt();
            int q = sc.nextInt();
            int chef = x +(p * 10);
            int chefina = y + (q * 10);

            if (chefina < chef ) {
                System.out.println("Chefina");
            }else if (chefina > chef) {
                System.out.println("Chef");
            }else
                System.out.println("Draw");
        }
    }
}
