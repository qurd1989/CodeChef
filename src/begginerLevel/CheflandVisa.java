package begginerLevel;

import java.util.Scanner;

public class CheflandVisa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i =0; i < t; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y1 = sc.nextInt();
            int y2 = sc.nextInt();
            int z1 = sc.nextInt();
            int z2 = sc.nextInt();

            if (x1 >= x2  && y1 >= y2 && z1 >= z2) {
                System.out.println("Yes");
            }else
                System.out.println("No" +
                        "");
        }
    }
}
