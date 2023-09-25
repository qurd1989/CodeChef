package begginerLevel;

import java.util.Scanner;

public class UtkarshAndPacementTests {
    public static void main(String[] args) {

        Scanner tokenizer = new Scanner(System.in);
        int t = tokenizer.nextInt();
        while (t-- > 0) {
            char first = tokenizer.next().charAt(0);
            char second = tokenizer.next().charAt(0);
            char third = tokenizer.next().charAt(0);
            char x = tokenizer.next().charAt(0);
            char y = tokenizer.next().charAt(0);
            if (first == x){
                System.out.println(x);
            }else if (first == y) {
                System.out.println(y);
            }else if (second == x) {
                System.out.println(x);
            }else
                System.out.println(y);
        }
    }
}
