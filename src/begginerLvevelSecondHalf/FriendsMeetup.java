package begginerLvevelSecondHalf;

import java.util.Scanner;

public class FriendsMeetup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0){

            int x1 = sc.nextInt();
            int x2 = sc.nextInt();

            if (x1 == x2 || x1 > x2){
                System.out.println("YES");
            }else
                System.out.println("NO");

        }
    }
}
