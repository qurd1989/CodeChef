package begginerLvevelSecondHalf;

import java.util.HashSet;
import java.util.Scanner;

public class VaccineDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0) {
           int n = sc.nextInt();
           int arr[] = new int[n];
           int d = sc.nextInt();
           int riskyPeople = 0;
           for (int i = 0; i < n; i++){
               arr[i] = sc.nextInt();
               if (arr[i] >= 80 || arr[i] <=9){
                   riskyPeople++;
               }
           }
           int nonRiskyPeople = n - riskyPeople;
           int daysForRisky = (riskyPeople + d -1) /d;
           int daysForNonRisky = (nonRiskyPeople + d -1) /d;
            System.out.println(daysForNonRisky + daysForRisky);
        }
    }
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int j = 1;
        for (int i = 1; i < n; i++){
            if(nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1;
    }
    public int longestPalindrome(String s) {
        int n = s.length();

        HashSet<Character> set = new HashSet<>();
        int length = 0;
        for (int i = 0; i < n; i++){
            char c = s.charAt(i);
            if (set.contains(c)){
                set.remove(c);
                length += 2;
            }else {
                set.add(c);
            }

        }
        if (!set.isEmpty()){
            length += 1;
        }
        return length;
    }
}
