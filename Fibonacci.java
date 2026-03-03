// WAP TO  PRINT THE FIBONACCI SERIES IN N NUMBER.
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int a=0,b=1,c,i,n;
        Scanner obj = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF n");
        n=obj.nextInt();
        for(i=1;i<=n;i++)
        {
            System.out.println(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}
