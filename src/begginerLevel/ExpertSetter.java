package begginerLevel;

import java.util.Scanner;

public class ExpertSetter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            double total =  (double) x/y;


            if (total >= 0.5) {
                System.out.println("Yes");

            }else
                System.out.println("No");

        }
    }
}
