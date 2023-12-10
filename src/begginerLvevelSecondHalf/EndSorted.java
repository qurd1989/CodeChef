package begginerLvevelSecondHalf;

import java.util.Scanner;
import java.util.Stack;

public class EndSorted {
    public static void main(String[] args) {

        try(Scanner scn = new Scanner(System.in)) {
            int cases = scn.nextInt();

            while(cases-- > 0) {
                int l = scn.nextInt();
                int nums[] = new int[l];
                for(int i = 0; i < l; ++i) nums[i] = scn.nextInt();

                int p1 = 0;
                int p2 = 0;

                while(nums[p1++] != 1);
                while(nums[p2++] != l);

                int moves = p1 + (l - 1 - p2);
                if(p1 > p2)
                    --moves;

                System.out.println(moves);
            }
        }
    }
}
