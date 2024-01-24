package begginerLvevelSecondHalf;

import java.util.Scanner;


public class LuckBoundries {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int t = sc.nextInt();
     while (t--> 0) {
         int N = sc.nextInt();
         String S = sc.next();
         int count = 0;
         for (int i=0;i<N-1 ;i++ ){
             if(S.substring(i, i+2).equals("10")){
                 System.out.println(S.substring(i+2));
                 count++;
             }
         }
         System.out.println(count);
     }
    }
}
