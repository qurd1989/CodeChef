package begginerLevel;

import java.util.Scanner;

public class practiceProblemWordle {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        for(int i=0; i<n; i++)
        {
            String s = read.next();
            String t = read.next();
            String m = "";
            for (int j = 0; j < s.length(); j++){
                if (s.charAt(j) == t.charAt(j)){
                    m += "G";
                }else
                    m += "B";
            }
            System.out.println(m);
        }
    }
}
