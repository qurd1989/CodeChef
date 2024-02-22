package begginerLvevelSecondHalf;

import java.util.Scanner;

public class AverageOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int N = sc.nextInt();

            for(int i=0; i<N-1; i++){
                System.out.print((i+2)+" ");
            }
            System.out.println(1);
        }
    }
}
