package begginerLvevelSecondHalf;

import java.util.Scanner;

public class SingleOperationPart1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){

            String s = sc.next();
            char[] c = s.toCharArray();
            reverseString(c);
            System.out.println(new String(c));

        }
    }
    //Reverse String  method
    public static void reverseString(char[] s){
        int n = s.length;
        int i = 0;
        int j = n-1;
        while (i < j){
            char temp = s[i];
            s[i] = s[j];;
            s[j] = temp;
            i++;
            j--;
        }
    }
}
