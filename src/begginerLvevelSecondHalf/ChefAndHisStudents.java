package begginerLvevelSecondHalf;

import java.util.Scanner;
import java.util.Stack;

public class ChefAndHisStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            System.out.println(talkingStudents(s));
        }
    }
    public static int talkingStudents(String s) {

        int n = s.length();
        int count = 0;
        int rightTalkingStudent = 0;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '*'){
                continue;
            }
            if (c == '<') {
                stack.push(c);
            } else if (c == '>') {
                if (!stack.isEmpty() && stack.peek() == '<') {
                    stack.pop();
                    count++;
                }
            }
        }
        return count;
    }
}
