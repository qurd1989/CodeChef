package begginerLvevelSecondHalf;

import java.util.Scanner;

public class ChefJumping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 6 == 0 || a % 6 ==1 || a % 6 == 3){
            System.out.println("yes");
        }else
            System.out.println("no");
    }
}
