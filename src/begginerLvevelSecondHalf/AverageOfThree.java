package begginerLvevelSecondHalf;

import java.util.Scanner;

public class AverageOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int N = sc.nextInt();
            System.out.println(( N -1 + " " +  N + " " + (N + 1)));
        }
    }
}
