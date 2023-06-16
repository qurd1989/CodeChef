package begginerLevel;

import java.util.Scanner;

public class Hackerman {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int a = sc.nextInt();
            int y = sc.nextInt();

            int sum = a + y;

            if (!isPrime(sum)) {
                System.out.println("alice");
            }else
                System.out.println("Bob");

        }
    }
    public static boolean isPrime(int n) {

        boolean flag = false;


        if (n <= 1) {
            return flag = false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {

            if (n % i == 0) {
                return flag = true;
            }
        }
        return flag;
    }
}
