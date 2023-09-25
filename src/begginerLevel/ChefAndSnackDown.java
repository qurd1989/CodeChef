package begginerLevel;

import java.util.Scanner;

public class ChefAndSnackDown {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int[] contestYear = {2010, 2015, 2016, 2017, 2019};

            boolean flag = false;
            for (int i = 0; i < contestYear.length; i++) {
                if (contestYear[i] == n) {

                    flag = true;
                }
            }
            if (flag) {
                System.out.println("HOSTED");
            } else
                System.out.println("NOT HOSTED");
        }
    }
}
