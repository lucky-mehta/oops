//WAP TO PRINT 1 TO N NATURAL NUMBER.
import java.util.Scanner;
public class Third {
    public static void main(String[] args) {
        int i=1,n;
        Scanner obj =new Scanner(System.in);
        System.out.println(" 1 to N natural number");
        System.out.println("Enter the any number");
        n=obj.nextInt();
        while(i<=n)
        {
            System.out.println("Number is:"+i);
            i=i+1;
        }
    }
    
}
