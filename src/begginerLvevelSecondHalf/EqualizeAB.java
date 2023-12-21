package begginerLvevelSecondHalf;

import java.util.Scanner;

public class EqualizeAB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while (t--> 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x =sc.nextInt();
            if (Math.abs(a - b) % (2*x)==0) {
                System.out.println("YES");
            }else if(a == b) {
                System.out.println("YES");
            }else
                System.out.println("NO");
        }
    }
}