package begginerLevel;

import java.util.Scanner;

public class ChefAndHappyString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0){
            String s = sc.next();
            boolean result = isSolve(s);

            if (result){
                System.out.println("Happy");
            }else
                System.out.println("Sad");

        }
    }

    public static  boolean isSolve(String s ){

        int n = s.length();
        for (int i =0; i <n; i++){
            if (isVowel(s.charAt(i)) && isVowel(s.charAt(i + 1)) && isVowel(s.charAt(i +2)) ){
                return true;
            }
        }
        return false;
    }
    public static boolean isVowel(char c ){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

}
