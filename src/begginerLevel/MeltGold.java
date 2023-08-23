package begginerLevel;

import java.util.Scanner;

public class MeltGold{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int trmp = 0;
          while (x > y) {

              y += trmp;

          }
            System.out.println(trmp);

        }
    }
}
