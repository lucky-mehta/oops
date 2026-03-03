//WAP TO PRINT SUM,MUL AND SUB OF TWO NUMBER USING MULTIPLE CLASS TAKING INPUT

import java.util.Scanner;

class F
{
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
}
class G{
    int p,q;
     void getData(int m,int n)
    {
        p=m;
        q=n;
    }
    void mul()
    {
        int o=p*q;
        System.out.println("Multiplication is:"+o);
    }
}
class H {
    int u,v;
     void getData(int r,int s)
    {
        u=r;
        v=s;
    }
    void sub()
    {
     int   w=u-v;
        System.out.println("Subtraction is:"+w);
    }
}
public class Multipleclass4 {

    public static void main(String[] args) {
        
    Scanner obj=new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=obj.nextInt();
        System.out.println("Enter the second number");
        int num2=obj.nextInt();
        F t1 =new F();
        t1.getData(num1,num2);
        t1.sum();
        G t2 =new G();
        t2.getData(num1,num2);
        t2.mul();
        H t3=new H();
        t3.getData(num1,num2);
        t3.sub();
    }
}
