package begginerLevel;

import java.util.Scanner;

public class Codechef {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int count = 0;
        int b[] = new int[t];

        for (int i = 0; i < t; i++) {

             b[i] = sc.nextInt();
        }
        for (int j = 0; j < t; j++) {

            if (b[j] % 2 == 0) {

                count++;
            }
        }
            if (count > t/2) {
                System.out.println("READY  FOR BATTLE");

            }
            else
                System.out.println("NOT READY");


    }
}
