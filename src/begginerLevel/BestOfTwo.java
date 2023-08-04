package begginerLevel;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class BestOfTwo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            int alice[] = new int[3];
            int bob[] = new int[3];

            for (int k = 0; k < 3; k++) {

                alice[k] = sc.nextInt();
            }
            for (int k = 0; k < 3; k++) {

                bob[k] = sc.nextInt();

            }
            int aliceWin = solve(alice);
            int bobWin = solve(bob);

       /*     System.out.println(aliceWin);
            System.out.println(bobWin);*/

            if (aliceWin > bobWin) {
                System.out.println/**/("Alice");
            }else if (aliceWin < bobWin) {
                System.out.println("Bob");
            }else
                System.out.println("Tie");
        }


    }

    public  static int solve(int arr[]) {
        int max1 = Math.min(arr[0], Math.min(arr[1], arr[2]));

        int max2 = arr[0] + arr[1] + arr[2] - max1;

  /*      System.out.println(max2);*/

        return max2;
    }

    //  The code below optimized
    /*Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

        int aliceScore = solve(sc);
        int bobScore = solve(sc);

        if (aliceScore > bobScore) {
            System.out.println("Alice");
        } else if (aliceScore < bobScore) {
            System.out.println("Bob");
        } else {
            System.out.println("Tie");
        }
    }
}
    public static int solve(Scanner sc){

        int arr[] = new int[3];
        for(int i = 0; i <3; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[0] + arr[1]);
        return arr[1] + arr[2];
    }*/
}
