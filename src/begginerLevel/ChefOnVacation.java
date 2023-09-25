package begginerLevel;

import java.util.Scanner;

public class ChefOnVacation {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int x = s.nextInt();
            int y = s.nextInt();
            int z = s.nextInt();

            if (x + y <= z) {
                System.out.println("Yes");
            }else
                System.out.println("No");
        }
    }
}
