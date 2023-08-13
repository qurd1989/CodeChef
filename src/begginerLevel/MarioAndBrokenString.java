package begginerLevel;

import java.util.Scanner;

public class MarioAndBrokenString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = sc.next();

            //Check if N is not divisible. print No  and terminate the code continue otherwise.
            if (n % 2 != 0) {
                System.out.println("No");
            }
            //declare 2 String to divide the String in middle
            String A = "";
            String B = "";
            //use loop to print substrings
            for (int k = 0; k < n/2; k++) {

                A = s.substring(0, n / 2);
                B = s.substring(n / 2, n);

            }

            //compare two substrings with equals() method
                if (A.equals(B)) {
                    System.out.println("Yes");
                }else
                    System.out.println("NO");
        }
    }
}
