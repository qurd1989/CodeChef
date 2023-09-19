package DSAPreparetion1;

import java.util.Scanner;

public class TaxiCost {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
                if (n == 1) {
                    if (arr[0] == 0) {
                        System.out.println(0);
                    } else
                        System.out.println(x);


                } else {
                    int count = arr[0] == 0 ? 1:0;
                    for (int j = 1; j < n; j++) {
                        if (arr[j] == 0 && arr[j - 1] == 0) {
                            count++;
                        }
                    }
                    int NonrainyDay = n - count;
                    System.out.println(NonrainyDay * x);

            }
        }
    }
}
