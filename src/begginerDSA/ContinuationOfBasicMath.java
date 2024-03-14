package begginerDSA;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ContinuationOfBasicMath {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int t = read.nextInt();
        int ele;
        for(int i=0; i<t; i++)
        {
            int n = read.nextInt();
            ArrayList<Integer> a = new ArrayList<Integer>();
            for (int j =1; j <= n; j++){
                if (n % j ==0){
                    a.add(j);
                }
            }
            int []arr = a.stream().mapToInt(k -> k).toArray();
            for (int x : arr){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
