package begginerLvevelSecondHalf;

import java.util.Scanner;

public class ValentineGifts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while (t--> 0){
            int x = sc.nextInt();
            // Chef has X  budget
            if (x < 127){

                System.out.println("NO");
            }else
                System.out.println("YES");
        }
    }
}
