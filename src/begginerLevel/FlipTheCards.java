package begginerLevel;

import java.util.Scanner;

public class FlipTheCards {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int x = sc.nextInt();

            int sum = Math.min(x, n -x);

            System.out.println(sum);
        }
    }
}
