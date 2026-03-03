//WAP TO PRINT EVEN AND ODD NUMBER.
import java.util.Scanner;
public class Evenodd {
    public static void main(String[] args) {
        int n;
        Scanner obj= new Scanner(System.in);
        System.out.println("enter the any number");
        n=obj.nextInt();
        if(n%2==0)
        {
            System.out.println("even number");
        }
        else
        {
            System.out.println("odd number");
        }
    }
}
