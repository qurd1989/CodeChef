package begginerLevel;

import java.util.Scanner;

public class PoliceAndThief {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int  a = sc.nextInt();
            int  b = sc.nextInt();

           int total = Math.abs(a - b);

            System.out.println(total);
        }
    }
}
