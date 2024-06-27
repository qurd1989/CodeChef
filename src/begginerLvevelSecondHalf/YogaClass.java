package begginerLvevelSecondHalf;

import java.util.Scanner;

public class YogaClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int type1 = n *x;
            int type2 = n/2;
            int reminder = n %2;
            int type1AndType2Combination = (type2 * y) + (reminder * x);

            int maxEarnings = Math.max(type1,type1AndType2Combination);
            System.out.println(maxEarnings);
        }
    }
}
