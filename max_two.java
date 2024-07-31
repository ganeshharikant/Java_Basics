
import java.util.Scanner;



public class max_two {
    
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
         System.out.println("enter the two numbers a and b ");
         int a=sc.nextInt();
         int b=sc.nextInt();
         if(a>b){
            System.out.println( "a is largest"  + " " +  a)  ;
         }
         else{
System.out.println( "b is largest" + " " + b);
         }


    }
}
