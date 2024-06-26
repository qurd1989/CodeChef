package begginerLvevelSecondHalf;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntPredicate;

public class TruthAndDare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0){
            int tr1 = sc.nextInt();
            int tr2[] = new int[tr1];
            for (int i = 0; i < tr1; i++){
                tr2[i] = sc.nextInt();
            }
            int dr1 = sc.nextInt();
            int dr2[] = new int[dr1];
            for (int i = 0; i < dr1; i++){
                dr2[i] = sc.nextInt();
            }
            int ts1 = sc.nextInt();
            int ts2[] = new int[ts1];
            for (int i = 0; i < ts1; i++){
                ts2[i] = sc.nextInt();
            }
            int ds1 = sc.nextInt();
            int ds2[] = new int[ds1];
            for (int i = 0; i < ds1; i++) {
                ds2[i] = sc.nextInt();
            }
            boolean flag1 = true;
            boolean flag2 = true;
            for (int tsValues  : ts2) {
                if (!Arrays.stream(tr2).anyMatch(arr -> arr == tsValues)) {
                    flag1 = false;
                    break;
                }
            }
            for (int tsValues  : ds2) {
                if (!Arrays.stream(dr2).anyMatch(arr -> arr == tsValues)) {
                    flag1 = false;
                    break;
                }
            }
            if (flag2 && flag1){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }
    }
}
