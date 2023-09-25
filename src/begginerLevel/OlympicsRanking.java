package begginerLevel;

import java.util.Scanner;

public class OlympicsRanking {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int g1 = s.nextInt();
            int s1 = s.nextInt();
            int b1 = s.nextInt();
            int g2 = s.nextInt();
            int s2 = s.nextInt();
            int b2 = s.nextInt();
            if ((g1 + s1 + b1) >(g2 + s2 + b2) ){
                System.out.println(1);
            }else
                System.out.println(2);
        }
    }
}
