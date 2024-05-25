package begginerLvevelSecondHalf;

import java.util.Scanner;

public class Brackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0){
          String s = sc.next();
          int balance = 0;
          int maxBalance = 0;
          for (int i = 0; i < s.length(); i++){
              if (s.charAt(i) == '('){
                  balance++;
              }
              if (s.charAt(i) == ')'){
                  balance--;
              }
              maxBalance = Math.max(balance, maxBalance);
          }

          for (int i = 0; i < maxBalance; i++){

                  System.out.print("(");
              }
          for (int i = 0; i < maxBalance; i++){
                  System.out.print(")");
              }

            System.out.println();
        }
    }
}
