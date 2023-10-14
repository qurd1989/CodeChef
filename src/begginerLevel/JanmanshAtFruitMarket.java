package begginerLevel;

import java.util.Arrays;
import java.util.Scanner;

public class JanmanshAtFruitMarket {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            int x = sc.nextInt();
            int arr[] = new int[3];
            int totalAmount =0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            totalAmount = (x - 1) * arr[0] + arr[1];
            System.out.println(totalAmount);
        }
    }
}
