package begginerLevel;

import java.util.Scanner;

public class WaterMixing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int a = sc.nextInt();   // initial temp of water in bathtub
            int b = sc.nextInt();  //
            int x = sc.nextInt();  // X liters of Hot water
            int y = sc.nextInt();  // Y litres of Hot water

            if ((a + x) >= b && (a - y) <= b) {
                System.out.println("Yes");
            }else
                System.out.println("No");

        }
    }
}
