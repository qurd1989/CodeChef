package begginerLvevelSecondHalf;

import java.util.Scanner;

public class ChefAndFeedback {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while (t--> 0){
            String binary = sc.next();

            boolean flag = false;
            for (int i = 1; i < binary.length()-1; i++){
                if (binary.charAt(i) != binary.charAt(i - 1) && binary.charAt(i) != binary.charAt(i + 1)){
                     flag = true;
                     break;
                }
            }
            if (flag){
                System.out.println("Bad");
            }else
                System.out.println("Good");
        }
    }
}
