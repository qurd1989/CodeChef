package begginerLevel;

import java.util.Scanner;

public class WhichDivision {
    public static void main(String[] args) {

        Scanner ss = new Scanner(System.in);
        int t= ss.nextInt();
        while(t-->0) {
            int a = ss.nextInt();

            if (1000 <= a && a < 1600) {
                System.out.println(3);
            }else if (1600 <= a &&  a < 2000) {
                System.out.println(2);
            }else
                System.out.println(1);
        }
    }
}
