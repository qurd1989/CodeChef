package begginerLevel;

import java.util.Scanner;

public class ChefEren {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int evenIndex = 0;
        int oddIndex = 0;

        while (t-- > 0) {

            int n = sc.nextInt();   //
            int a = sc.nextInt();  //
            int b = sc.nextInt();  //



            for (int i = 1; i < n; i++){

                if (i % 2== 0) {
                    evenIndex++;
                }else
                    oddIndex++;
            }

            System.out.println((a * evenIndex) + (b * oddIndex));
        }

    }
}
