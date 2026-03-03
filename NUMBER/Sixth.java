
//WAP TO PRINT THE SUM OF 1 TO N NATURAL NUMBER.
import java.util.Scanner;
public class Sixth {
    public static void main(String[] args) { 
        int i=1,n, s=0;
        Scanner obj =new Scanner(System.in);
        System.out.println(" 1 to N sum of natural number");
        System.out.println("Enter the any number");
        n=obj.nextInt();
        while(i<=n)
        {
        s=s+i;
        i=i+1; 
        }
            System.out.println("Sum of Natural Number is:"+s);
        
    }
    
}

