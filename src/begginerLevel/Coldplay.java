package begginerLevel;

import java.util.Scanner;

public class Coldplay {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i=0; i < t; i++) {

            int m = sc.nextInt();
            int s = sc.nextInt();

            if (m < s) {
                System.out.println(0);
            }else
                System.out.println(m / s);
        }
    }
}
