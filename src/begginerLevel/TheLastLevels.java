package begginerLevel;

import java.util.Scanner;

public class TheLastLevels {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            if (x <= 3) {
                System.out.println(x * y);

            }else if (x  % 3 ==0) {
                int r = (x/3) - 1;
                System.out.println(x * y + (r *z));

            } else if (x % 3 != 0) {
                int r = (x/3);
                System.out.println(x * y + (r *z));
            }
        }
    }
}
