package matrix;

import java.util.List;
public class SpiralMatrix {

    public static void main(String[] args) {
        int arr[] = {1,2,3,1};
        System.out.println(containsDuplicate(arr));
    }
    public static boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        int isVisited[] = new int[n];
        for(int i =0; i < n; i++){
            isVisited[nums[i]]++;
        }
        for(int i = 0; i < isVisited.length; i++){
            if(isVisited[nums[i]] > 1){
                return true;
            }
        }
        return false;
    }
}
