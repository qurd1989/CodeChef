package begginerLevel;

import java.util.Scanner;

public class Nameless {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int max = (x > 10) ? 3*x : 4 * x;
        System.out.println(max);

    }
}
