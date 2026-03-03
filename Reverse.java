//WAP TO PRINT REVERSE NUMBER.
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        int n,i,rev=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the any number");
        n=obj.nextInt();
        while(n!=0)
        {
            i=n%10;
            rev=rev*10+i;
            n=n/10;
        }
        System.out.println("Reverse number is:"+rev);
    }
}
    
