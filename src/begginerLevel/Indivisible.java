package begginerLevel;

import java.util.Scanner;

public class Indivisible {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();


            for (int i= 1; i <= 100; i++){

                if (a % i == 0 || b % i == 0 || c % i == 0) {
                   continue;
                }else
                    System.out.println(i);
                break;
            }
        }
    }
}
