package begginerLevel;

import java.util.Scanner;

public class ChefAndBirdFarm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

             int chickenLegs = sc.nextInt();
             int duckLegs = sc.nextInt();
             int totalLegsOfAllBirds  = sc.nextInt();

             if (totalLegsOfAllBirds % chickenLegs == 0 && totalLegsOfAllBirds % duckLegs == 0) {
                 System.out.println("ANY");

             }else if (totalLegsOfAllBirds % chickenLegs == 0 && totalLegsOfAllBirds % duckLegs != 0){

                 System.out.println("Chicken");

             }else if ((totalLegsOfAllBirds % chickenLegs != 0 && totalLegsOfAllBirds % duckLegs == 0)) {

                 System.out.println("Duck");
             }else

                 System.out.println("None");
        }
    }
}
