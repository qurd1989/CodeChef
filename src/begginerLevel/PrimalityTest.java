package begginerLevel;

import java.util.Scanner;

public class PrimalityTest {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();

            if (n < 2) {
                System.out.println("no");
                continue;
            }
            boolean falg = false;
            for (int i = 2; i < n; i++) {

                if (n % i == 0) {
                    falg = true;

                }
            }

            if (!falg) {
                System.out.println("yes");
            } else
                System.out.println("no");
        }
    }
}



