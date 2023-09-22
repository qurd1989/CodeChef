package begginerLevel;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int zeros = 0;
            int c = 5;


            while ((n/c) > 0) {
                zeros += ( n /c);
                c = c *5;
            }

            System.out.println(zeros);
        }
    }
}
