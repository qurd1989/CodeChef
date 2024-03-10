package begginerLevel;

import java.util.Scanner;

public class PracticeProblemChefAndHappyString {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        for (int i = 0; i < t; i++) {
            String s = read.next();
            int j = 0;
            int flag = 0;
            // Update your code below this line to solve the problem
            // String s with lowercase alphabets
            int n = s.length();
            while (j < n){
                char c[] = s.toCharArray();
                if (isVowel(c[j])){
                    flag++;
                    if (flag >= 3) {
                        break;
                    }
                }else
                    flag = 0;
                j++;
            }
            if (flag >= 3){
                System.out.println("Happy");
            }else
                System.out.println("Sad");
        }
    }

        public static boolean isVowel(char c){
        return (c == 'a' || c == 'u' || c == 'i' || c == 'o' || c == 'e');
    }
}
