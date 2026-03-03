//WAP TO PRINT SUM,MUL,SUB OF TWO NUMBER USING CLASS AND OBJECT WITH TAKING INPUT.
import java.util.Scanner;
class A{
    int a,b;
    void getData(int x,int y)
    {
        a=x;
        b=y;
    }
    void sum()
    {
        int c=a+b;
        System.out.println("Addition is:"+c);
    }
    void mul()
    {
        int d=a*b;
        System.out.println("Multiplication is:"+d);
    }
    void sub()
    {
        int e=a-b;
        System.out.println("Subtraction is:"+e);
    }
}
public class Classobject3 {

    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1=obj.nextInt();
        System.out.println("Enter the second number:");
        int num2=obj.nextInt();
        A t=new A();
        t.getData(num1, num2);
        t.sum();
        t.mul();
        t.sub();
    }
}
