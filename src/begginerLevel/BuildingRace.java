package begginerLevel;

import java.util.Scanner;

public class BuildingRace {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            float a = sc.nextInt();   //
            float b = sc.nextInt();   //
            float x = sc.nextInt();   //
            float y = sc.nextInt();   //


            float chefSpeed = a / x;
            float chefinaspeed = b / y;


            if (chefinaspeed < chefSpeed) {
                System.out.println("Chefina");
            }else if (chefinaspeed  > chefSpeed) {
                System.out.println("Chef");
            }else
                System.out.println("Both");
        }

    }
}
