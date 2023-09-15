package begginerLevel;

import java.util.Scanner;

public class BadmintonServes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- >0) {
            int  p = sc.nextInt();

            System.out.println((p / 2) + 1);

        }
    }
}
