package begginerLvevelSecondHalf;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChefAndSteps {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            // Steps will be taking by Chef
            // ith are given distances in an array
            List<Integer> list = new ArrayList<>();

            int distances[] = new int[n];
            for (int i = 0; i < n; i++){
                distances[i] = sc.nextInt();
                if (distances[i] % k == 0) {
                    list.add(1);
                }else
                    list.add(0);
            }

            String str = String.join("", list.stream().map(String::valueOf).toArray(String[]::new));
            System.out.println(str);
        }
    }
}
