package begginerLvevelSecondHalf;

import java.util.Scanner;

public class Superincreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  =sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();
            if (k >= 32){
                System.out.println("NO");
            }else
                System.out.println((x >= 1<<(k-1)) ? "Yes" : "NO")  ;
        }
    }
}
