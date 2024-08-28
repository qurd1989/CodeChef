package begginerLvevelSecondHalf;

import java.util.Scanner;
public class ChefAndCardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            // there are two piles of cards with Chef and Morty, each pile has n cards, A and B
            //A belongs to Chef and B belongs to Morty
            int n = sc.nextInt();
            int chefCount = 0;
            int mortyCount = 0;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int chefSum = sumOfDigits(a);
                int mortySum = sumOfDigits(b);
                if (chefSum > mortySum) {
                    chefCount++;
                } else if (chefSum < mortySum) {
                    mortyCount++;
                } else {
                    chefCount++;
                    mortyCount++;
                }
            }
                if (chefCount > mortyCount) {
                    System.out.println("0" + " " + chefCount);
                } else if (chefCount < mortyCount) {
                    System.out.println("1" + " " + mortyCount);
                } else {
                    System.out.println("2" + " " + chefCount);
                }
            }
    }
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n >0) {
            int digit  = n % 10;
            sum += digit;
            n /= 10;
        }
        return sum;
    }
}