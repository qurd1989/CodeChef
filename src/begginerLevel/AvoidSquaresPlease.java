package begginerLevel;

import java.util.Scanner;

public class AvoidSquaresPlease {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        for(int i=0; i<t; i++){
            int n = read.nextInt();
            for(int j=1; j<n+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}