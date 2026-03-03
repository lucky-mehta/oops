//WAP TO PRINT SUM MUL AND SUB OF TWO NUMBER USING MULTILAVEL INHERITACE.

import java.util.Scanner;

class Add{
    int a,b;
    void getData(int x,int y){
        a=x;
        b=y;
    }
    void sum()
    {
        int c=a+b;
        System.out.println("Addition is:"+c);
    }
}
class Cross extends Add{
    void mul()
    {
        int d=a*b;
        System.out.println("Multiplication is:"+d);
    }
}
class Minus extends Cross {
    void sub()
    {
     int   e=a-b;
        System.out.println("Subtraction is:"+e);
    }
}
public class Multilevelinheritance2 {

    public static void main(String[] args) {
      Scanner obj=new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER");
        int num1=obj.nextInt();
        System.out.println("ENTER THE SECOND NUMBER");
        int num2=obj.nextInt();
        Minus t=new Minus();
        t. getData(num1, num2);
        t.sum();
        t.mul();
        t.sub();
    }
}