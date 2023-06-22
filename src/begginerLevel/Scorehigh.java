package begginerLevel;

import java.util.Scanner;

public class Scorehigh {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();


        while (t-- > 0) {


            int n = sc.nextInt();

            int a[] = new int[4];

            for (int i = 0; i< 4; i++) {

                a[i] = sc.nextInt();

            }

            int max = a[0];
            for(int i = 1; i < 4; i++) {
                if (a[i] > max) {

                    max = a[i];
                }
            }

            System.out.println(max);

        }
    }
}
