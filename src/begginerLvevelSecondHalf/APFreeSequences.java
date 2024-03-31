package begginerLvevelSecondHalf;

import java.util.Scanner;

public class APFreeSequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0){
            int n = sc.nextInt();
            int sequences[] = new int[n];
            for (int i = 0; i < n; i++){
                sequences[i] = sc.nextInt();
            }
            int difference = 0;
            for (int i = 0; i < n; i++){
                difference = sequences[i+1] +sequences[i];

            }

        }
    }
}
