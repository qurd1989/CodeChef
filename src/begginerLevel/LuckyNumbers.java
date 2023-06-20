package begginerLevel;

import java.util.Scanner;
import java.util.stream.IntStream;

public class LuckyNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        int count = 0;
        while (t-- > 0) {

            int x = sc.nextInt();

            boolean flag = false;

            String seven_Numbers = String.valueOf(x);

            for (int i =0; i < seven_Numbers.length(); i++) {

                if (seven_Numbers.charAt(i) == '7'){
                    flag =true;
                    break;
                }

            }

            if (flag) {
                System.out.println("Yes");
            }else
                System.out.println("No");


        }
    }
}
