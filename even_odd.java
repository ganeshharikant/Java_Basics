import java.util.Scanner;

public class even_odd {
    public static void check(int number)
    {
        while(number>=2){
            String type=(number%2==0)?"even":"odd";
            System.out.println(type);

        }
       
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int number =sc.nextInt();
        check(number);
        
    }
    
}
