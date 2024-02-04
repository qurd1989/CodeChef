package begginerLvevelSecondHalf;

public class AkashAndFunction {
    public static void main(String[] args) {

    }
    public static int palinArray(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            if (isPalindrome(a[i])) {
                return 1;

            }
        }
        return 0;

    }
        private  static boolean isPalindrome(int num){
        String str = Integer.toString(num);
        int left = 0;
        int right = str.length()-1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
