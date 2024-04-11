package begginerLvevelSecondHalf;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ABooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0){
            int n = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            IntStream.range(0, n).forEach(i -> a[i] = sc.nextInt());
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++){
                int count = 0;
                for (int j = i+1; j < n; j++){
                    if (a[i] < a[j]){
                        count++;
                    }
                }
                list.add(count);
            }
           list.forEach((e) -> {
               System.out.print(e + " ");
           });

            System.out.println();
        }
    }
}
