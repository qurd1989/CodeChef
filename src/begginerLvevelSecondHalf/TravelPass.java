package begginerLvevelSecondHalf;

public class TravelPass {
    public static void main(String[] args) {


        int n = 15;
        System.out.println(sumOfPrimes(n));
    }
    public static int sumOfPrimes(int n) {
        int sum = 0;

        for (int i = 2; i <= n; i++){
            if (isPrime(i)){
                sum += i;
            }
        }
        return sum;
    }
    public static  boolean isPrime(int n){
        for (int i = 2; i<=Math.sqrt(n); i++){
            if (n % i== 0){
                return false;
            }
        }
        return true;
    }
}
