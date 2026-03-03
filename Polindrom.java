//WAP TO CHECK WHETHER NUMBER IS POLINDROM OR NOT.
import java.util.Scanner;
public class Polindrom {
    public static void main(String[] args) {
        int n,i,rev=0;
        Scanner obj =new Scanner(System.in);
        System.out.println("ENTER THE ANY NUMBER");
        n=obj.nextInt();
        int p=n;
        while (n!=0)
         { 
        i=n%10;
rev=rev*10+i;
n=n/10;
        }
        if(rev==p)
        {
    System.out.println("number is poindrom ");
    }
else
    {
        System.out.println(" number is not polindrom");
    }
}
}