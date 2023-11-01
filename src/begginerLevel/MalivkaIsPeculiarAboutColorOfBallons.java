package begginerLevel;

import java.util.Scanner;

public class MalivkaIsPeculiarAboutColorOfBallons {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0){
            String s = sc.next();
            String arr[] = new String[s.length()];
            int countA = 0;
            int countB = 0;
            for (int i = 0;  i < s.length(); i++){
                if (s.charAt(i) == 'a') {
                    countA++;
                }else
                    countB++;
            }
            if (countA > countB){
                System.out.println(countB);
            }else
                System.out.println(countA);
        }
    }
}
