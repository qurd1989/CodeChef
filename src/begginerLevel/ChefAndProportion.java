package begginerLevel;

import java.util.Scanner;

public class ChefAndProportion {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int t = sc.nextInt();
     while(t-->0){
         int l = sc.nextInt();
         int k =sc.nextInt();
         if (l%k == 0){
             System.out.println(0);
         }else
             System.out.println(1);
     }
    }
}
