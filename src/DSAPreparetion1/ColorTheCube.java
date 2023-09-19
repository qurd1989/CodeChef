package DSAPreparetion1;

import java.util.Scanner;

public class ColorTheCube {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            long sum = 0;
            int arr[] = new int[n];
            for (int j = 0; j <arr.length; j++) {
                arr[j] = sc.nextInt();

                arr[j] += sum;

            }
             long result = sum * (long)(Math.ceil(n)/2);
            System.out.println(result);
        }
    }
}
