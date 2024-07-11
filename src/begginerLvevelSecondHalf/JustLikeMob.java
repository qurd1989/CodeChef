package begginerLvevelSecondHalf;

import java.util.*;

public class JustLikeMob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();
            int lot = ((k-1) *n) + (n +m);
            int times = (x + lot -1) /lot;
            if ((x-1) < (lot * times)- (n + m)){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
    public static List<int[]> pairSum(int [] arr, int s){
        List<int[]> pairs = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int complement = s - i;
            if (set.contains(complement)) {
                int[] pair = {i, complement};
                Arrays.sort(pair);
                pairs.add(pair);
            }
            set.add(i);
        }
        return pairs;
    }
}
