package begginerLvevelSecondHalf;

import java.util.Scanner;

public class TCSExamination {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
           int d = 3;
           int s = 3;

            int dragon[] = new int[d];
            int sloth[] = new int[s];
            int dragonSum = 0;
            int slothSum = 0;
            for (int i = 0; i < d; i++) {
                dragon[i] = sc.nextInt();
                dragonSum += dragon[i];
            }
            for (int i = 0; i < s; i++) {
                sloth[i] = sc.nextInt();
                slothSum += sloth[i];
            }

            if (dragonSum > slothSum) {
                System.out.println("Dragon");
            } else if (dragonSum < slothSum) {
                System.out.println("Sloth");
            } else {

                if (dragon[0] > sloth[0]) {
                    System.out.println("Dragon");
                } else if (dragon[0] < sloth[0]) {
                    System.out.println("Sloth");
                } else {
                    if (dragon[1] > sloth[1]) {
                        System.out.println("Dragon");
                    } else if (dragon[1] < sloth[1]) {
                        System.out.println("Sloth");
                    } else
                        System.out.println("Tie");
                }
            }
        }
    }

}
