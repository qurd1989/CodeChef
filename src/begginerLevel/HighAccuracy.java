package begginerLevel;

import java.util.Scanner;

public class HighAccuracy {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int x = sc.nextInt();
            int y = x % 3;

            if(y == 0) {
                System.out.println(0);
            }else
                System.out.println(3-y);
        }
    }
}
