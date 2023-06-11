package begginerLevel;

import java.util.Scanner;

public class IntegerThatSumToTheSameValue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;
        for (int i = 1; i < n; i++) {
            int j = n - i;
            count++;

        }
        System.out.println(count);
    }
}
