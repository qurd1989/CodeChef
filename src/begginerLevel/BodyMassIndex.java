package begginerLevel;

import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {

           Scanner sc = new Scanner(System.in);
    int  t = sc.nextInt();
        for (int i = 0; i < t; i++) {
        int m = sc.nextInt();
        int h = sc.nextInt();

        double bodyMassIndex = m / Math.pow(h, 2);

        if (bodyMassIndex  <= 18) {
        System.out.println(1);
        }else if (19 <= bodyMassIndex && bodyMassIndex <= 24) {
        System.out.println(2);
        }else if (25 <= bodyMassIndex && bodyMassIndex <= 29) {
        System.out.println(3);
        }else
        System.out.println(4);
        }
        }
        }
