package arrays;

import java.util.*;
import java.util.Arrays;
import java.util.List;

public class IntersectingArrays {
    public static List<Integer> intersect(int[] nums1, int[] nums2) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length){
            if (nums1[i] < nums2[j]){
                i++;
            }else if (nums1[i] > nums2[j]){
                j++;
            }else {
                ans.add(nums1[i]);
                i++;
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nums1Size = scanner.nextInt();
        int nums2Size = scanner.nextInt();
        int[] nums1 = new int[nums1Size];
        int[] nums2 = new int[nums2Size];
        for (int i = 0; i < nums1Size; i++) {
            nums1[i] = scanner.nextInt();
        }
        for (int i = 0; i < nums2Size; i++) {
            nums2[i] = scanner.nextInt();
        }
        List<Integer> ans = intersect(nums1, nums2);
        for (int num : ans) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
