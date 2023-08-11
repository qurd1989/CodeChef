package begginerLevel;

import java.util.Scanner;

public class CarsAndBikes {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        int  t = sc.nextInt();
        for (int i = 0; i < t; i++) {

            int n = sc.nextInt();
            if ((n % 4) == 0) {
                System.out.println("no");
            }else if((n % 4) % 2 == 0)
                System.out.println("Yes");
        }
    }
}
