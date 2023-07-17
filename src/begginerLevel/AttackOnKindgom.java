package begginerLevel;

import java.lang.reflect.AccessibleObject;
import java.util.Scanner;

public class AttackOnKindgom {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0 ){

            int n = sc.nextInt();
            int secondColdestDay = Integer.MIN_VALUE;
            int coldestDay = Integer.MIN_VALUE;
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {

                arr[i] = sc.nextInt();

                if (arr[i] > coldestDay) {

                    secondColdestDay = coldestDay;
                    coldestDay = arr[i];


                }
                if (arr[i] > secondColdestDay && arr[i] != coldestDay) {

                    secondColdestDay = arr[i];

                }


            }
                System.out.println(secondColdestDay);


        }
    }
}
