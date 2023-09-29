package begginerLevel;

import java.util.Scanner;

public class HowManyDigitsDoIHave {
    public static void main(String[] args) {

        Scanner  sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(solve(n));
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
       if (count <= 3) {
           System.out.println(count);
       }else
           System.out.println("More than 3 digits");

    }

    public static int solve(int n) {

        String lengthOfInteger = Integer.toString(n);

        return lengthOfInteger.length();

    }

}
