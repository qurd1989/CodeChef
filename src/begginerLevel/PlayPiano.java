package begginerLevel;

import java.util.Scanner;

public class PlayPiano {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        read.nextLine();  // Consume the newline character after reading t
        while (t-- > 0) {
            String x = read.nextLine();
            boolean hasConsecutiveChars = false;
            for (int i = 0; i < x.length()- 1; i = i+2) {
                if (x.charAt(i) == x.charAt(i + 1)) {
                    hasConsecutiveChars = true;
                    break;
                }
            }
            if (hasConsecutiveChars) {
                System.out.println("no");
            } else {
                System.out.println("yes");
            }
        }
    }
}


