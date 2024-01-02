package begginerLvevelSecondHalf;

import java.util.Scanner;

public class PlusTwoORMinusOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            int y = sc.nextInt();
            if (y == 0){
                System.out.println(1);
            }else
                System.out.println(y *3);

        }
    }
}
