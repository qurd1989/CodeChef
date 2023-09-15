package begginerLevel;

import java.util.Scanner;

public class SumsInATraingle {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        int t = sc.nextInt();
        while (t != 0) {
            int n =sc.nextInt();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {

                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
}
