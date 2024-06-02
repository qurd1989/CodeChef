package begginerLvevelSecondHalf;

import java.util.Scanner;

public class TwoDifferentPalindromes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a % 2 == 1 && b % 2 ==1){
                System.out.println("No");
            }else if (Math.min(a,b) ==1){
                System.out.println("No");
            }else
                System.out.println("Yes");
        }
    }
}
