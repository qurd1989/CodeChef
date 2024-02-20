package begginerLvevelSecondHalf;

import java.util.Scanner;

public class CeilAndAMinusBProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A  = sc.nextInt();
        int B  = sc.nextInt();
        int C = A - B;
        if (C % 10 == 9){
            System.out.println(C-1);
        }else
            System.out.println(C+1);
    }
}
