package begginerLevel;

import java.util.Scanner;

public class MinimumPizzas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t  = sc.nextInt();

        while (t --> 0) {

            int n = sc.nextInt();
            int x = sc.nextInt();

            // N is a number of friends
            // x slices
            int totalSilces = n * x;
            int reminder = totalSilces / 4;
            if(totalSilces % 4 != 0) {

                System.out.println(reminder +1);

            }else
                System.out.println(reminder);

        }
    }
}
