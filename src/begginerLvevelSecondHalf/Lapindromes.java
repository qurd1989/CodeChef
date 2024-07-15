package begginerLvevelSecondHalf;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lapindromes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int firstH[] = new int[s.length()];
            int secondH[] = new int[s.length()];
            boolean isLapindrome = true;
            int n = s.length();
            for (int i = 0; i < n/ 2; i++) {
                firstH[s.charAt(i) - 'a']++;
            }
            for (int i = (n + 1) / 2; i < n; i++) {
                secondH[s.charAt(i) - 'a']++;
            }
            for (int i = 0; i < s.length(); i++) {
                if (firstH[i] != secondH[i]) {
                    isLapindrome = false;
                    break;
                }
            }
            if (isLapindrome) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static ArrayList<Integer> absDiff(ArrayList<Integer> arr, int n) {
        int evensSum = 0;
        int oddSum = 0;
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (i % 2 == 0) {
                evensSum = Math.abs(evensSum - arr.get(i));
            } else {
                oddSum = Math.abs(oddSum - arr.get(i));
            }
        }
        result.add(evensSum, oddSum);
        return result;
    }
}
