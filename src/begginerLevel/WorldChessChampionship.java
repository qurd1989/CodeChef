package begginerLevel;

import java.util.Scanner;

public class WorldChessChampionship {
    public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);
          int t =sc.nextInt();
          while (t--> 0) {
              int x = sc.nextInt();
              String matching = sc.next();

              int charlesVictory = 0;
              int chefVictory = 0;

              for (int i =0; i<matching.length(); i++) {
                  if (matching.charAt(i) == 'C'){
                      charlesVictory +=2;
                  }else if (matching.charAt(i) == 'N'){
                      chefVictory += 2;

                  }else {
                      charlesVictory++;
                      chefVictory++;
                  }
              }
              if (charlesVictory > chefVictory){
                  System.out.println(60 * x);
              }else if (charlesVictory == chefVictory){
                  System.out.println(55 * x);
              }else
                  System.out.println(40 * x);
          }
    }

}
