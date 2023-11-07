package begginerLevel;

import java.util.Scanner;

public class BallsAndBoxes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int kTotal = k*(k + 1)/2;
            // I  have N balls
            // and K boxes
            if (n >=  kTotal){
                System.out.println("Yes");
            }else
                System.out.println("No");
        }
    }
}
