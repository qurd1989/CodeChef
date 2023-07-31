package begginerLevel;

import java.util.Scanner;

public class SingelUSeAttack {


    public static void main(String[] args) {

        Scanner s=new Scanner (System.in);
        int n=s.nextInt();

        for(int i=0;i<n;i++) {

            int h = s.nextInt(); // Boss Healthy
            int x = s.nextInt(); // X is Health reduced
            int y = s.nextInt(); //

            int count = 1;

            h = h - y;

            while (h > 0) {

                h = h -x;

                count++;
            }

            System.out.println(count);

        }
    }
}
