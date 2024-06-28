package begginerLvevelSecondHalf;

import java.util.Scanner;

public class EqualCoins {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int yValue = 2 *y;
            if ((x + yValue) % 2 == 0 && (x > 0 || y % 2 ==0)){
                System.out.println("Yes");
            }else
                System.out.println("No");
        }
    }
}
