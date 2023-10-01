package begginerLevel;

import java.util.Scanner;

public class ASaveWaterSaveLife {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of testcases

        for (int i = 0; i < t; i++) {

            int h = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int c = scanner.nextInt();

             float consumedWater = h *x + h *(y/2);
             if (consumedWater >= c) {
                 System.out.println("Yes");
             }else
                 System.out.println("No");

        }
    }
}
