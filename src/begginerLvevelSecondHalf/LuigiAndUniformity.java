package begginerLvevelSecondHalf;

import javax.swing.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LuigiAndUniformity {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                }
            int gcd = arr[0];
            for (int num : arr){
                gcd = gcd(gcd, num);
            }

            int countNotEqual = 0;
            for (int i = 0; i < n; i++){
                if (arr[i] != gcd){
                    countNotEqual++;
                }
            }
            System.out.println(countNotEqual);
        }
    }

    public static int gcd(int a, int b){
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
