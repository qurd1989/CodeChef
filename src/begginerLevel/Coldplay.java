package begginerLevel;

import java.util.Scanner;

public class Coldplay {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i=0; i < t; i++) {

            int n = sc.nextInt();
            int ccount = 0;
            int x = n;
            for (int k = 0; k < x; k++) {


                x = x / 10;
                ccount++;

            }
            System.out.println(ccount);
        }
    }
}
