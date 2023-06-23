package begginerLevel;

import java.util.Scanner;

public class BlackJack {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            int r= 0;
            for (int i = 1; i <= 10; i++) {
                r = a + b +i;
                if (r ==21) {
                    System.out.println(i);
                    break;
                }
            }
            if(r != 21) {

                System.out.println(-1);

            }

        }
    }
}
