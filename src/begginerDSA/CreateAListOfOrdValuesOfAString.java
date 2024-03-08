package begginerDSA;

import java.util.Scanner;

public class CreateAListOfOrdValuesOfAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t--> 0){
            String s = sc.next();
            for (int i = 0; i < s.length(); i++){
                int ascii = s.charAt(i);
                System.out.println(ascii);
            }
        }
    }
}
