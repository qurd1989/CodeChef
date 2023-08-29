package begginerLevel;

import java.lang.reflect.AccessibleObject;
import java.util.Scanner;

public class ChessFormat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int  t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a + b < 3) {
                System.out.println(1);
            }else if (3 <= (a + b) && (a + b) <= 10) {
                System.out.println(2);
            }else if (11 <= (a + b) && (a +b) <= 60) {
                System.out.println(3);
            }else
                System.out.println(4);
        }
    }
}
