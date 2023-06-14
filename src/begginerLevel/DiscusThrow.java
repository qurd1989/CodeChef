package begginerLevel;

import java.util.Scanner;

public class DiscusThrow {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

         int t = sc.nextInt();

         while (t-- > 0) {

             int a = sc.nextInt();
             int b = sc.nextInt();
             int c = sc.nextInt();

             int max = 0;
             if(a >= b && a >+ c) {

                 max = a;

             }else if (b > a && b > c) {

                 max = b;

             }else
                 max = c;
                 System.out.println(max);
         }


    }


}


