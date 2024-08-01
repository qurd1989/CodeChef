package begginerLvevelSecondHalf;

import java.util.Collections;
import java.util.Scanner;

public class TheAttackOfQueen {

    public static void main(String[] args) {

        Scanner scc = new Scanner(System.in);
        int t = scc.nextInt();
        while(t--> 0){
            int N = scc.nextInt();
            int X = scc.nextInt();
            int Y = scc.nextInt();
            int sum = N-1+N-1;
            sum += Math.min(Math.abs(X-1),Math.abs(Y-1));
            sum += Math.min(Math.abs(X-1),Math.abs(Y-N));
            sum += Math.min(Math.abs(X-N),Math.abs(Y-1));
            sum += Math.min(Math.abs(X-N),Math.abs(Y-N));
            System.out.println(sum);

        }
    }
}
