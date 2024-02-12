package begginerLvevelSecondHalf;

import java.util.Arrays;
import java.util.Scanner;

public class ValidMinimum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int arr[] = new int[3];
            for (int i = 0; i< arr.length; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            if (arr[0] == arr[1]) {
                System.out.println("YES");
            } else
                System.out.println("NO");
        }
    }
}
