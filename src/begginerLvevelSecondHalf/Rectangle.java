package begginerLvevelSecondHalf;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d  = sc.nextInt();
            System.out.println((a^b^c^d) == 0 ?"YES" : "NO");
        }
    }
}
