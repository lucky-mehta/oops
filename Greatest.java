//WAP TO ENTER THREE NUMBER AND FIND THEIR GREATEST AMONG THEIR.
import java.util.Scanner;
public class Greatest {
    public static void main(String[] args) {
        int a,b,c;
        char greater;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the first number:");
        a=obj.nextInt();
        System.out.println("enter the second number: ");
        b=obj.nextInt();
        System.out.println("enter the third number:");
        c=obj.nextInt();
    if ((a>b)&&(a>c))
     {
        greater='a';
    }
    else if ((b>a)&&(b>c)) 
    {
        greater='b';
    }
else
{
    greater='c';
}
System.out.println("Greatest number is:"+greater);
    }
}
