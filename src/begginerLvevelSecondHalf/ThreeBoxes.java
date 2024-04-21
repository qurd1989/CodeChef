package begginerLvevelSecondHalf;

import java.util.Scanner;

public class ThreeBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while (t--> 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            if (a + b + c <=d){
                System.out.println(1);
            }else if ((a + b) <=d || (a + c) <= d || (b + c) <= d){
                System.out.println(2);
            }else
                System.out.println(3);
        }
    }
    public int removeDuplicates(int nums[]){
        int n = nums.length;
        int tempValue = 1;
        for (int i = 1; i < n; i++){
            if (tempValue == 1 ||nums[i] != nums[tempValue - 2]){
                nums[tempValue++] = nums[i];
            }
        }
        return tempValue;
    }
}
