package begginerLevel;

import java.util.Scanner;

public class CanReach {

    public static void main(String[] args) {

        {
            Scanner read = new Scanner(System.in);
            int t = read.nextInt();
            for (int i = 0; i < t; i++) {
                int x = read.nextInt();
                int y = read.nextInt();
                int K = read.nextInt();

                if ((y % K) == 0 && (x % K) == 0) {
                    System.out.println("Yes");
                } else
                    System.out.println("No");
            }
        }
    }
}