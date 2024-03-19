package begginerLvevelSecondHalf;

import java.util.Scanner;

public class BearAndSegment01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0){
            String s = sc.next();

            System.out.println(hasSingleSegmentOfOnes(s));
        }
    }
    public static boolean hasSingleSegmentOfOnes(String S) {
        int i = 0, j = 0;
        boolean foundOne = false; // Flag to track if a '1' has been encountered

        while (j < S.length()) {
            if (S.charAt(j) == '1') {
                foundOne = true; // Mark '1' found
            } else if (foundOne) {
                return false; // Encountered '0' after finding '1', not a single segment
            }
            i++;
            j++;
        }
        return foundOne; // If we reach here, all '1's were encountered together (or there were no '1's)
    }
}
