package begginerLevel;

import java.util.Scanner;

public class SelfDefenceTraining {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();


        while (t-- > 0) {

            int n = sc.nextInt();   //

            int arr[] = new int[n];
            int count = 0;
            for (int i = 0; i < n; i++) {

                arr[i] = sc.nextInt();

                if (arr[i] >= 10 && arr[i] <= 60){
                    count++;
                }
            }

            System.out.println(count);
        }

    }
}
