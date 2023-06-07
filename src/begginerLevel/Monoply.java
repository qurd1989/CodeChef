package begginerLevel;

import java.util.Scanner;

public class Monoply {

    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int p = sc.nextInt();
            int q = sc.nextInt();
            int r = sc.nextInt();
            int s = sc.nextInt();

            if ((p + q + r) < s || (p + q + s) <r || (p + r + s) < q || (q + r + s) <p) {
                System.out.println("Yes");
            }else
                System.out.println("No");

        }
        }
}
