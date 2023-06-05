package begginerLevel;

import java.util.Scanner;

public class ChefAndNextGen {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int powerForEachYear = a *b;
            int heliumTotal = x * y;

            if(powerForEachYear > heliumTotal) {

                System.out.println("No");
            }else
                System.out.println("Yes");
        }
    }
}
