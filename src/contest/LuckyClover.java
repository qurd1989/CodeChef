package contest;

import java.util.Scanner;

public class LuckyClover {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1){
            System.out.println(4);
        }else {
            int threeLeafs = (n-1) * 3;
            System.out.println(threeLeafs+ 4);
        }
    }
}
