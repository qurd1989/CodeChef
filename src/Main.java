import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       char s[] = new char[55];
       for (int i =0; i<n; i++){
           s[i]= sc.next().charAt(0);
       }

        int R = 0;
        int B = 0;
        int G = 0;
        for (int i = 0; i <n; i++) {
            if (s[i] == 'R' && s[i + 1] == 'R'){
                R++;
            }
            else  if (s[i] == 'B' && s[i + 1] == 'B'){
                B++;
            }
            else if (s[i] == 'G' && s[i + 1] == 'G'){
                G++;
            }
        }
        System.out.println(R+B+G);
    }
}