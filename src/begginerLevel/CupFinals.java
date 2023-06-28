package begginerLevel;

import java.util.Scanner;

public class CupFinals {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();


        while (t-- > 0) {

            int x = sc.nextInt();   //
            int y = sc.nextInt();   //
            int d = sc.nextInt();   //

            int skillDifferences = Math.abs(x -y);

            if (skillDifferences <= d) {

                System.out.println("Yes");
            }else

                System.out.println("No");

        }
    }
}
