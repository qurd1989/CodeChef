package begginerLvevelSecondHalf;

import java.util.Arrays;
import java.util.Scanner;

public class Medel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t--> 0) {
            int n = sc.nextInt();
            int elements [] = new int[n];
            for (int i = 0; i < n; i++){
                elements[i] = sc.nextInt();
            }
          int max = 0;
          int min = Integer.MAX_VALUE;
          int minIndex = 0;
          int maxIndex = 0;
          for (int i = 0; i< n; i++) {
              if (elements[i] < min){
                  min = elements[i];
                  minIndex = i;
              }
          }
            for (int i = 0; i< n; i++) {
                if (elements[i] > max) {
                    max = elements[i];
                    maxIndex = i;
                }
            }
            if (minIndex < maxIndex){
                System.out.println(min + " " + max);
            }else
                System.out.println(max + " " + min);
        }
    }
}
