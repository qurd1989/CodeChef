package begginerLevel;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TestScore {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();


            if( y % x == 0) {
                System.out.println("Yes");

            }else
                System.out.println("No");


        }
    }
}
