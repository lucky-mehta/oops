
//WAP TO PRINT THE SUM OF 1 TO N ODD NUMBER.
import java.util.Scanner;
public class Fifth {
    public static void main(String[] args) { 
        int i=1,n, s=0;
        Scanner obj =new Scanner(System.in);
        System.out.println(" 1 to N sum of odd number");
        System.out.println("Enter the any number");
        n=obj.nextInt();
        while(i<=n)
        {
        s=s+i;
        i=i+2; 
        }
            System.out.println(" Sum of Odd Number is:"+s);
        
    }
    
}
