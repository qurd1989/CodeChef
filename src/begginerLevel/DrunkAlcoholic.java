package begginerLevel;

import java.util.Scanner;

public class DrunkAlcoholic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int k = sc.nextInt();
            int steps =0;
            for (int i = 1; i<=k; i++)
            {
                if (i % 2 == 1) {
                    steps +=3;

                }else
                    steps--;

            }
            System.out.println(steps);
        }

    }
}
