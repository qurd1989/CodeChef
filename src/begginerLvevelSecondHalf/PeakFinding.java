package begginerLvevelSecondHalf;

import java.util.Scanner;

public class PeakFinding {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
            int mountains[] = new int[n];
            int max = 0;
            for(int i = 0; i< n; i++){
                mountains[i] = sc.nextInt();
                if (mountains[i] > max){
                    max = mountains[i];
                }
            }
            System.out.println(max);
        }

    }
}
