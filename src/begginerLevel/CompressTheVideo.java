package begginerLevel;

import java.util.Scanner;

public class CompressTheVideo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
               arr[i] = sc.nextInt();
            }
            int count = n;
            for (int i = 0; i < n -1; i++) {
                if (arr[i] == arr[i + 1]) {
                    count--;
                }
            }
            System.out.println(count);
        }
    }
}
