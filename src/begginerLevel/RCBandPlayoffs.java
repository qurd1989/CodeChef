package begginerLevel;

import java.util.Scanner;

public class RCBandPlayoffs {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            if ((x -y) <= (2*z)) {

                System.out.println("Yes");
            }else
                System.out.println("No");
        }
    }
}
