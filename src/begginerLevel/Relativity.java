package begginerLevel;

import java.util.Scanner;

public class Relativity {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int p = sc.nextInt();
            int c = sc.nextInt();
            int height = (c * c) /(2 * p);
            System.out.println(height);
        }
    }
}
