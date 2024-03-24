package begginerLvevelSecondHalf;

import java.util.Scanner;

public class MakeMultiple {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = b - a;
            if (x == 0 || x >= a){
                System.out.println("Yes");
            }else
                System.out.println("No");
        }
    }
}
