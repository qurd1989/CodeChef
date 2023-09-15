package begginerLevel;

import java.util.Scanner;

public class CarCoice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            float  x1 = sc.nextInt();
            float x2 = sc.nextInt();
            float y1 = sc.nextInt();
            float y2 = sc.nextInt();

            float diesel = y1 / x1;
            float petrol = y2 / x2;

            if (diesel < petrol) {
                System.out.println(-1);
            }else if (diesel > petrol) {
                System.out.println(1);
            }else
                System.out.println(0);
        }
    }
}
