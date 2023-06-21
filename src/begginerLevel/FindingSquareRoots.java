package begginerLevel;

import java.util.Scanner;

public class FindingSquareRoots {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int n = sc.nextInt();
        int result = 0;
        int arr[] = new int[t];
        for (int i =0; i <= t; i++) {
            arr[i] += n;


        }
        System.out.println(arr);
    }
}
