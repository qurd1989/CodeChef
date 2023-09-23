package begginerLevel;

import java.util.Scanner;

public class FindTheDirection {

        public static void main(String[] args){



            Scanner s = new Scanner(System.in);
            int t = s.nextInt();
            while (t-- > 0) {
                int x = s.nextInt();

                if (x % 4 == 1) {
                    System.out.println("East");
                }else if (x % 4 ==2) {
                    System.out.println("South");
                }else if (x % 4 == 3) {
                    System.out.println("West");
                }else
                    System.out.println("North");
            }
        }
    }


