package begginerLvevelSecondHalf;

import java.util.Scanner;

public class FlatLand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  t = sc.nextInt();
        while(t--> 0){
            int n  =sc.nextInt();

            System.out.println(countSquares(n));
        }

    }
    public static int countSquares(int n) {
        int squares = 0;
        while (n >= 1){
            int s = (int)(Math.sqrt(n));

            int  remainingCircles =  n - s*s;
            squares++;
            System.out.println(squares);
            n = remainingCircles;

        }
        return squares;
    }
}
