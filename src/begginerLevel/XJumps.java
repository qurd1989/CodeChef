package begginerLevel;

import java.util.Scanner;

public class XJumps {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int x = sc.nextInt();// Chef want to reach stair numbered X
            int y = sc.nextInt(); // Chef can climb either Y steps or 1 in one move

            System.out.println(x/y + x%y);
        }
    }
}
