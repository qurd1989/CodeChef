package begginerLevel;

import java.util.Scanner;

public class OddsAndEvens {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int p = sc.nextInt();
            int c = sc.nextInt();

            if ((p + c) % 2 ==0) {
                System.out.println("Bob");
            }else
                System.out.println("Alice");
        }
    }
}
