package begginerLevel;

import java.util.Scanner;

public class Weights {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int w = sc.nextInt();   //
            int x = sc.nextInt();  //
            int y = sc.nextInt();  //
            int z = sc.nextInt();  //

            if (w ==x || w == y || w == z || (x+y) == w || (x +z) == w || (z + y) ==w || (x+y+z)==w) {
                System.out.println("Yes");
            }else
                System.out.println("No");
        }
    }
}
