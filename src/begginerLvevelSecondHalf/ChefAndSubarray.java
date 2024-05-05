package begginerLvevelSecondHalf;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ChefAndSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        int count = 0;
        if (arr.length == 1) {
            if (arr[0] == 0) {
                count = 0;
            } else {
                count++;
            }
            list.add(count);
        } else {
            for (int i = 0; i < n; i++) {
                if (arr[i] != 0) {
                    count++;
                }
                if (arr[i] == 0) {
                    list.add(count);
                    count = 0;
                    continue;
                }
                if (i == n - 1) {
                    list.add(count);
                }

            }
        }
        int max = Integer.MIN_VALUE;
        for (int value : list) {
            if (value > max) {
                max = value;

            }
        }


        // below another solution for the problem
//        int lastZero = 0;
//        for (int i = 0; i < n; i++) {
//            if (arr[i] != 0) {
//                count++;
//                if (count > lastZero){
//                    lastZero = count;
//                }
//            } else {
//                count = 0;
//            }
//        }
//        System.out.println(lastZero);
        System.out.println(max);
    }
}
