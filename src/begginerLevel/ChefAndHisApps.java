package begginerLevel;

import java.util.Scanner;

public class ChefAndHisApps {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int s = sc.nextInt();   // Phone Storage is S
            int x = sc.nextInt();  // app one occupied x mb
            int y = sc.nextInt();  // app two occupied y mb
            int z = sc.nextInt();  // app third requires z mb

            if (x + y + z  <= s){
                System.out.println(0);
            }else if (x+z <= s || y +z <= s) {
                System.out.println(1);
            }else
                System.out.println(2);

        }
    }
}
