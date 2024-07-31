import java.util.Scanner;

public class EvenOddNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start of the range:");
        int start = sc.nextInt();
        System.out.println("Enter the end of the range:");
        int end = sc.nextInt();
        sc.close();

        System.out.println("Even numbers in the range:");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Odd numbers in the range:");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
