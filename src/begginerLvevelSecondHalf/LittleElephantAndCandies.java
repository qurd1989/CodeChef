package begginerLvevelSecondHalf;

import java.util.Random;
import java.util.Scanner;

public class LittleElephantAndCandies {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t--> 0) {
          int n = sc.nextInt();
          int c = sc.nextInt();
          int  elephants [] = new int[n];
          for (int i = 0; i < n; i++){
              elephants[i] = sc.nextInt();
          }
          int sumOfElephants = 0;
          for (int i = 0; i < n; i++) {
              sumOfElephants += elephants[i];
          }
          if (sumOfElephants <= c){
              System.out.println("Yes");
          }else System.out.println("No");
      }
    }
}
