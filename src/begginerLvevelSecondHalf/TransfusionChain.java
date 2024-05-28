package begginerLvevelSecondHalf;

import java.util.Scanner;

public class TransfusionChain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a = 0, b = 0, ab = 0, o = 0;
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                if (s.equals("A")) {
                    a++;
                } else if (s.equals("B")) {
                    b++;
                } else if (s.equals("O")) {
                    o++;
                } else {
                    ab++;
                }
            }
                int max = Math.max(a, b);
                max += ab + o;
                System.out.println(max);

//            for (int i =0 ; i < n; i++){
//                arr[i] = sc.nextInt();
//            }
//            int result[] = findMedian(arr);
//            for (int value  : result){
//                System.out.print(value);
//            }
        }
    }

    public int titleToNumber(String A) {
        int n = A.length();

        int ans = 0;
        for (int i = 0; i < n; i++) {
            int value = A.charAt(i) - 'A' + 1;
            ans = ans * 26 + value;
        }
        return ans;
    }

    public static int[] findMedian(int[] A) {

        int m = 0;
        int j = A.length;
        for (int i = 0; i <= j / 2; i++) {
            int temp = A[i];
            A[i] = A[j - i - 1];
            A[j - i - 1] = temp;
        }
        return A;
    }

}
