package begginerLvevelSecondHalf;

import java.util.Scanner;

public class ChefAndMean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
            long arr[] = new long[n];


        }
    }
    public static int search(int []nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while (low <= high){
            int mid = low + (high - low)/2;
            if (nums[mid] == target){
                return mid;
            }else if (nums[mid] < target){
                 low = mid +1;
            }else {
                 high = mid -1;
            }
        }
        return -1;
    }
}
