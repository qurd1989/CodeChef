package begginerLevel;

import java.util.Scanner;

public class PrimalityTest {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();


            boolean falg = false;
            for (int i = 0; i < n /2; i++) {

                if (n % 2 == 0) {
                    falg = true;

                }
            }

            if (!falg) {
                System.out.println("No");
            }else
                System.out.println("Yes");
            }
        }
    }

