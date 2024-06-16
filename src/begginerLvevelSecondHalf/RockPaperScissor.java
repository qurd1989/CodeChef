package begginerLvevelSecondHalf;

import java.util.Scanner;

public class RockPaperScissor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int games = sc.nextInt();

        while(games-- > 0) {

            int siz = sc.nextInt();

            String chef =  sc.next();

            String chefnia = sc.next();

            int chefScore = 0;

            int chefniaScore = 0;

            for(int i = 0; i < siz; i++)
            {
                if(chef.charAt(i) == 'S' && chefnia.charAt(i) == 'P') chefScore++;

                else if(chef.charAt(i) == 'P' && chefnia.charAt(i) == 'R') chefScore++;

                else if(chef.charAt(i) == 'R' && chefnia.charAt(i) == 'S') chefScore++;

                else if(chef.charAt(i) == chefnia.charAt(i)) continue;

                else chefniaScore++;
            }

            if(chefScore > chefniaScore) System.out.println("0");

            else if(chefScore == chefniaScore) System.out.println("1");

            else{

                int average = (chefScore + chefniaScore)/2;

                if((chefScore + chefniaScore) % 2 == 0) System.out.println(chefniaScore - average + 1);

                else System.out.println(chefniaScore - average);

            }

        }

        sc.close();

    }
}