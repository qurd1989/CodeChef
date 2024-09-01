package begginerLvevelSecondHalf;

import java.util.Scanner;

public class MagicWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            int square = x * x;
            if (a * b <= square){
                System.out.println(0);
            }else if (a <= square  || b <= square){
                System.out.println(1);
            }else{
                System.out.println(2);
            }

        }
    }
}
