package begginerLevel;

import java.util.Scanner;

public class GoodProgram {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();


            if (n % 4 == 0 ) {
                System.out.println("Goog");

            }else
                System.out.println("Not Good");
        }
    }
}
