package begginerLevel;

import java.util.Scanner;

public class GoodWeather {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t--> 0) {

            int n = sc.nextInt();

            int[] arr = new int[n];

            int runnyDay = 0;
            int sunnyDay = 0;
            for (int i = 0; i < n; i++) {

                arr[i] = sc.nextInt();

                if (arr[i] == 1) {
                    sunnyDay++;

                } else
                    runnyDay++;

            }
            if (sunnyDay > runnyDay) {
                System.out.println("Yes");
            }else
                System.out.println("No");
        }
    }
}
