package begginerLevel;

import java.util.Scanner;

public class SastaSharkTank {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        int a = sc.nextInt();
        int b = sc.nextInt();

         int valuationA = a * 10;
         int valuationB = b * 20;

         if (valuationA  > valuationB) {

             System.out.println("First");

         } else if (valuationA < valuationB) {
             System.out.println("Second");
         }else
             System.out.println("Any");
    }
}
