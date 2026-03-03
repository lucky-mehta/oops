
//WAP TO PRINT 1 TO N ODD NUMBER.
import java.util.Scanner;
public class Fourth {
    public static void main(String[] args) {
        int i=1,n;
        Scanner obj =new Scanner(System.in);
        System.out.println(" 1 to N odd number");
        System.out.println("Enter the any number");
        n=obj.nextInt();
        while(i<=n)
        {
            System.out.println("Number is:"+i);
            i=i+2;
        }
    }
    
}
