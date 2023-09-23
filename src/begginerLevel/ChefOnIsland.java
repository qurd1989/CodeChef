package begginerLevel;

import java.util.Map;
import java.util.Scanner;

public class ChefOnIsland {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-->0) {
            float x1 = sc.nextInt();
            float y1 = sc.nextInt();
            float x2 = sc.nextInt();
            float y2 = sc.nextInt();
            int d = sc.nextInt();

            float foodSupply = x1/x2;
            float waterSupply = y1/y2;

           float mins = Math.min(foodSupply, waterSupply);
           if (mins < d) {
               System.out.println("NO");
           }else
               System.out.println("YES");

        }
    }
}
