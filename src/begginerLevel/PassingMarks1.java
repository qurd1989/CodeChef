package begginerLevel;

import java.util.Scanner;

public class PassingMarks1 {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int aMin = s.nextInt();
            int bMin= s.nextInt();
            int cMin = s.nextInt();
            int T = s.nextInt();
            int a = s.nextInt();
            int b = s.nextInt();
            int c  = s.nextInt();

            if (a >= aMin && b >= bMin && c>= cMin && (a + b + c) >= T) {
                System.out.println("Yes");
            }else
                System.out.println("No");
        }
    }
}
