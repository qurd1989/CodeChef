package begginerLevel;

import java.util.Scanner;

public class Wordle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++){

            String firstString = sc.next();
            String secondString = sc.next();

            StringBuilder sb = new StringBuilder();

            for (int k = 0; k < firstString.length(); k++) {

                char  firstStringToChar = firstString.charAt(k);
                char  secondStringToChar = secondString.charAt(k);

                if (firstStringToChar == secondStringToChar) {
                    System.out.print("G");

                }else
                    System.out.print("B");
            }

            System.out.println();
        }
    }
}
