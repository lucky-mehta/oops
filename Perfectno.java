//WAP TO CHECK WETHER NUMBER IS PERFECT OR NOT.
import java.util.Scanner;
public class Perfectno {
    public static void main(String[] args) {
        int i,n,s=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER THE ANY NUMBER");
        n=obj.nextInt();
        for (i=1;i<=(n/2);i++)
         {
        if((n%i)==0)    
    {
        s=s+i;
    }    
    }
    if (s==n&&n!=0)
     {
    System.out.println("NUMBER IS PERFECT NUMBER");    
    }
    else
    {
        System.out.println("NUMBER IS NOT PERFECT NUMBER");
    }
    }
}
