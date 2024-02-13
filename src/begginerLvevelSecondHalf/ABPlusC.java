package begginerLvevelSecondHalf;

import java.util.Scanner;

public class ABPlusC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0){
            long x = sc.nextLong();
            String s = "Elamr";
            for (int A = 1; A < Math.sqrt(x); A++){
                long B =(x - A) /A;

                if (B % 1 ==0 && 1 <= B && B <= x/A){
                    Long C =  x - A - B;
                    if (1<= C && C < 1e6){
                        System.out.println(A + " " + B + " "+ C);
                        break;
                    }
                }
                if (A > Math.sqrt(x)){
                    System.out.println(-1);
                }
            }

        }
    }
}
