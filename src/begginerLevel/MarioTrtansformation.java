package begginerLevel;

import java.util.Scanner;

public class MarioTrtansformation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int x = sc.nextInt() % 3;

            if (x == 0) {
                System.out.println("Normal");

            }else if (x >= 0) {
                System.out.println("Huge");
            }else if(x % 3 == 2) {

                System.out.println("Small");
            }
        }
    }
}
