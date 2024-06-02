package begginerLvevelSecondHalf;

import java.util.Scanner;

public class NewPiece {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int arr[] = new int[4];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            if ((arr[0] == arr[2]) && (arr[1] == arr[3])) {
                System.out.println(0);
            } else if ((arr[0] + arr[1]) % 2 != (arr[2] + arr[3]) % 2) {
                System.out.println(1);
            } else  {
                System.out.println(2);
            }
        }
    }
}
