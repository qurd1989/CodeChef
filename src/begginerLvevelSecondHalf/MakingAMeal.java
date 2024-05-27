package begginerLvevelSecondHalf;

import jdk.swing.interop.LightweightFrameWrapper;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MakingAMeal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int c = 0, e = 0, d = 0, o = 0, h = 0, f = 0;
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                int r = s.length();
                for (int j = 0; j < r; j++) {
                    if (s.charAt(j) == 'c'){
                        c++;
                    } else if (s.charAt(j) == 'e') {
                        e++;
                    }else if (s.charAt(j) == 'd'){
                        d++;
                    }else if (s.charAt(j) == 'o'){
                        o++;
                    }else if (s.charAt(j) == 'h'){
                        h++;
                    }else if (s.charAt(j) == 'f'){
                        f++;
                    }
                }
                }
            int arr[]={c/2,o,d,e/2,h,f};

            Arrays.sort(arr);
            System.out.println(arr[0]);
            }
        }
    }

