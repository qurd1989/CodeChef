package begginerLevel;

import java.util.Scanner;

public class GradeltheSteel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        for (int i =  0; i < k; i++) {

            int h = sc.nextInt();
            int c = sc.nextInt();
            int t = sc.nextInt();

            if (h > 50 && c < 0.7 && t > 5600) {
                System.out.println(10);
            }else if (h > 50 && c < 0.7){
                System.out.println(9);
            }else if (c < 0.7 && t < 5600) {
                System.out.println(8);
            }else if (h > 50 && t < 5600) {
                System.out.println(7);
            }else if (h > 50 || c < 0.7 || t > 5600) {
                System.out.println(6);
            }else
                System.out.println(5);
        }
    }
}
