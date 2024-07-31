import java.util.Scanner;

public class prime {
    public static String primeCheck(int n) {
        if (n < 0) {
            return "negative numbers are not prime";
        }
        if (n <= 1) {
            return "not a prime number";
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return "not a prime number";
            }
        }
        return "prime number";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked:");
        int n = sc.nextInt();
        sc.close();
        System.out.println(primeCheck(n));
    }
}
