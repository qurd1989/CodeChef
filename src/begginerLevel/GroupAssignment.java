package begginerLevel;

import java.util.Scanner;

public class GroupAssignment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            System.out.println(((2*x)+1)-n);
        }
    }
}
