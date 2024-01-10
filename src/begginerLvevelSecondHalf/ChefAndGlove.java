package begginerLvevelSecondHalf;

import java.util.Arrays;
import java.util.Scanner;

public class ChefAndGlove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            for(int i = 0; i<n; i++){
                a[i] = sc.nextInt();
            }
            for(int i = 0; i<n; i++){
                b[i] = sc.nextInt();
            }
            boolean front = true;
            for(int i = 0; i<n; i++){
                if(a[i]>b[i])
                    front = false;
            }
            boolean back = true;
            for(int i = 0; i<n; i++){
                if(a[i]>b[n-i-1])
                    back = false;
            }
            System.out.println(front && back ? "both" : front ? "front" : back ? "back" : "none");

        }
    }
}