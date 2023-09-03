package begginerLevel;

import java.util.Scanner;

public class EqualIntegers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            long a = sc.nextLong();
            long b = sc.nextLong();

            int difference = (int) Math.abs(a-b);
            System.out.println(difference);

        }
    }
}
