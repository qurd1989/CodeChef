package begginerLevel;

import java.util.Scanner;

public class NonNegativeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();;

        while (t--> 0) {

            int n = sc.nextInt();
            int arr[] = new int[n];
            int countZeros = 0;
            int countNegativeNumbers = 0;

            for (int i =0; i < n; i++) {

                arr[i] = sc.nextInt();

                if (arr[i] == 0) {

                    countZeros++;

                }
                if (arr[i] < 0) {

                    countNegativeNumbers++;
                }
            }


            if(countZeros > 0 || countNegativeNumbers % 2 == 0) {

                System.out.println(0);
            }else

                System.out.println(1);
        }

    }
}
