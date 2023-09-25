package begginerLevel;

import java.util.Scanner;

public class ChefAndProfits {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int x = s.nextInt();
            int y = s.nextInt();
            int z = s.nextInt();
            int stockBoughtAt = x * y;
            int stockSoldAt = x * z;

            System.out.println(stockBoughtAt - stockSoldAt);
        }
    }
}
