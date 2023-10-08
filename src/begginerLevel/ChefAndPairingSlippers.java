package begginerLevel;

import java.util.Scanner;

public class ChefAndPairingSlippers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            int n = sc.nextInt();
            int l = sc.nextInt();// left slippers
            int x = sc.nextInt();// each pair of slippers cost x

            int totalPair = Math.min(l, (n -l)) * x;

            System.out.println(totalPair);
        }
    }
}
