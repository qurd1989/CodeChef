package begginerLevel;

import java.util.Scanner;
public class ChessMatch {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println((2*(180 + n) - (a+b)));
        }
    }
}
