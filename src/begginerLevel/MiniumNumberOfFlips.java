package begginerLevel;

import java.util.Scanner;

public class MiniumNumberOfFlips {

    public static void main(String[] args) {

        Scanner s=new Scanner (System.in);
        int n=s.nextInt();

        while (n-- > 0) {

            int a = s.nextInt(); //

            int arr[] = new int[a];
            int max = 0;
            for (int i = 0; i < a; i++) {

                arr[i] = s.nextInt();
                max = max + arr[i];
            }

                if (max % 2 == 0) {

                    System.out.println(Math.abs(max /2));
                }else
                    System.out.println(-1);


        }
    }
}
