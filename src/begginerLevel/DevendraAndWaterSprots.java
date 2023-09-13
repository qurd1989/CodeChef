package begginerLevel;

import java.util.Scanner;

public class DevendraAndWaterSprots {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i =0; i < t; i++) {
            int z = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if ((z - y) >= (a+b+c)) {
                System.out.println("Yes");
            }else
                System.out.println("No");
        }
    }
}
