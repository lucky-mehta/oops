//WAP TO PRINT Cube OF THE  NUMBERS.
import java.util.Scanner;
public class Cube {
   public static void main(String[] args) {
    int a,C;
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the number");
    a=obj.nextInt();
    C=a*a*a;
    System.out.println("Cube of the number is:"+C);
   } 
}
