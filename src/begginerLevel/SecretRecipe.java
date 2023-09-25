package begginerLevel;

import java.util.Scanner;

public class SecretRecipe {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            float x1= s.nextInt();
            float x2= s.nextInt();
            float x3= s.nextInt();
            float v1= s.nextInt();
            float v2 = s.nextInt();

             float chefDistance = Math.abs(x1- x3) /v1;
             float kefaDistance = Math.abs(x2 - x3)/ v2;

            if (chefDistance > kefaDistance) {
                System.out.println("Chef");
            }else if (chefDistance < kefaDistance) {
                System.out.println("Kefa");
            }else
                System.out.println("Draw");

        }
    }
}
