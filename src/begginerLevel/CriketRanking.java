package begginerLevel;

import java.util.Scanner;

public class CriketRanking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {


            int arrA[] = new int[3];
            int arrB[] = new int[3];
            int sumB = 0;
            int sumA = 0;
            for (int i = 0; i < 3; i++) {
                arrA[i] = sc.nextInt();
            }
            for (int i = 0; i < 3; i++) {
                arrB[i] = sc.nextInt();

            }
            for (int i = 0; i<3;i++) {
                if (arrA[i] > arrB[i]) {
                    sumA++;
                } else
                    sumB++;
            }

            if (sumB > sumA){
                System.out.println("B");
            }else
                System.out.println("A");
        }
    }
}
