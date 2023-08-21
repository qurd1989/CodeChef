package begginerLevel;

import java.util.Scanner;

public class GoodWeather {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t--> 0) {

            int arr[]= new int[7];

            int runnyDay = 0;
            int sunnyDay = 0;
            for (int i = 0; i < arr.length; i++) {

                arr[i] = sc.nextInt();

                if (arr[i] == 1) {
                    sunnyDay++;

                }else if (arr[i] == 0) {
                    runnyDay++;

                }
            }
            if (sunnyDay > runnyDay) {
                System.out.println("Yes");
            }else
                System.out.println("No");
        }
        sc.close();
    }
}
