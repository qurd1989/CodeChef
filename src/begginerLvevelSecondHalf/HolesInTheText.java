package begginerLvevelSecondHalf;

import java.util.Scanner;

public class HolesInTheText {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0){
            String s = sc.next();
            char c[] = s.toCharArray();
            int count = 0;
            for (int i = 0; i < s.length();  i++){
                if (c[i] == 'A' || c[i] == 'D' || c[i] == 'O' || c[i] == 'R' || c[i] == 'P') {
                    count++;
                }else if (c[i] == 'B'){
                    count +=2;
                }
            }
            System.out.println(count);
        }
    }
}
