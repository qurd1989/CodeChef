package begginerLevel;

import java.util.Scanner;

public class ChefAndRemissness {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while (t-->0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int max = Math.max(a, b);

            System.out.println(max + " " + a + b);
        }
    }
}
