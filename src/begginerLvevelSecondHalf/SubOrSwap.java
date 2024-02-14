package begginerLvevelSecondHalf;

import java.util.Scanner;

public class SubOrSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(gcd(x,y));
        }

    }
    public static int gcd(int x, int y){
      while (y != 0) {
          int t = y;
          y = x % y;
          x = t;
      }
      return x;
      }
}
