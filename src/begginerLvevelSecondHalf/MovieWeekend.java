package begginerLvevelSecondHalf;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MovieWeekend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int indexValue = 0;
            int maxValue = 0;
            int ri = 0;
            int l[] = new int[n];
            int r[] = new int[n];
            for (int i = 0; i < n; i++){
                l[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++){
                r[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++){
                if (maxValue <= l[i] * r[i] && ri < r[i]) {
                    maxValue = l[i] * r[i];
                    ri = r[i];
                    indexValue = i;

                }
            }
            System.out.println(indexValue + 1);

        }
    }

    boolean hasArrayTwoCandidates(int arr[], int n, int x) {

        int str = 0;
        int end = n - 1;
        Arrays.sort(arr);
        while (str <= end) {
            int sum = arr[str] + arr[end];
            if (sum == x) {
                return true;
            } else if (sum < x) {
                str++;
            } else
                end--;
        }
        return false;
    }

 static boolean hasArrayTwoCandidates1(int arr[], int n, int x) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n-1; i++) {
            int targetNumber = x - arr[i];
            if (map.containsKey(targetNumber)){
                return true;
            }else
                map.put(arr[i],1);
        }
        return false;
    }
}

