package begginerLevel;

import java.util.Scanner;

public class GetLowestFree {

    public static void main(String[] args) {

        Scanner s=new Scanner (System.in);
        int n=s.nextInt();

        for(int i=0;i<n;i++) {

            int h = s.nextInt(); //
            int x = s.nextInt(); //
            int y = s.nextInt(); //

            System.out.println(solvwe(h, x, y));

        }

    }

    public  static int solvwe(int h, int x, int y) {

        if(h <= x && h <= y) {

            return x + y;

        }else if (x <= h && x <= y) {

            return  h + y;
        }else

            return h +x;

    }

}
