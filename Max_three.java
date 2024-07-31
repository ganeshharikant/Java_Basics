import java.util.Scanner;

public class Max_three {
    public static void main(String[] args) {
          Scanner sc =new Scanner(System.in);
          System.out.println("Enter three numbers a, b, and c: ");         int a=sc.nextInt();
         int b=sc.nextInt();
         int c=sc.nextInt();
         int max=(a>=b && a>=c) ? a:(b>=c? b:c);
         System.out.println("The largest number is: " + max);
         


    }
    
}
