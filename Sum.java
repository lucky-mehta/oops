//WAP TO PRINT SUM OF TWO NUMBERS.
import java.util.Scanner;
public class Sum {
   public static void main(String[] args) {
    int a,b,c;
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the first number");
    a=obj.nextInt();
    System.out.println("enter the second number");
    b=obj.nextInt();
    c=a+b;
    System.out.println("Sum of two number is:"+c);
   } 
}
