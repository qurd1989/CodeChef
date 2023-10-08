package begginerLevel;

import java.util.Scanner;

public class Existence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-->0) {
            long x = sc.nextInt();
            long  y = sc.nextInt();

            long xVeriable =(int) (x*x*x*x + 4* Math.pow(y, 2));
            long yVeriable = (int)(4 * Math.pow(x,2) * y);

            if (xVeriable == yVeriable) {

                System.out.println("Yes");
            }else
                System.out.println("No");
        }
    }
}
