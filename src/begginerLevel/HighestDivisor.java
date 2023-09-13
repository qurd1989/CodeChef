package begginerLevel;

import java.util.ArrayList;
import java.util.Scanner;

import static java.util.Collections.list;

public class HighestDivisor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int largestDivisor = 1;
        for (int  i =1; i <=10; i++) {
            if (n % i ==0) {
                largestDivisor = i;
            }
        }
        System.out.println(largestDivisor);
    }
}
