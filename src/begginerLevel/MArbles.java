package begginerLevel;

import java.util.Scanner;

public class MArbles {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while (t--> 0) {

            int n = sc.nextInt();
            int k = sc.nextInt();

            long m = 1;
            for (int i = 0; i < k; i++) {

                m = m *((n -k)+i)/2;
            }
            System.out.println(m);
        }
    }
}
