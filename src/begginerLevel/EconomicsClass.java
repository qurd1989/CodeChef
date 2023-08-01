package begginerLevel;

import java.util.Scanner;

public class EconomicsClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int a = sc.nextInt(); //

            int count = 0;
            int s[] = new int[a];
            int d[] = new int[a];

            for (int i = 0; i < a; i++) {
                s[i] = sc.nextInt();

            }
            for (int j = 0; j < a; j++) {


                d[j] = sc.nextInt();
            }

            for (int i = 0; i < a; i++) {

                    if (s[i] == d[i]) {

                        count++;

                    }


                }


            System.out.println(count);
        }
    }
}
