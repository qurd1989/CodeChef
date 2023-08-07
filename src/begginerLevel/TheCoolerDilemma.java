package begginerLevel;

import java.util.Scanner;

public class TheCoolerDilemma {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            int x = sc.nextInt();
            int y = sc.nextInt();



            if (y % x == 0) {
                System.out.println(y / x);
            }else
                System.out.println((y /x) -1);
        }
    }
}
