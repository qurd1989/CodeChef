package begginerLvevelSecondHalf;

import java.util.Scanner;

public class MathisonAndPangrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0){
            char[] c = {'a', 'b'};
            for (int i =0; i< c.length; i++){
                if (c[i] == -1){
                    System.out.println(1);
                }else
                    System.out.println(c[i]);
            }

        }
    }
}
