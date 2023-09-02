package begginerLevel;

import java.util.Scanner;

public class SummerHit {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {

            int xa = sc.nextInt();
            int xb = sc.nextInt();
            int xA = sc.nextInt();
            int xB = sc.nextInt();

            int TypeA = xA / xa;
            int TypeB = xB / xb;

            System.out.println(TypeA + TypeB);
        }

    }
}
