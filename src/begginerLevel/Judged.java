package begginerLevel;

import java.util.Scanner;

public class Judged {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int arr[] = new int[5];
            int count = 0;
            for (int i = 0; i < 5; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 1) {
                    count++;
                }
            }
                if (count >= 4) {
                    System.out.println("YES");
                } else
                    System.out.println("NO");
        }
    }
}