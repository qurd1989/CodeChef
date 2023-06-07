package begginerLevel;

import java.util.Scanner;

public class ProblemsInYourToDoList {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int t = sc.nextInt();
         int count = 0;
        while (t-- > 0) {

         int toDo = sc.nextInt();
         int arr[] = new int[toDo];

         for (int i = 0; i < arr.length; i++) {
             arr[i] = sc.nextInt();
             if (arr[i] >= 1000) {
                 count++;
             }
         }

            System.out.println(count);

        }
    }
}
