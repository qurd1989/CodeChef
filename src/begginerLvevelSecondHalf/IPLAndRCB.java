package begginerLvevelSecondHalf;

import java.util.Scanner;

public class IPLAndRCB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0){
            // RCB  needs a min of X  more point
            // Y are remaining matches
            // Win = 2, Tie = 1; Loss = 0;
            int x = sc.nextInt(); // x  point required for qualification
            int y = sc.nextInt(); // Y remaining matches!
            if (x >= y){
                System.out.println(x - y);

            }else
                System.out.println(0);
        }
    }
}
