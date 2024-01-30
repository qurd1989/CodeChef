package begginerLevel;

import java.util.Scanner;

public class ChefAndSocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int jacketCost = sc.nextInt();
         int sockCost = sc.nextInt();
         int buyingPower = sc.nextInt();
         int left = buyingPower - jacketCost;

         if ((left / sockCost)%2 ==0){
             System.out.println("Lucky Chef");
         }else
             System.out.println("Unlucky Chef");
        System.out.println();

    }
}
