package begginerLevel;

import java.util.Scanner;

public class TooManyFloors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();


        while (t-- > 0) {

            int x = sc.nextInt();   //
            int y = sc.nextInt();   //

            int chefFloor = (int)Math.ceil((double) x /10);
            int chefFinalFloor = (int)Math.ceil((double) y/10);

            int floorDifference = chefFinalFloor - chefFloor;

            System.out.println(floorDifference);


        }
    }
}
