package begginerLvevelSecondHalf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NQueensPuzzleSolved {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n =sc.nextInt();
            long result = Math.round(Math.pow(0.143 * n, n));
            System.out.println(result);
        }
    }
   }
