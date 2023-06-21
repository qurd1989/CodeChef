package begginerLevel;

import java.util.Scanner;

public class ChnageRowAndColumnBoth {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t--> 0) {

            int sx = sc.nextInt();
            int sy = sc.nextInt();
            int ex = sc.nextInt();
            int ey = sc.nextInt();

            if (sx != ex && sy != ey) {
                System.out.println(1);
            }else
                System.out.println(2);
        }
    }
}
