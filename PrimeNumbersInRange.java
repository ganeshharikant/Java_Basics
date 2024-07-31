import java.util.Scanner;

public class PrimeNumbersInRange {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start of the range:");
        int start = sc.nextInt();
        System.out.println("Enter the end of the range:");
        int end = sc.nextInt();
        sc.close();

        System.out.println("Prime numbers in the range:");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
