package begginerLevel;

import java.io.PrintStream;
import java.util.Scanner;

public class AreaOrPerimeter {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int b = sc.nextInt();

        int area = b * l;
        int peri = 2 * (l +b);

        if (area > peri) {
            System.out.println("Area\n" + area);
        } else if (area < peri) {
            System.out.println("Peri\n" + peri);
        }else
            System.out.println("Eq\n" + area);
    }
}
