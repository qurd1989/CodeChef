package begginerLevel;

import java.util.Scanner;

public class ItsMyServe {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            if ((x % y) == 0 || (x % y) == 1) {

                System.out.println("Alice");
            }else
                System.out.println("Bob");
        }
    }
}
