package begginerLevel;

import java.util.Scanner;

public class Marathon {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int dDays = sc.nextInt();
            int dKilometer = sc.nextInt();
            int marathonOne = sc.nextInt();
            int marathonTwo = sc.nextInt();
            int marathonThree = sc.nextInt();

             int totalKilometer = dDays * dKilometer;

            if (totalKilometer >= 42) {
                System.out.println(marathonThree);
            } else if (totalKilometer <= 21 && 42 > totalKilometer) {
                System.out.println(marathonTwo);
            }else if (totalKilometer >= 10 && totalKilometer < 21){
                System.out.println(marathonOne);
            }else
                System.out.println(0);
        }
    }
}
