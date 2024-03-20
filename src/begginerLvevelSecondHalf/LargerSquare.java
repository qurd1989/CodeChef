package begginerLvevelSecondHalf;

import java.util.Map;
import java.util.Scanner;

public class LargerSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0){
            int n = sc.nextInt();
            int a = sc.nextInt();

            int x = (int)Math.floor(Math.sqrt(n));
            System.out.println(x *a);
        }
    }
}
