package begginerLevel;

import java.util.Scanner;

public class ChefDrinksTea {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int x = sc.nextInt(); // X liters tea Chef consumes daily
            int y = sc.nextInt(); // Y is capacity of the jar
            int z = sc.nextInt(); // Z amount Chef is charged when refill jar with tea

            System.out.println(x/y);
             if(y >= x) {
                 System.out.println(z);

             } else if ( x> y && x % y == 0) {
                 System.out.println(z*(x/y));

             } else if(x > y && x % y != 0) {

                 System.out.println(z *((x/y) + 1));

             }
             }
        }
    }

