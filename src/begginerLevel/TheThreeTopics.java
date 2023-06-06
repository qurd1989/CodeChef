package begginerLevel;

import java.util.Scanner;

public class TheThreeTopics {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();

        if((x == a) || (x ==b) || (x == c)) {
            System.out.println("Yes");

        }else
            System.out.println("No");
    }
}
