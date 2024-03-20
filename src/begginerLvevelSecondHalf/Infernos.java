package begginerLvevelSecondHalf;

import java.util.Scanner;

public class Infernos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int enemies[] = new int[n];
            for (int i = 0; i < n; i++){
                enemies[i] = sc.nextInt();
            }
            int single = 0;
            int j = 0;
            int max = Integer.MIN_VALUE;
            while (n > j) {
                int division = (enemies[j]+ x -1)/x;
                single += division;
                j++;

                if (enemies[j] > max){
                    max = enemies[j];
                }
            }

            int maxResult = Math.max(single, max);
            System.out.println(maxResult);
        }
    }
}
