// THIS PROGRAM IS MAKING BY ME.
import java.util.Scanner;
public class Break1
 {
public static void main(String[] args) {
    int n,i;
    Scanner obj=new Scanner(System.in);
    System.out.println("enter the value of n");
n=obj.nextInt();
    for(i=1;i<=n;i++)
    {
        if(i==(n/2))
        {
            break;
        }
        System.out.println("NUMBER IS:"+i);
    }
}    
}

