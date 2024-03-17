package begginerDSA;
import java.util.Scanner;
public class PracticeProblem_AlternateAdditons {

    public static void main(String[] args) {


        Scanner read = new Scanner(System.in);

        int t = read.nextInt();
        for(int i=0; i<t; i++)
        {
            int a = read.nextInt();
            int b = read.nextInt();

            int diff = b-a;


            if((diff)%3 == 0 || (diff)%3 == 1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
