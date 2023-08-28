package begginerLevel;

import java.util.Scanner;

public class IsItAVowelOrConsonant {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);

        c = Character.toUpperCase(c);

        char arr[] = {'A', 'E', 'I', 'O', 'U'};

        boolean isVowel = false;
        for (int i = 0; i < arr.length; i++) {
            if (c == arr[i]) {
                isVowel = true;
                break;
            }
        }
        if (isVowel) {
            System.out.println("Vowel");
        }else
        System.out.println("Consonant");
    }
}
