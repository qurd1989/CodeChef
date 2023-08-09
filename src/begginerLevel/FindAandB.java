package begginerLevel;

import java.util.Scanner;

public class FindAandB {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int x = s.nextInt();
            int y = s.nextInt();
            int z = s.nextInt();

            if ((x * y) % z == 0) {
                System.out.println((x * y) + " " + z);
            }else if ((x * z) % y == 0) {
                System.out.println((x * z) + " " + y);
            }else if ((y * z) % x == 0) {
                System.out.println((y * z) + " " + x);
            }else
                System.out.println(-1);

        }
    }
}
