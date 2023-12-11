package begginerLvevelSecondHalf;

import java.util.Scanner;

public class EqualCardGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while (t--> 0){
            int n =sc.nextInt();

            int reminder = 52 % n;
            System.out.println(reminder);
        }
    }
}
