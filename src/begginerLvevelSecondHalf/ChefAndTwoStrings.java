package begginerLvevelSecondHalf;

import java.util.Scanner;

public class ChefAndTwoStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            String s1 = sc.next();
            String s2 = sc.next();
            chefAndTwoStrings(s1, s2);

        }
    }
    public static void chefAndTwoStrings(String s1, String s2) {
        int maxDiff = 0;
        int minDiff = 0;
        int n = s1.length();
        for(int i = 0; i < n; i++){
            // ? is unknown character in the string
            // if both characters are same dont count minDiff but maxDiff
            if(s1.charAt(i) != s2.charAt(i) && s1.charAt(i) != '?' && s2.charAt(i) != '?'){
                minDiff++;
                maxDiff++;
            }else if((s1.charAt(i) == '?' && s2.charAt(i) != '?') || (s1.charAt(i) != '?' && s2.charAt(i) == '?') || (s1.charAt(i) == '?' && s2.charAt(i) == '?')){
                maxDiff++;
            }
        }
        System.out.println(minDiff + " " + maxDiff);
    }
}
