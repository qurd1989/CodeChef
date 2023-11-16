package begginerLvevelSecondHalf;

import java.util.Scanner;

public class ChefAndDolls {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {


            int n = sc.nextInt();

            int result = 0;

            for (int i = 0; i < n; i++) {
                int type = sc.nextInt();
                result ^= type;
            }
            System.out.println(result);

        }
    }
}
