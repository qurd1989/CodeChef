package begginerLvevelSecondHalf;

import java.util.Scanner;

public class MathisonAndPangrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0){
          int arr[] = new int[26];
          for(int i = 0; i < 26; i++){
              arr[i] = sc.nextInt();
          }
          String s = sc.next();
            int sum = 0;
            for(int i = 'a'; i <= 'z'; i++){
                if(s.indexOf(i) == -1){
                    sum += arr[i - 'a'];
                }
            }
            System.out.println(sum);
        }
    }
}
